import lib.Math.Scales;

import static lib.Misc.IO.*;
import static lib.Misc.Randomizer.*;

public class DaLi_05 {
    public static void main(String[] args) {

        ex07();

    }

    public static void ex00() {

    }

    public static void ex01() {
        int n = 0;
        while (n != -1) {
            print("Enter Your Grade:");
            n = scanInt();
            println("You" + (n > 50 ? " " : " did not ") + "pass.");
        }
    }
    public static void ex02() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int a = randomInt(100), b = randomInt(100), t = 0;
            if (a < b) t = a;
            a = b;
            b = t;
            printf("\n%d : Enter result of %d - %d",count++, a, b);
            int result = scanInt();
            if (result == a - b)
                print("You win.");
            else printf("You lose: %d - %d = %d", a, b, (a - b));
        }
        printf("\nCorrect answers = %d", count);
    }
    public static void ex03() {
        printf("%s %19s", "Celsius", "Fahrenheit");
        for (int i = 0; i <= 100; i+=2) {
            printf("\n%s %25s", i, Scales.celsiusToFahrenheit(i));
        }
    }
    public static void ex04() {
        printf("%3s %19s", "Inches", "Centimeter");
        for (int i = 0; i <= 100; i++) {
            printf("\n%3d %20.2f", i, Scales.inchToMeter(i)*100 );
        }
    }
    public static void ex05() {
        printf("%s %14s    |    %10s %11s", "Celsius", "Fahrenheit","Fahrenheit","Celsius" );
        for (int i = 0; i <= 100; i++) {
            printf("\n%3d %18.2f    |    %3d %18.2f", i*2, Scales.celsiusToFahrenheit(i*2), i*5, Scales.fahrenheitToCelsius(i*5));
        }
    }
    public static void ex06() {
        printf("%s %17s    |    %12s %9s", "Ping", "Square Meter","Square Meter","Ping" );
        for (int i = 10; i <= 80; i+=5) {
            printf("\n%3d %18.2f    |    %3d %18.2f", i, Scales.pingToSquareMeter(i), i+20, Scales.fahrenheitToCelsius(i+20));
        }

    }
    public static void ex07() {
        float initialV = 10000f;
        float deltaV = 1.06f; // 6%
        float totalCost = 0f;


        for(int i =1;i<=10;i++){
            printf("\nYear %2d: %13.2f", i, initialV);
            totalCost+=initialV;
            initialV = initialV * deltaV;
        }
        print("\nTotal Cost : " + totalCost);
    }
    public static void ex08() {

    }
    public static void ex09() {

    }
    public static void ex10() {

    }
    public static void ex11() {

    }
    public static void ex12() {

    }
    public static void ex13() {

    }
    public static void ex14() {

    }
    public static void ex15() {

    }
    public static void ex16() {

    }
    public static void ex17() {

    }
    public static void ex18() {

    }
    public static void ex19() {

    }
    public static void ex20() {

    }
    public static void ex21() {

    }
    public static void ex22() {

    }
    public static void ex23() {

    }
    public static void ex24() {

    }
    public static void ex25() {

    }
    public static void ex26() {

    }
    public static void ex27() {

    }
    public static void ex28() {

    }
    public static void ex29() {

    }
    public static void ex30() {

    }
}
