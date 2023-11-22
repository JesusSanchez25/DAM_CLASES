#Crear un formulario, añadir una etiqueta, un botón y una caja de texto
#Formulario
$Form = New-Object System.Windows.Forms.Form
$Form.Text="Formulario"
$Form.Size=New-Object System.Drawing.Size(500,500)
$Form.StartPosition="CenterScreen"

#Texto
$Texto=New-Object System.Windows.Forms.TextBox
$Texto.Size=New-Object System.Drawing.Size(280,1750)
$Texto.AutoSize
$Texto.Text=""
$Texto.Location=New-Object System.Drawing.Size(95,50)


$antes







#Botón
$Button=New-Object System.Windows.Forms.Button
$Button.Size=New-Object System.Drawing.Size(65,60)
$Button.Text="1"
$Button.Location=New-Object System.Drawing.Size(65,120)

$Button2=New-Object System.Windows.Forms.Button
$Button2.Size=New-Object System.Drawing.Size(65,60)
$Button2.Text="2"
$Button2.Location=New-Object System.Drawing.Size(165,120)

$Button3=New-Object System.Windows.Forms.Button
$Button3.Size=New-Object System.Drawing.Size(65,60)
$Button3.Text="3"
$Button3.Location=New-Object System.Drawing.Size(265,120)


$Button4=New-Object System.Windows.Forms.Button
$Button4.Size=New-Object System.Drawing.Size(65,60)
$Button4.Text="4"
$Button4.Location=New-Object System.Drawing.Size(65,220)

$Button5=New-Object System.Windows.Forms.Button
$Button5.Size=New-Object System.Drawing.Size(65,60)
$Button5.Text="5"
$Button5.Location=New-Object System.Drawing.Size(165,220)

$Button6=New-Object System.Windows.Forms.Button
$Button6.Size=New-Object System.Drawing.Size(65,60)
$Button6.Text="6"
$Button6.Location=New-Object System.Drawing.Size(265,220)

$Button7=New-Object System.Windows.Forms.Button
$Button7.Size=New-Object System.Drawing.Size(65,60)
$Button7.Text="7"
$Button7.Location=New-Object System.Drawing.Size(65,320)

$Button8=New-Object System.Windows.Forms.Button
$Button8.Size=New-Object System.Drawing.Size(65,60)
$Button8.Text="8"
$Button8.Location=New-Object System.Drawing.Size(165,320)

$Button9=New-Object System.Windows.Forms.Button
$Button9.Size=New-Object System.Drawing.Size(65,60)
$Button9.Text="9"
$Button9.Location=New-Object System.Drawing.Size(265,320)


$ButtonMas=New-Object System.Windows.Forms.Button
$ButtonMas.Size=New-Object System.Drawing.Size(65,60)
$ButtonMas.Text="+"
$ButtonMas.Location=New-Object System.Drawing.Size(365,120)

$ButtonMenos=New-Object System.Windows.Forms.Button
$ButtonMenos.Size=New-Object System.Drawing.Size(65,60)
$ButtonMenos.Text="-"
$ButtonMenos.Location=New-Object System.Drawing.Size(365,220)

$ButtonPor=New-Object System.Windows.Forms.Button
$ButtonPor.Size=New-Object System.Drawing.Size(65,60)
$ButtonPor.Text="x"
$ButtonPor.Location=New-Object System.Drawing.Size(365,320)













$Button.add_Click{
 $Texto.text += 1
}
$Button2.add_Click{
 $Texto.text += 2
}
$Button3.add_Click{
 $Texto.text += 3
}
$Button4.add_Click{
 $Texto.text += 4
}
$Button5.add_Click{
 $Texto.text += 5
}
$Button6.add_Click{
 $Texto.text += 6
}
$Button7.add_Click{
 $Texto.text += 7
}
$Button8.add_Click{
 $Texto.text += 8
}
$Button9.add_Click{
 $Texto.text += 9
}
$ButtonMas.add_Click{
 $Texto.AppendText("+")
}
$ButtonMenos.add_Click{
 $Texto.text += "-"
}
$ButtonPor.add_Click{
 $Texto.text += "x"
}




















#Añadir botón
$Form.Controls.Add($Button)
$Form.Controls.Add($Button2)
$Form.Controls.Add($Button3)
$Form.Controls.Add($Button4)
$Form.Controls.Add($Button5)
$Form.Controls.Add($Button6)
$Form.Controls.Add($Button7)
$Form.Controls.Add($Button8)
$Form.Controls.Add($Button9)
$Form.Controls.Add($ButtonMas)
$Form.Controls.Add($ButtonMenos)
$Form.Controls.Add($ButtonPor)
$Form.Controls.Add($Texto)

$Form.ShowDialog()