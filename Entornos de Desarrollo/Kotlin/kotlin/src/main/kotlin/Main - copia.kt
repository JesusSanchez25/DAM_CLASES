

fun main() {
    val codigo = import java.io.IOException

    public class Codigo {
        public static void main (String[] args) throws IOException{
            ProcessBuilder pb = new ProcessBuilder("notepad2");
            pb.start();
        }


var contador = 0;
    codigo.lines().forEach{ linea ->
        if(linea.trim()[0])
        {
                when(linea.trim()[0])
                {
                    '{' -> contador++
                    '}' -> contador--

                }


        }  
    }

val resultado = if (contador != 0)       
{
    "código incorrecto"
} else {
    "código correcto"
}

    }

println(resultado)

}