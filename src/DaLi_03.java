import lib.Geometry.Point;
import lib.Geometry.Rectangle;
import lib.Geometry.Triangle;
import lib.Math.Algebra;
import lib.Math.Scales;
import lib.Misc.Time;

import java.util.Random;

import static lib.Misc.IO.*;

public class DaLi_03 {

    public static void main(String[] args) {

        ex19();

    }

    public static void ex00() {

    }

    public static void ex01() {
        print("Enter a: ");
        float a = scanFloat();

        print("Enter b: ");
        float b = scanFloat();

        print("Enter c: ");
        float c = scanFloat();

        double[] r = Algebra.quadraticEquation(a, b, c);

        if (r == null) println("The equation has no real roots");
        else if (r.length == 1) println("The equation has one root " + r[0]);
        else if (r.length == 2) println("The equation has two roots " + r[0] + " and " + r[1]);
    }

    public static void ex02() {
        Random rand = new Random();

        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int c = rand.nextInt(10);

        print("Enter the result of : " + a + " x " + b + " x " + c + " = ");
        int answer = scanInt();
        int result = a * b * c;
        if (answer == result) println("You win");
        else println("You lose, answer is =" + result);
    }

    public static void ex03() {
        print("Enter a: ");
        float a = scanFloat();

        print("Enter b: ");
        float b = scanFloat();

        print("Enter c: ");
        float c = scanFloat();

        print("Enter d: ");
        float d = scanFloat();

        print("Enter e: ");
        float e = scanFloat();

        print("Enter f: ");
        float f = scanFloat();

        float[] xy = Algebra.linear2x2Equation(a, b, c, d, e, f);

        if (xy == null) println("The equation has no solution");
        else println("x: " + xy[0] + "\ny: " + xy[1]);
    }

    public static void ex04() {
        Random rand = new Random();
        int monthNumber = rand.nextInt(11) + 1;

        println(Time.monthName(monthNumber));
    }

    public static void ex05() {
        print("Enter today's day (0 - 6): ");
        int today = scanInt();

        print("Enter the number of days elapsed since today: ");
        int elapsedDays = scanInt();

        println("Today is " + Time.dayName(today) + " and the future day is " + Time.dayName(today + elapsedDays));
    }

    public static void ex06() {
        print("Enter weight in pounds: ");
        float pounds = scanFloat();
        print("Enter height in feet: ");
        float feet = scanFloat();
        print("Enter height in inches: ");
        float inches = scanFloat();

        double weightInKilograms = Scales.poundToKilogram(pounds);
        double heightInMeters = Scales.inchToMeter(Scales.feetToInch(feet) + inches);
        double bmi = weightInKilograms /
                (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }

    public static void ex07() {
        print("Enter amount: ");
        float amount = scanFloat();

        int remainingAmount = (int) (amount * 100);

        int numberOfHundredDollars = remainingAmount / 10000;
        remainingAmount %= 10000;

        int numberOfFiftyDollars = remainingAmount / 5000;
        remainingAmount %= 5000;

        int numberOfTwentyDollars = remainingAmount / 2000;
        remainingAmount %= 2000;

        int numberOfTenDollars = remainingAmount / 1000;
        remainingAmount %= 1000;

        int numberOfFiveDollars = remainingAmount / 500;
        remainingAmount %= 500;

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;
        println("Your amount " + amount + " consists of");
        if (numberOfHundredDollars > 0) println(" " + numberOfHundredDollars + " 100 dollar bills");
        if (numberOfFiftyDollars > 0) println(" " + numberOfFiftyDollars + " 50 dollar bills ");
        if (numberOfTwentyDollars > 0) println(" " + numberOfTwentyDollars + " 20 dollar bills");
        if (numberOfTenDollars > 0) println(" " + numberOfTenDollars + " 10 dollar bills");
        if (numberOfFiveDollars > 0) println(" " + numberOfFiveDollars + " 5 dollar bills");
        if (numberOfOneDollars > 0) println(" " + numberOfOneDollars + " 1 dollar bills");
        if (numberOfQuarters > 0) println(" " + numberOfQuarters + " quarter coins");
        if (numberOfDimes > 0) println(" " + numberOfDimes + " dime coins");
        if (numberOfNickels > 0) println(" " + numberOfNickels + " nickel coins");
        if (numberOfPennies > 0) println(" " + numberOfPennies + " pennies coins");
    }


    public static void ex08() {
        print("Enter a: ");
        float a = scanFloat();

        print("Enter b: ");
        float b = scanFloat();

        print("Enter c: ");
        float c = scanFloat();

        if (a <= b && a <= c) {
            println(a);
            if (b <= c) {
                println(b);
                println(c);
            } else println(c);
            println(b);
        } else if (b <= a && b <= c) {
            println(b);
            if (a <= c) {
                println(a);
                println(c);
            } else println(c);
            println(a);
        } else {
            println(c);
            if (a <= b) {
                println(a);
                println(b);
            } else println(b);
            println(a);
        }
    }


    public static void ex09() {
        print("Enter 9 digits of ISBN: ");
        String isbn = scanNext();
        String lastDigit;
        int checksum = 0;
        int[] d = new int[9];
        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.parseInt(String.valueOf(isbn.charAt(i)));
            checksum = checksum + (d[i] * (i + 1));
        }
        checksum %= 11;
        lastDigit = checksum < 10 ? String.valueOf(checksum) : "X";
        println("The ISBN-10 number is " + isbn + lastDigit);
    }

    public static void ex10() {
        int num1 = randomInt(100);
        int num2 = randomInt(100);

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        print("Enter " + num1 + " - " + num2 + " : ");
        int answer = scanInt();
        if (num1 - num2 == answer) println("Correct");
        else println("Answer " + num1 + " - " + num2 + " : " + (num1 - num2));
    }

    public static void ex11() {
        print("Enter month number (Jan = 1 ; Dec = 12) ");
        int monthIndex = scanInt() - 1;        //minus one to convert to monthIndex
        print("Enter year number (ex. 1999) ");
        int year = scanInt();
        println("Month : " + (monthIndex + 1) + " of year " + year + " has " + Time.daysInMonth(monthIndex, year) + " days.");
    }

    public static void ex12() {
        print("Enter 3 digit int ");
        int threeDigitInt = scanInt();
        int firstDigit = String.valueOf(threeDigitInt).charAt(0);
        int lastDigit = String.valueOf(threeDigitInt).charAt(2);
        if (firstDigit == lastDigit) println(threeDigitInt + " is palindrome.");
        else println(threeDigitInt + " is not palindrome.");
    }

    public static void ex13() {
        print("0-single filer\n1-married jointly or qualifying widow(er)\n2-married separately\n3-head of household)\nEnter the filing status: ");
        int status = scanInt();

        print("Enter the taxable income: ");
        double income = scanDouble();

        println("Tax is " + ex13tax(status, income));
    }

    public static void ex14() {
        print("Enter 0 for heads, 1 for tails : ");
        byte guess = scanByte();

        byte coin = (byte) randomInt(1);

        println("Coin flip result = " + (coin == 0 ? "head" : "tail"));
        println(guess == coin ? "You win." : "You loose");

    }

    public static void ex15() {
        int lottery = randomInt(1000);
        print("Enter your 3-digit lottery number: ");
        int guess = scanInt();


        int prize;
        int matches = ex15matches(lottery,guess);
        if (lottery == guess) prize = 12000;
        else if (matches==3) prize = 7000;
        else if (matches==2) prize = 5000;
        else if (matches==1) prize = 2000;
        else prize = 0;

        println("Winning lottery number is " + lottery);
        println("Your prize is " + prize);
    }

    public static void ex16() {
        Point center = new Point(0,0);
        Rectangle rect = new Rectangle(50, 150, center);
        float[] randPoint =rect.randomPoint();
        println("Random X : " + randPoint[0] + "\nRandom Y : " + randPoint[1]);

    }

    public static void ex17() {
        print("0 rock\n1 paper\n2 scissor\n");
        int player = scanInt();
        int ai = randomInt(3);

        println("You chose " +ex17string(player) );
        println("AI chose " +ex17string(ai) );

        String reply;
        if (player==ai)reply ="draw";
        else {
            if ( (ai == 0 && player == 1) || (ai==1 && player == 2) || (ai == 2 && player == 0) ) reply = "win";
            else reply= "lose";
        }
        println("You " + reply );
    }

    public static void ex18() {
        print("Enter weight ");
        float weight = scanFloat();

        if (weight>20)println("Package cannot be shipped.");
        else{
            float price;
            if (weight<=2)price = 2.5f;
            else if (weight<=4)price = 4.5f;
            else if (weight<=10)price = 7.5f;
            else price = 10.5f;
            print("Price is : "+ price);
        }
    }

    public static void ex19() {

        print("Enter AB: ");
        float sideAB = scanFloat();

        print("Enter BC: ");
        float sideBC = scanFloat();

        print("Enter CA: ");
        float sideCA = scanFloat();
        if(Triangle.isValidTriangle(sideAB,sideBC,sideCA)){
            Triangle triangle = new Triangle(sideAB, sideBC, sideCA);
            println("Perimeter is " + triangle.perimeter());
        }else println("Invalid Triangle");

    }

    public static void ex20() {
        print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        float temp = scanFloat();
        print("Enter the wind speed (>= 2) in miles per hour: ");
        float windSpeed = scanFloat();
        if ( temp > 41 || temp < -58 ||windSpeed < 2)println("Invalid Imput");
        else {
            double windChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, 0.16));
            println("The wind chill index is " + windChill);
        }
    }


    //Private methods

    private static float ex13tax(int status, double income) {
        // Compute tax
        double tax = 0;
        int[] incomeRange;
        float[] taxRange = {0.10f, 0.15f, 0.25f, 0.28f, 0.33f, 0.35f};
        switch (status) {
            default:
            case 0:
                incomeRange = new int[]{8350, 33950, 82250, 171550, 372950};
                break;
            case 1:
                incomeRange = new int[]{16700, 67900, 137050, 208850, 372950};
                break;
            case 2:
                incomeRange = new int[]{8350, 33950, 68525, 104425, 186475};
                break;
            case 3:
                incomeRange = new int[]{11950, 45500, 117450, 190200, 372950};
                break;
        }

        if (income <= incomeRange[0])
            tax = income * 0.10;
        else if (income <= incomeRange[1])
            tax = incomeRange[0] * taxRange[0] + (income - incomeRange[0]) * taxRange[1];
        else if (income <= incomeRange[2])
            tax = incomeRange[0] * taxRange[0] + (incomeRange[1] - incomeRange[0]) * taxRange[1] + (income - incomeRange[1]) * taxRange[2];
        else if (income <= incomeRange[3])
            tax = incomeRange[0] * taxRange[0] + (incomeRange[1] - incomeRange[0]) * taxRange[1] + (incomeRange[2] - incomeRange[1]) * taxRange[2] + (income - incomeRange[2]) * taxRange[3];
        else if (income <= incomeRange[4])
            tax = incomeRange[0] * taxRange[0] + (incomeRange[1] - incomeRange[0]) * taxRange[1] + (incomeRange[2] - incomeRange[1]) * taxRange[2] + (incomeRange[3] - incomeRange[2]) * taxRange[3] + (income - incomeRange[3]) * taxRange[4];
        else
            tax = incomeRange[0] * taxRange[0] + (incomeRange[1] - incomeRange[0]) * taxRange[1] + (incomeRange[2] - incomeRange[1]) * taxRange[2] + (incomeRange[3] - incomeRange[2]) * taxRange[3] + (incomeRange[4] - incomeRange[3]) * taxRange[4] + (income - incomeRange[4]) * taxRange[5];

        return (float) tax;

    }

    private static int ex15matches(int a, int b) {
        int[] arrA = ex15array(a);
        int[] arrB = ex15array(b);
        int count = 0;
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i] == arrB[j]) count++;
            }
        }
        return count;
    }

    private static int[] ex15array(int number) {
        int[] arr = new int[3];
        arr[0] = number / 100;
        arr[1] = number/100 / 10;
        arr[2] = number/100 % 10;
        return arr;
    }
    private static String ex17string(int rps){
        switch (rps){
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissor";
        }
        return null;
    }
}
