$MouseEventSig=@'
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
'@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name "MouseEventWinApi" -passThru

[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(10,1200)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)


Start-Sleep -Seconds 1
[System.Windows.Forms.SendKeys]::SendWait("Paint")
[System.Windows.Forms.SendKeys]::SendWait("{enter}")




Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(675,220)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)

Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(675,520)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)


Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(475,720)
$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)






Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(255,200)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)

Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(735,220)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)

Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(675,520)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)

Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(475,420)

$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)


Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(500,230)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)



Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(1100,230)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)

Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(625,500)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)


Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(500,230)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)



Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(1100,240)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)




[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(675, 220)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)




Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(735, 220)

$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)

# Dibujar el tejado de la casa pequeña (triángulo)
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(735, 220)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)

Start-Sleep -Seconds 1
[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(705, 170)  # Coordenadas ajustadas para el vértice del triángulo

$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)




