import lib.Math.Algebra;
import lib.Math.Scales;
import lib.Misc.Time;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

import static lib.Misc.IO.*;

public class DaLi_03 {

    public static void main(String[] args) {

        ex08();

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

        if(a<=b && a<=c){
            println(a);
            if(b<=c){println(b);println(c);}
            else println(c);println(b);
        }else if(b<=a && b<=c){
            println(b);
            if(a<=c){println(a);println(c);}
            else println(c);println(a);
        }else {
            println(c);
            if (a <= b){ println(a);println(b);}
            else println(b);println(a);
        }
    }

    
    public static void ex09() {

    }
    public static void ex010() {

    }

}
