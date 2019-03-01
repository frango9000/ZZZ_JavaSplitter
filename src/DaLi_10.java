import auxp.ch10.MyInteger;
import auxp.ch10.StackOfIntegers;
import lib.Geometry.Point;
import lib.Math.Primes;
import lib.Misc.Time;

import static lib.Misc.IO.*;
public abstract class DaLi_10 {

    public static void main(String[] args) {
        ex06();

    }

    public static void ex00() {
    }

    public static void ex01() {//The Time class
        Time now = new Time();
        print(now.timeToString());
    }

    public static void ex02() {//The BMI class
    }

    public static void ex03() {//The MyInteger class
        MyInteger i = new MyInteger(5);
        print(i.isPrime());
    }

    public static void ex04() {//The MyPoint class
        Point p1 = new Point(2,3);
        Point p2 = new Point(6,8);
        print(p1.distanceBetweenPoints(p2));
    }

    public static void ex05() {//Display the prime factors
        int number = scanInt("Enter a number");

        StackOfIntegers stack = new StackOfIntegers(Primes.getPrimeFactors(number));
        while (!stack.empty()) {
             println(stack.pop());
        }
    }

    public static void ex06() {//Game: ATM machine
        int number = scanInt("Enter a number");

        StackOfIntegers stack = new StackOfIntegers(Primes.listOfPrimesUntil(number));
        while (!stack.empty()) {
            println(stack.pop());
        }
    }

    public static void ex07() {
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
}