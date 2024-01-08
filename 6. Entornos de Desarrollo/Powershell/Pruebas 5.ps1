[String]$palabra = "Alalala"

[String]$palabra[0..($palabra.Length-1)] -eq [String]$palabra[($palabra.Length-1)..0]