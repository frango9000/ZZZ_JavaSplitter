package lib.Misc;

import java.util.Random;
import java.util.Scanner;

public abstract class IO {

    public static void println(Object str){
        System.out.println(str);
    }
    public static void print(Object str){
        System.out.print(str);
    }
    public static void printf(String format, Object ... args){
        System.out.format(format, args);
    }
    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    public static float scanFloat(){
        return scanner().nextFloat();
    }
    public static double scanDouble(){
        return scanner().nextDouble();
    }
    public static int scanInt(){
        return scanner().nextInt();
    }
    public static byte scanByte(){
        return scanner().nextByte();
    }
    public static short scanShort(){
        return scanner().nextShort();
    }
    public static String scanNext(){
        return scanner().next();
    }
    public static String scanNextLine(){
        return scanner().nextLine();
    }
    public static char scanChar(){
        String entry = scanNext();
        char character=entry.charAt(0);
        return character;
    }

}
