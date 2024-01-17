public class Prueba {
    public static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Reverse each word
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWord(words[i]);
        }

        // Join the reversed words back into a sentence
        return String.join(" ", words);
    }

    private static String reverseWord(String word) {
        // Convert the word to a char array
        char[] charArray = word.toCharArray();

        // Reverse the char array
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Convert the char array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(reverseWords("            ")); // Output: "sihT si na !elpmaxe"
        System.out.println(reverseWords("       "));      // Output: "elbuod  secaps"
    }
}