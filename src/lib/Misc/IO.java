package lib.Misc;

import java.util.Random;
import java.util.Scanner;

public abstract class IO {

    public static void println(Object str) {
        System.out.println(str);
    }

    public static void print(Object str) {
        System.out.print(str);
    }

    public static void printf(String format, Object... args) {
        System.out.format(format, args);
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static float scanFloat() {
        return scanner().nextFloat();
    }

    public static double scanDouble() {
        return scanner().nextDouble();
    }

    public static int scanInt() {
        return scanner().nextInt();
    }

    public static byte scanByte() {
        return scanner().nextByte();
    }

    public static short scanShort() {
        return scanner().nextShort();
    }

    public static String scanNext() {
        return scanner().next();
    }

    public static String scanNextLine() {
        return scanner().nextLine();
    }

    public static char scanChar() {
        return scanNext().charAt(0);
    }

    public static float scanFloat(String message) {
        print(message);
        return scanner().nextFloat();
    }

    public static double scanDouble(String message) {
        print(message);
        return scanner().nextDouble();
    }

    public static int scanInt(String message) {
        print(message);
        return scanner().nextInt();
    }

    public static byte scanByte(String message) {
        print(message);
        return scanner().nextByte();
    }

    public static short scanShort(String message) {
        print(message);
        return scanner().nextShort();
    }

    public static String scanNext(String message) {
        print(message);
        return scanner().next();
    }

    public static String scanNextLine(String message) {
        print(message);
        return scanner().nextLine();
    }

    public static char scanChar(String message) {
        print(message);
        return scanNext().charAt(0);
    }

}
