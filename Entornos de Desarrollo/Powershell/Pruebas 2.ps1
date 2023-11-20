[String]$palabra = "sugus"
$palabra


foreach($incremento in 0..4){
$palabra[0+$incremento] -eq$palabra[4-$incremento]


} 