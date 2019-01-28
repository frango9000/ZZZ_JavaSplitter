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
    public static void printf(String str, Object ... args){
        System.out.format(str, args);
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

    public static int randomInt(){
        Random rand = new Random();
        return rand.nextInt();
    }
    public static int randomInt(int bound){
        Random rand = new Random();
        return rand.nextInt(bound);
    }

    public static Boolean consoleAssert(){
        switch((int)scanChar()){
            case 121: // 'y'
            case 89:  // 'Y'
                return true;
            case 110: // 'n'
            case 78:  // 'N'
                return false;
        }
        return null;
    }

}
