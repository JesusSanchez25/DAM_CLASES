import java.util.ArrayList;
import java.util.Arrays;

class Solution {

            public static void main(String[] args) {

                System.out.println(camelCase("<eye Other [Young Thing Come Last Different Number] Year>"));
            }
            public static String camelCase(String input) {
                String input2 = "";
                char[] array = input.toCharArray();

                for (int i = 1; i < array.length; i++) {
                    if (Character.isUpperCase(array[i]) && Character.isLowerCase(array[i-1])){
                        input = input.replace(String.valueOf(array[i]), " " + array[i]);
                    }
                }

                return input;

            }
        }

