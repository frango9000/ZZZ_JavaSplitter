import lib.Math.NumberConverter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

import static lib.Misc.IO.*;

public abstract class DaLi_12 {

    public static void main(String[] args) {
        ex11();

    }

    public static void ex00() {
    }
    public static void ex01() {//NumberFormatException
        try {
            auxp.ch10.Calculator.main("2 / 2");
        }catch (NumberFormatException | InputMismatchException ex){
            println("Ilegal arguments");
            ex.printStackTrace();
            System.exit(-1);
        }
    }
    public static void ex02() {//ArrayIndexOutOfBoundsException
        String[] strs = {"1", "2", "3", "4" };
        int idx = scanInt("Enter 1-4:");

        try {
            print(strs[idx]);
        }catch (IndexOutOfBoundsException ex){
            println("Catch IndexOutOfBoundsException:");
            ex.printStackTrace();
        }
    }
    public static void ex03() {//InputMismatchException
        try{
            ex02();
        }catch (InputMismatchException ex){
            println("Catch InputMismatchException:");
            ex.printStackTrace();
        }
    }
    public static void ex04() {//IllegalArgumentException
    }
    public static void ex05() {
    }
    public static void ex06() {//NumberFormatException
        try {
            print(NumberConverter.hexToDec("AAAG"));
        }catch (NumberFormatException e){
            print("Bad hex " + e.getMessage());
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
    public static void ex11() {//Remove text
        String argss = "john src/auxp/ch12/11.txt";
        String[] args = argss.split(" ");
        Scanner scan = null;

        String filtered ="";

        File f1 = new File(args[1]);
        try {
            scan = new Scanner(f1);
            while(scan.hasNextLine()){
                filtered += scan.nextLine().replaceAll("john", "") + "\n";
            }
        } catch (FileNotFoundException e) {
            println("File Not Found: ");
            e.printStackTrace();
        } finally {
            try {
                assert scan != null;
                scan.close();
            } catch (NullPointerException e) {
                println("NullPointerException: ");
                e.printStackTrace();
            }
        }

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(f1);

            pw.print(filtered);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            pw.close();
        }
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
    public static void ex31() {
    }
    public static void ex32() {
    }
    public static void ex33() {
    }
}