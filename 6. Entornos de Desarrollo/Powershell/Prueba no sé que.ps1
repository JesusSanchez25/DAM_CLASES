

} while ($continuar -eq 's'){

  clear
    write-Host "---------"
    $nombre = Read-Host "Dime tu nombre"
    clear

    write-Host "---------"
    $calle = Read-Host "Dime tu calle"
    clear
    write-Host "---------"
    $edad = Read-Host "dime tu edad"


    $nombre+","+$calle+","+$edad | Out-File usuario.txt -Append

    $continuar = Read-Host "Quieres continuar?"


}
