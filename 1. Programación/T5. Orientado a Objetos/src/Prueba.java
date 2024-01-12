public class Prueba
{
    public static String reverseWords(final String original)
    {
        String[] palabras = original.replaceAll(" ", "").split("ñ");
        String inversedWord = "";
        for (String item : palabras) {
            for (int i = item.length()-1; i >= 0; i--){
                inversedWord += item.toCharArray()[i];
            }
            if (item.equals(palabras[palabras.length-1])){
                return inversedWord;
            }
            inversedWord += " ";
        }
        return inversedWord;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
    }
}