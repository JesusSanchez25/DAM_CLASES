'''$palabra = "sugus"ç

[String]$parte1 = foreach($posicion in 0..4)
{
    $palabra[$posicion]
}

[String]$parte2 = foreach($posicion in 4..0)
{
    $palabra[$posicion]
}

$parte1 -join "" -eq $parte2 -join "" '''

'''(copiado sin más)'''