clear | Out-File .\usuario.txt
foreach($veces in 1..2){
$nombre = Read-Host "Dime tu nombre"
$calle = Read-Host "Dime tu calle"
$codigoPostal = Read-Host "Dime tu código postal"
[Int]$edad1 = Read-Host "Dime tu edad"
$nombre+","+$calle+","+$codigoPostal+","+$edad1| Out-File .\usuario.txt -Append
}


$suma = 0


$acumulador = 0
foreach ($datos in Get-Content .\usuario.txt){
    
    
    $edad = $datos.Split(",")[3]
    $suma = $suma + $edad 

    

}

$suma






