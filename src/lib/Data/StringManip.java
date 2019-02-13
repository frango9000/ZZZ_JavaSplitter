package lib.Data;

import lib.Misc.Asserts;

public abstract class StringManip {

    public static int countLetters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static String formatString(int number, int width) {
        return String.format("%0" + width + "d", number);
    }

    public static String sort(String string) {
        StringBuilder unsorted = new StringBuilder(string);
        StringBuilder sorted = new StringBuilder();
        for (int i = 0; i < unsorted.length(); i++) {
            char lowestChar = unsorted.charAt(i);
            boolean uppercase = CharManip.isUpperCase(unsorted.charAt(i));
            for (int j = i + 1; j < unsorted.length(); j++) {
                if (Character.toUpperCase(unsorted.charAt(i)) > Character.toUpperCase(unsorted.charAt(j))) {
                    lowestChar = unsorted.charAt(j);
                    uppercase = CharManip.isUpperCase(lowestChar);
                    unsorted.setCharAt(j, unsorted.charAt(i));
                    unsorted.setCharAt(i, lowestChar);
                }
            }
            if (uppercase)
                sorted.append(Character.toUpperCase(lowestChar));
            else sorted.append(Character.toLowerCase(lowestChar));
        }
        return sorted.toString();
    }

    /**
     * Comprueba si el parametro str es parseable a int, si lo es, devuelve
     * el int, de lo contrario devuelve null
     *
     * @param str string a parsear a int
     * @return str parseado a int
     */
    public static Integer stringToInt(String str) {
        return Asserts.isInteger(str) ? Integer.parseInt(str) : null;
    }
}
