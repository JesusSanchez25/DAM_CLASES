$palabra = "sugus"
$parte1 = foreach($posicion in 0..4){

    $palabra[$posicion]

}
$parte2 = foreach($posicion in 0..4){

    $palabra[4-$posicion]
}

[Boolean]$parte1 -eq $parte2
$palabra.Length