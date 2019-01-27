import lib.Geometry.*;
import lib.Geometry.Tridimensional.Sphere;

import java.util.Random;
import java.util.Scanner;

import static lib.Misc.IO.*;

public class DaLi_04 {
    public static void main(String[] args) {

        ex05();

    }

    public static void ex00() {

    }

    public static void ep01() {
        print("Enter x1: ");
        float x1 = scanFloat();
        print("Enter y1: ");
        float y1 = scanFloat();

        print("Enter x2: ");
        float x2 = scanFloat();
        print("Enter y2: ");
        float y2 = scanFloat();

        print("Enter x3: ");
        float x3 = scanFloat();
        print("Enter y3: ");
        float y3 = scanFloat();

        Triangle triangle = new Triangle(new Point(x1,y1),new Point(x2,y2),new Point(x3,y3));

        println(Math.toDegrees(triangle.angleA));
        println(Math.toDegrees(triangle.angleB));
        println(Math.toDegrees(triangle.angleC));
    }

    public static void ep05() {
        Random rand = new Random();
        String lottery = "" + rand.nextInt(10) + rand.nextInt(10) +  rand.nextInt(10);
        println(lottery);
        print("Enter your 3-digit lottery number: ");
        String guess = scanNextLine();


        int prize;
        int matches = ep05matches(lottery, guess);
        if (lottery == guess) prize = 12000;
        else if (matches == 3) prize = 7000;
        else if (matches == 2) prize = 5000;
        else if (matches == 1) prize = 2000;
        else prize = 0;

        println("Winning lottery number is " + lottery);
        println("Your prize is " + prize);
    }
    private static int ep05matches(String a, String b) {
        char[] arrA = ep05array(a);
        char[] arrB = ep05array(b);
        int count = 0;
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i] == arrB[j]) count++;
            }
        }
        return count;
    }
    private static char[] ep05array(String string) {
        char[] arr = new char[3];
        arr[0] =string.charAt(0);
        arr[1] =string.charAt(1);
        arr[2] =string.charAt(2);
        return arr;
    }

    public static void ep06() {
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.out.printf("Interest is $%4.2f", interest);

    }

    public static void ex01() {
        print("Enter radius: ");
        float r = scanFloat();
        Pentagon pentagon = new Pentagon(r);

        printf("Area of the pentagon is %4.2f", pentagon.area());

    }
    public static void ex02() {
        print("Enter x1: ");
        float x1 = scanFloat();
        print("Enter y1: ");
        float y1 = scanFloat();

        print("Enter x2: ");
        float x2 = scanFloat();
        print("Enter y2: ");
        float y2 = scanFloat();

        Sphere sphere = new Sphere(6371.01);

        printf("Distance between points is %4.10f", sphere.distanceBetweenPoints(new Point(x1,y1),new Point(x2,y2)));
    }
    public static void ex03() {
        Point charlotte = new Point(35.2270869,-80.8431267);
        Point atlanta   = new Point(33.7489954,-84.3879824);
        Point orlando   = new Point(28.5383355,-81.3792365);
        Point savannah  = new Point(32.0835407,-81.0998342);

        Triangle t1 = new Triangle(charlotte, atlanta, orlando);
        Triangle t2 = new Triangle(charlotte, atlanta, savannah);

        printf("Area : %4.8f", (t1.area()+t2.area()) );
    }

    public static void ex04() {
        print("Enter sideLength of hexagon: ");
        float side = scanFloat();

        Hexagon hexagon = new Hexagon(side);
        printf("Area is %4.8f", hexagon.area());
    }
    public static void ex05() {
        print("Enter num of sides ");
        int numOfSides = scanInt();

        print("Enter side Length of polygon: ");
        float side = scanFloat();

        Polygon polygon = new Polygon(numOfSides, side);
        printf("Area is %4.8f", polygon.area());

    }
    public static void ex06() {

    }
    public static void ex07() {

    }
    public static void ex08() {

    }
    public static void ex09() {

    }
    public static void ex10() {

    }
}
