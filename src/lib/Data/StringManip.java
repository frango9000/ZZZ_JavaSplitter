package lib.Data;

public abstract class StringManip {

    public static int countLetters(String string){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isLetter(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }
    public static int countDigits(String string){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isDigit(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static String format(int number, int width){
        return String.format("%0"+width+"d", number);
    }
    public static String sort(String string){
        StringBuilder unsorted = new StringBuilder(string);
        StringBuilder sorted = new StringBuilder();
        for (int i = 0; i < unsorted.length(); i++) {
            char lowestChar=unsorted.charAt(i);
            for (int j = i+1; j < unsorted.length(); j++) {
                if(unsorted.charAt(i) > unsorted.charAt(j)){
                    lowestChar = unsorted.charAt(j);
                    unsorted.setCharAt(j, unsorted.charAt(i));
                    unsorted.setCharAt(i, lowestChar);
                }
            }
            sorted.append(lowestChar);
        }
        return sorted.toString();
    }
}
