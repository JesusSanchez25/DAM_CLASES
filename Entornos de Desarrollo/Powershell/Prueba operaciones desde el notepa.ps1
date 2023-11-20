$suma, $edad = 0

foreach ($linea in Get-Content .\usuario.txt)
{
    if($linea.Split(",")[0] -eq "suma"){
    $suma += $linea.Split(",")[1]}
    elseif ($linea.Split(",")[0] -eq "resta"){
    $suma -= $linea.Split(",")[1]}
    elseif ($linea.Split(",")[0] -eq "multi"){
    $suma *= $linea.Split(",")[1]}
    

}
$suma