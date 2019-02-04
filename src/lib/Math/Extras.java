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

    public static double max(double number1, double number2){
        return number1 > number2 ? number1 : number2;
    }
    public static double max(double number1, double number2, double number3){
        return max(max(number1,number2),number3);
    }

    public static double babylonianSquareRoot(int n){
        double lastGuess= 1.0, nextGuess = (lastGuess + n / lastGuess) / 2.0;
        while (nextGuess - lastGuess > 0.0000000000001){
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2.0;
        }
        lastGuess = nextGuess;
        return nextGuess = (lastGuess + n / lastGuess) / 2.0;
    }


}