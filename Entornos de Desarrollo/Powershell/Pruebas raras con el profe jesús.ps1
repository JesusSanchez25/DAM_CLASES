$fecha = Get-Date
$fecha.AddDays(-1)

foreach($dia in -1..25)
{
    $fecha.AddDays($dia)
}




