#Crear un formulario, añadir una etiqueta, dos botones y una caja de texto
#Funcionalidad para el formulario:
#Pulsar la tecla Enter almacena en una variable el contenido de la caja de texto y se muestra
#Pulsar la tecla Escape sale del formulario
 
#Formulario
$Form = New-Object System.Windows.Forms.Form
$Form.Text="Formulario"
$Form.Size=New-Object System.Drawing.Size(500,500)
$Form.StartPosition="CenterScreen"

#imagen
$pictureBox = New-Object System.Windows.Forms.PictureBox
$pictureBox.Location = New-Object System.Drawing.Point(100, 450)
$imagen = [System.Drawing.Image]::FromFile("C:\Users\magol\1. DAM\Entornos de Desarrollo\Automatización\robotito.jpg")
$pictureBox.Image = $imagen


 
#Etiqueta
$Label=New-Object System.Windows.Forms.Label
$Label.Text="Usuario"
$Label.AutoSize=$True
$Label.Location=New-Object System.Drawing.Size(100,160)

#Etiqueta
$Label2=New-Object System.Windows.Forms.Label
$Label2.Text="Contraseña"
$Label2.AutoSize=$True
$Label2.Location=New-Object System.Drawing.Size(100,220)
 
#Caja de texto
$TextBox = New-Object System.Windows.Forms.TextBox
$TextBox.Location = New-Object System.Drawing.Size(100,180)
$TextBox.Size = New-Object System.Drawing.Size(260,20)

#Caja de texto
$TextBox2 = New-Object System.Windows.Forms.TextBox
$TextBox2.Location = New-Object System.Drawing.Size(100,240)
$TextBox2.Size = New-Object System.Drawing.Size(260,20)

 
#Botón1
$Button = New-Object Windows.Forms.Button
$Button.Location = New-Object Drawing.Point(100,270)
$Button.Size = New-Object Drawing.Size(75,33)
$Button.Text = "Log in"



$Button.Add_Click({
    # Acción cuando se hace clic en el botón
    $text = $textBox.Text
    $text2 = $textBox2.Text

    $text | Out-File -FilePath "C:\Users\magol\1. DAM\Entornos de Desarrollo\Automatización\Contraseñas.txt" -Append
    $text2 | Out-File -FilePath "C:\Users\magol\1. DAM\Entornos de Desarrollo\Automatización\Contraseñas.txt" -Append

    $textBox.Clear()
    $textBox2.Clear()

})

 
#Botón2
$Button2=New-Object System.Windows.Forms.Button
$Button2.Size=New-Object System.Drawing.Size(75,33)
$Button2.Text="Cancel"
$Button2.Location=New-Object System.Drawing.Size(220,270)
 
#Funcionalidad para el formulario:
#Pulsar la tecla Enter almacena en una variable el contenido de la caja de texto y se muestra
#Pulsar la tecla Escape sale del formulario
$Form.KeyPreview = $True
$Form.Add_KeyDown({if ($_.KeyCode -eq "Enter"){$Var=$TextBox.Text;Write-Host $Var;$Form.Close()}})
$Form.Add_KeyDown({if ($_.KeyCode -eq "Escape"){$Form.Close()}})
 
#Funcionalidad para el botón:
#Pulsar Enter almacena en una variable el contenido de la caja de texto y se muestra
#Pulsar Escape sale del formulario

$Button2.Add_Click({$Form.Close()})
 
#Añadir etiqueta
$Form.Controls.Add($Label)
$Form.Controls.Add($Label2)
 
#Añadir botones
$Form.Controls.Add($Button)
$Form.Controls.Add($Button2)
 
#Añadir caja de texto
$Form.Controls.Add($TextBox)
$Form.Controls.Add($TextBox2)
$Form.Controls.Add($pictureBox)





 
$Form.ShowDialog()
