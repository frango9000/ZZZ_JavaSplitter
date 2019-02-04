import lib.Math.Algebra;
import lib.Math.Extras;
import lib.Math.Primes;
import lib.Math.Scales;
import lib.Misc.Time;

import java.util.Arrays;

import static lib.Misc.IO.*;
import static lib.Misc.Randomizer.*;

public class DaLi_06 {
    public static void main(String[] args) {

        ex17(4);

    }

    public static void ex00() {

    }
    public static void ex01() {
        for (int i = 0; i < 100; i++) {
            printf("%7d", Algebra.pentagonalNumber(i) );
            if  (i%10 == 9 )println("");
        }
    }
    public static void ex02() {
        println(Algebra.sumOfDigits(225416222));
    }
    public static void ex03() {
        println(Extras.isPalindrome(12321));
        println(Extras.isPalindrome(1421));
    }
    public static void ex04() {
        println(Extras.reverse(1234));
    }
    public static void ex05() {
        println((int)Extras.max(5,6,7));
    }
    public static void ex06(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                printf("%3d",j);
            }
            println("");
        }
    }
    public static void ex07() {
        DaLi_02.ex21();
    }
    public static void ex08() {
        printf("%s %s %s %s %s\n", "Miles", "Kilometers", "|", "Kilometers", "Miles");
        for (int i = 1, k=20; i <= 10; i++, k+=5) {
            printf("%-8d %-7.3f %s %-10d %.3f\n",  i, Scales.mileToKilometer(i),"|", k, Scales.kilometerToMile(k));
        }
    }
    public static void ex09() {
        printf("%s %s %3s %s %5s\n", "Kilogram", "Pound", "|", "Pound", "Kilogram");
        for (int k = 1, p=20; k <= 10; k+=2, p+=5) {
            printf("%-8d %-7.3f %s %-5d %.3f\n",  k, Scales.kilogramToPound(k),"|", p, Scales.poundToKilogram(p));
        }

    }
    public static void ex10(int number) {
        print(Arrays.toString(Primes.listOfPrimesUntil(number)));
    }
    public static void ex11() {
        // Display table
        System.out.println("\n SalesAmount     Commission");
        System.out.println("-----------------------------");
        for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.printf(" %-16.0f", salesAmount);
            System.out.printf("%8.1f\n", ex11computeCommission(salesAmount));
        }

    }
    public static double ex11computeCommission(double salesAmount) {
        double balance, 					// Holds the balance
                commission;				// Employee commission
        balance = commission = 0.0;	// Initialize balance and commission to 0

        // If sales amount is $10.000.01 and above commission rate is 12%
        if (salesAmount >= 10000.01)
            commission += (balance = salesAmount - 10000) * 0.12;

        // If sales amount is $5,000.01 to $10,000 commissin rate is 10%
        if (salesAmount >= 5000.01)
            commission += (balance -= balance - 5000) * 0.10;

        // If sales amount is $0.01 to $5,000.01 commissin rate is 8%
        if (salesAmount >= 0.01)
            commission += balance * 0.08;

        return commission;
    }
    public static void ex12(int num1, int num2, int numbersPerLine) {
        for (int i = num1, j=0; i <= num2; i++) {
            printf("%3d", i);
            if(j++%numbersPerLine==numbersPerLine-1)println("");
        }
    }
    public static void ex13(int i) {
        float sum = 0;
        for (int j=1; j<=i ; j++) {
            sum += j/(j+2f);
            printf("%-4d %f %n", j, sum);
        }
    }
    public static void ex14() {
        for (int i = 1; i < 1000; i+=100) {
            printf("%-6d %.5f%n",i, ex14pi(i));
        }
    }
    public static double ex14pi(int precision) {
        double PI = 0.0;
        for (int i = precision; i > 0; i--)
            PI += Math.pow(-1, i + 1) / (2 * i - 1);
        return PI * 4;
    }
    private static void ex15() {
        /* ToDo */
    }
    public static void ex16() {
        int sum = 0;
        for (int year = 2014; year <= 2034 ; year++) {
            sum += Time.daysInYear(year);
        }
        print(sum);
    }
    public static void ex17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                printf("%3d", randomInt(2));
            }
        println("");
        }
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
    public static void ex31() {

    }
    public static void ex32() {

    }
    public static void ex33() {

    }
    public static void ex34() {

    }
    public static void ex35() {

    }
    public static void ex36() {

    }
    public static void ex37() {

    }
    public static void ex38() {

    }
    public static void ex39() {

    }
}
