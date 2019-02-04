package lib.Math;

public abstract class Extras {

    public static int reverse(int number){
        int size = String.valueOf(number).length();
        StringBuilder string = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            string.append( number%10 );
            number /= 10;
        }
        return Integer.parseInt(string.toString());
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

}
