import java.util.ArrayList;

class Solution {

            public static void main(String[] args) {

                System.out.println(camelCase("camion Neta"));
            }
            public static String camelCase(String input) {
                String input2 = "";
                char[] array = input.toCharArray();


                for (char letra : array) {
                    if (Character.isUpperCase(letra)){
                        input = input.replace(String.valueOf(letra), " " + letra);
                    }
                }

                return input;

            }
        }

