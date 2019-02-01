import lib.Math.Algebra;
import lib.Math.Primes;
import lib.Math.Scales;

import java.util.Arrays;

import static lib.Misc.IO.*;
import static lib.Misc.Randomizer.*;

public class DaLi_05 {
    public static void main(String[] args) {

        ex21();

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
        print("Enter num of students: ");
        int numOfStudents = scanInt();
        String bestName ="";
        int bestGrade = 0;
        for (int i = 1; numOfStudents > 0; numOfStudents--, i++) {
            printf("Enter name of student %d: ", i);
            String thisName = scanNextLine();

            printf("Enter grade of student %s: ", i);
            int thisGrade = scanInt();
            if (thisGrade > bestGrade) {
                bestGrade = thisGrade;
                bestName = thisName;
            }
        }
        printf("Best student is %s with grade %d", bestName, bestGrade);
    }
    public static void ex09() {
        print("Enter num of students: ");
        int numOfStudents = scanInt();
        String worstName1 ="", worstName2="";
        int worstGrade1 = 12, worstGrade2=12;
        for (int i = 1; numOfStudents > 0; numOfStudents--, i++) {
            printf("Enter name of student %d: ", i);
            String thisName = scanNextLine();

            printf("Enter grade of student %s: ", i);
            int thisGrade = scanInt();
            if (thisGrade < worstGrade1) {
                worstGrade2=worstGrade1;
                worstName2=worstName1;
                worstGrade1 = thisGrade;
                worstName1 = thisName;
            }else if (thisGrade < worstGrade2) {
                worstGrade2 = thisGrade;
                worstName2 = thisName;
            }
        }
        printf("Worst student is %s with grade %d\n", worstName1, worstGrade1);
        printf("2nd Worst student is %s with grade %d", worstName2, worstGrade2);
    }
    public static void ex10() {
        String log = "";
        int count=0;
        for(int i =1;count<100;i++)
            if(i%12==0) {
                log += String.format("%6d", i);
                if(++count%10==0)log+="\n";
            }
        print(log);
    }
    public static void ex11() {
        String log = "";
        int count=0;
        for(int i =1;count<100;i++)
            if( (i%3==0 || i%4==0) && !(i%3==0 && i%4==0) ){
                log += String.format("%6d", i);
                if(++count%10==0)log+="\n";
            }
        print(log);

    }
    public static void ex12() {
        int i;
        for(i=0; !(i*i*i>1200) ;i++){}
        printf("Answer : %d", i);
    }
    public static void ex13() {
        int i;
        for(i=0; i*i<1200;i++){}
        printf("Answer : %d", i);
    }
    public static void ex14() {
        print("Enter num 1");
        int n1 = scanInt();
        print("Enter num 2");
        int n2 = scanInt();
        printf("GCD %d %d = %d\n", n1,n2,Algebra.greatestCommonFactor(n1,n2));
        for (int i = 0; i < 100; i++) {
            printf("GCD %d %d = %d", n1, i, Algebra.greatestCommonFactor(n1, i));
            printf("GCD %d %d = %d\n", n1, i, Algebra.greatestCommonFactor(n2, i));
        }
    }
    public static void ex15() {
        int lineCount=0;
        for (int i='!';i<='~';i++){
            printf("%2c", (char)i);
            if(++lineCount%10==0)println("");
        }
    }
    public static void ex16() {
        for(int i=120;i<130;i++)
            println(i + " : " + Arrays.toString(Primes.getPrimeFactors(i)));

        for(int i=2;i<1500000;i*=2)
            println(i + " : " + Arrays.toString(Primes.getPrimeFactors(i)));
    }
    public static void ex17() {
        int number = 9;
        while (number > 0) {
            for (int i = -number; i <= number; i++) {
                printf("%3d", Math.abs(i));
                if (i == -1) i += 2;
            }
            println("");
            number--;
        }
    }
    public static void ex18() {
        for(int i = 0; i<5;i++){
            for(int j = 0; j<5;j++){
                if(j<=i)
                    print(" $ ");
            }
            println("");
        }
        for(int i = 0; i<5;i++){
            for(int j = 0; j<5;j++){
                if(j>=i)
                    print(" $ ");
            }
            println("");
        }
        for(int i = 0; i<5;i++){
            for(int j = 0; j<5;j++){
                if(j<=i)
                    print(" $ ");
                else print("   ");
            }
            println("");
        }
        for(int i = 0; i<5;i++){
            for(int j = 0; j<5;j++){
                if(j>=i)
                    print(" $ ");
                else print("   ");
            }
            println("");
        }
    }
    public static void ex19() {
        int lines = 15;

        for(int i = 0; i <= lines; i++) {
            for (int j = 0; j < lines - i; j++)
                printf("%6s", "");
            for (int j = 0 ; j < (i) +1; j++)
                printf("%6d", (int) Math.pow( 3, j ) );
            for (int k = i; k > 0; k--)
                printf("%6d", (int) Math.pow( 3, k-1 ) );
            println("");
        }
    }
    public static void ex20() {
        print(Arrays.toString(Primes.listOfPrimesUntil(1200)));
    }
    public static void ex21() {
        double loan = scanDouble("Loan Amount: ");
        int years = scanInt("Years: ");

        printf("%s %5s %5s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        for(double i =5.0;i<=10;i+=0.25){
            double monthlyInterestRate = i/1200.0;
            double monthlyPayment = (loan * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate , years * 12)));
            printf("%5.2f     %5.2f          %8.2f\n",i, monthlyPayment, (monthlyPayment*12)*years);
        }
    }
    public static void ex22() {
        double loanAmount = scanDouble("Loan Amount: ");
        int years = scanInt("Number of Years: ");
        double annualRate = scanDouble("Annual Interest Rate: ");

        double monthlyRate = annualRate / 1200;

        double monthlyPayment = loanAmount * monthlyRate / (1 - 1 /Math.pow(1 + monthlyRate, years * 12));

        printf("Monthly Payment: %.2f\n", monthlyPayment);
        printf("Total Payment: %.2f\n", (monthlyPayment * 12) * years);

        double balance = loanAmount, principal, interest;
        println("Payment#     Interest     Principal     Balance");
        for (int i = 1; i <= years * 12; i++) {
            interest = monthlyRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest, principal, balance);
        }
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
