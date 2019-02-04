package lib.Misc;

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
}
