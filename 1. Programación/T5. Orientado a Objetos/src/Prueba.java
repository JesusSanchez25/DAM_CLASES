public class Prueba
{
    public static String reverseWords(final String original)
    {
        String[] palabras = original.split(" ");
















        String inversedWord = "";
        for (String item : palabras) {
            for (int i = item.length()-1; i >= 0; i--){
                inversedWord += item.toCharArray()[i];
            }

            inversedWord += " ";
        }
        return inversedWord;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Me comí una salchipapa y que cosa tan sabrosa."));
    }
}