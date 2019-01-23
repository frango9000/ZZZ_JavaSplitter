import lib.Math.Algebra;
import lib.Misc.Time;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

import static lib.Misc.IO.*;

public class DaLi_03 {

    public static void main(String[] args) {

        Ex05();

    }

    public static void Ex00() {

    }

    public static void Ex01() {
        print("Enter a: ");
        float a=scanFloat();

        print("Enter b: ");
        float b=scanFloat();

        print("Enter c: ");
        float c=scanFloat();

        double[] r=Algebra.quadraticEquation(a,b,c);

        if (r==null)println("The equation has no real roots");
        else if (r.length==1)println("The equation has one root " + r[0]);
        else if(r.length==2)println("The equation has two roots "+ r[0] +" and "+r[1]);
    }
    public static void Ex02() {

        Random rand = new Random();

        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int c = rand.nextInt(10);

        print("Enter the result of : " + a + " x " + b + " x " + c + " = " );
        int answer = scanInt();
        int result = a*b*c;
        if(answer==result)println("You win");
        else println("You lose, answer is =" + result);

    }
    public static void Ex03(){

        print("Enter a: ");
        float a=scanFloat();

        print("Enter b: ");
        float b=scanFloat();

        print("Enter c: ");
        float c=scanFloat();

        print("Enter d: ");
        float d=scanFloat();

        print("Enter e: ");
        float e=scanFloat();

        print("Enter f: ");
        float f=scanFloat();

        float[] xy= Algebra.linear2x2Equation(a,b,c,d,e,f);

        if(xy == null)println("The equation has no solution");
        else println("x: " + xy[0] + "\ny: " + xy[1]);
    }

    public static void Ex04() {

        Random rand = new Random();
        int monthNumber = rand.nextInt(11)+1;

        println(Time.monthName(monthNumber));
    }

    public static void Ex05() {

        print("Enter today's day (0 - 6): ");
        int today=scanInt();

        print("Enter the number of days elapsed since today: ");
        int elapsedDays=scanInt();

        println("Today is "+Time.dayName(today)+" and the future day is "+Time.dayName(today+elapsedDays));

    }


}
