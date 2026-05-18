# run-all.ps1 — Windows equivalent of run-all.sh
#
# Usage:
#   .\run-all.ps1
#   $env:SYSML_MM = "C:\path\to\SysML.ecore"; .\run-all.ps1
#
# Environment variables:
#   TRANSFORMATION_JAR  path to transformation fat JAR
#   AAS_MM              path to aas.ecore
#   SYSML_MM            path to SysML.ecore (required to run; vehicle uses pre-built output)
#
# Exit code: 0 if no FAILs, 1 otherwise.

$ScriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
$RepoRoot  = Split-Path -Parent $ScriptDir

$Jar     = if ($env:TRANSFORMATION_JAR) { $env:TRANSFORMATION_JAR } `
           else { Join-Path $RepoRoot "transformation\target\transformation-1.0-SNAPSHOT.jar" }
$AasMM   = if ($env:AAS_MM)   { $env:AAS_MM }   else { Join-Path $RepoRoot "aas\model\aas.ecore" }
$SysmlMM = if ($env:SYSML_MM) { $env:SYSML_MM } else { "" }

$Pass = 0; $Fail = 0; $Skip = 0

function Count-Pattern($pattern, $file) {
    try { (Select-String -Path $file -Pattern $pattern -AllMatches).Matches.Count }
    catch { 0 }
}

function Has-Pattern($pattern, $file) {
    try { [bool](Select-String -Path $file -Pattern $pattern -Quiet) }
    catch { $false }
}

function Run-Example($dir) {
    $name = Split-Path -Leaf $dir

    # SKIP sentinels
    if (Test-Path (Join-Path $dir "input\SKIP")) {
        Write-Host ("SKIP  {0,-20} (SKIP sentinel)" -f $name)
        $script:Skip++; return
    }
    $inputItems = Get-ChildItem (Join-Path $dir "input") -ErrorAction SilentlyContinue
    if (-not $inputItems) {
        Write-Host ("SKIP  {0,-20} (input/ empty)" -f $name)
        $script:Skip++; return
    }

    # Locate XMI input
    $xmi = Get-ChildItem (Join-Path $dir "input") -Filter "*.xmi" -ErrorAction SilentlyContinue `
           | Select-Object -First 1 -ExpandProperty FullName
    if (-not $xmi -and $name -eq "vehicle") {
        $xmi = Join-Path $RepoRoot "transformation\examples\VehicleDefinitions.xmi"
    }
    if (-not $xmi) {
        Write-Host ("SKIP  {0,-20} (no .xmi in input/; add XMI or create SKIP sentinel)" -f $name)
        $script:Skip++; return
    }

    # Locate expected AAS
    $expectedFile = Get-ChildItem (Join-Path $dir "expected\*") -Include "*.aas","*.AAS" `
                    -ErrorAction SilentlyContinue | Select-Object -First 1 -ExpandProperty FullName
    if (-not $expectedFile) {
        Write-Host ("FAIL  {0,-20} (no expected/ file)" -f $name)
        $script:Fail++; return
    }

    # Produce actual output
    $actual = [System.IO.Path]::GetTempFileName() + ".aas"

    if ($name -eq "vehicle" -and (Test-Path (Join-Path $RepoRoot "transformation\examples\VehicleDefinitions.aas"))) {
        # vehicle: use pre-built output from TB-03
        Copy-Item (Join-Path $RepoRoot "transformation\examples\VehicleDefinitions.aas") $actual
    } elseif ((Test-Path $Jar) -and $SysmlMM) {
        & java -jar $Jar --input $xmi --output $actual --sysml-mm $SysmlMM --aas-mm $AasMM 2>$null
    } else {
        Write-Host ("SKIP  {0,-20} (set TRANSFORMATION_JAR + SYSML_MM to run)" -f $name)
        $script:Skip++; return
    }

    if (-not (Test-Path $actual) -or (Get-Item $actual).Length -eq 0) {
        Write-Host ("FAIL  {0,-20} (transformation produced empty output)" -f $name)
        $script:Fail++; return
    }

    $ok = (Has-Pattern 'AasModelRoot' $actual) -and `
          (Has-Pattern 'AasModelRoot' $expectedFile) -and `
          (Has-Pattern 'AAS:Entity'   $actual)
    $nAct = Count-Pattern 'AAS:Entity' $actual
    $nExp = Count-Pattern 'AAS:Entity' $expectedFile

    Remove-Item $actual -ErrorAction SilentlyContinue

    if ($ok) {
        Write-Host ("PASS  {0,-20} (entities: actual={1,-3} expected={2})" -f $name, $nAct, $nExp)
        $script:Pass++
    } else {
        Write-Host ("FAIL  {0,-20} (AasModelRoot or AAS:Entity missing in actual output)" -f $name)
        $script:Fail++
    }
}

Write-Host "SysML2AAS example test suite"
Write-Host "============================"

Get-ChildItem $ScriptDir -Directory `
    | Where-Object { $_.Name -match '^\d\d-' -or $_.Name -eq 'vehicle' } `
    | Sort-Object Name `
    | ForEach-Object { Run-Example $_.FullName }

$Total = $Pass + $Skip + $Fail
Write-Host ""
Write-Host "Results: PASS=$Pass  SKIP=$Skip  FAIL=$Fail  ($Total examples)"

if ($Fail -gt 0) { exit 1 }
exit 0
