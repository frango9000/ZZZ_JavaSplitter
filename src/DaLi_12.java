import auxp.ch07.Hangman;
import lib.Math.NumberConverter;
import lib.Misc.FileIO;
import lib.Misc.FileIn;
import lib.Misc.FileOut;
import lib.Misc.Randomizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static lib.Misc.IO.*;

public abstract class DaLi_12 {

    public static void main(String[] args) {
        ex26();

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
        String argss = "john src/auxp/ch12/e11.txt";
        String[] args = argss.split(" ");
        Scanner scan = null;

        StringBuilder filtered = new StringBuilder();

        File f1 = new File(args[1]);
        try {
            scan = new Scanner(f1);
            while(scan.hasNextLine()){
                filtered.append(scan.nextLine().replaceAll("john", "")).append("\n");
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

        try (PrintWriter pw = new PrintWriter(f1)) {
            pw.print(filtered);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void ex12() {//Reformat Java source code
        String file = "src/auxp/ch12/e12.java";
        File f1 = new File (file);
        String str = "";
        try {
            str = FileIn.fileToString(f1);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (PrintWriter pw = new PrintWriter(f1)) {
            pw.print(str.toString().replaceAll("[{]" + "\n", "\n{\n"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void ex13() {//Count characters, words, and lines in a file
        int lines=0, chars=0, words=0;

        String file = "src/auxp/ch12/e13.txt";
        File f1 = new File (file);
        StringBuilder str = new StringBuilder();
        try(Scanner scan = new Scanner(f1)){
            while(scan.hasNextLine()) {
                lines++;
                str.append(scan.nextLine()).append("\n");
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        chars = str.length();
        words = str.toString().split(" ").length;

        print("chr: " + chars + "\nwords: " + words + "\nlines: " + lines);
    }
    public static void ex14() {//Reading in a sorted file
        String file = "src/auxp/ch12/e14.txt";
        File f1 = new File (file);
        String str="";
        try {
            str = FileIn.fileToString(f1);
        }catch (FileNotFoundException e){
            println("FileNotFoundException:");
            e.printStackTrace();
        }
        print(str);

        try {
            int n = FileIn.indexOfFirstOccurrence(f1, "Benjamin");
            println(n);
        }catch (FileNotFoundException e){
            println("FileNotFoundException:");
            e.printStackTrace();
        }
        FileIO.sort(f1);
        try {
            int n = FileIn.binarySearch(f1, "Benjamin");
            println(n);
        }catch (FileNotFoundException e){
            println("FileNotFoundException:");
            e.printStackTrace();
        }
    }
    public static void ex15() {//Writing in a sorted file
        File f1 = new File ("src/auxp/ch12/e15.txt");
        String add = "Franky";
        try {
            FileOut.addToSortedFile(f1, add);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void ex16() {//Replace text
        File f1 = new File ("src/auxp/ch12/e16.txt");
        FileIO.replace(f1, "Franky", "Francis");
    }
    public static void ex17() {//Game: hangman
        File f1 = new File("src/auxp/ch12/e16.txt");
        try {
            Hangman.startGame(FileIn.fileToArray(f1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void ex18() {//Add package statement
        File file = new File("src/auxp/ch12/e18/");
        ArrayList<File> files =new ArrayList<>();
        FileIn.allSubFiles(file,files);

        for (int i = 0; i < files.size(); i++) {
            try {
                FileOut.prependOnFile(files.get(i), "//package t;");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void ex19() {//Linking two files
        File f1 = new File("src/auxp/ch12/e19authors.txt");
        File f2 = new File("src/auxp/ch12/e19books.txt");

        String newA = "Franky";
        String newB = "The Bridge 1";
        int i =-1;
        try {
            i = FileOut.addToSortedFile(f1, newA);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(i > -1){
            try {
                FileOut.appendOnFile(f2, i + "," + newB);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    public static void ex20() {
        File file = new File("src/auxp/ch12/e18/");
        ArrayList<File> files =new ArrayList<>();
        FileIn.allSubFiles(file,files);

        for (File file1 : files) {
            try {
                String str = FileIn.fileToString(file1);
                str = str.replaceAll("//package t;\n", "");
                FileOut.printOnFile(file1, str);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    public static void ex21() {//Using two files
        File f1 = new File("src/auxp/ch12/e19authors.txt");
        File f2 = new File("src/auxp/ch12/e19books.txt");

        String find = "Franky";

        try (Scanner scan = new Scanner(f2)){
            int id = FileIn.binarySearch(f1, find);

            while (scan.hasNextLine()){
                String n =scan.nextLine();
                if (n.startsWith(id+""))
                    println(n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void ex22() {//Replace text
        ex20();
    }
    public static void ex23() {//Process scores in a text file on the Web
        URL scores = null;
        Scanner scan = null;
        int total=0, sum =0;
        try {
            scores = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");

            try {
                scan = new Scanner(scores.openStream());
                while(scan.hasNext()){
                    sum += scan.nextInt();
                    total++;
                }
                print("Avg: " + ((sum*1f)/total) + "\nSum: " + sum);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                assert scan != null;
                scan.close();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static void ex24() {//Create large dataset
        File f1 = new File("src/auxp/ch12/e24data.txt");
        PrintWriter pw = null;
        String[] rank = {"assistant", "associate", "full"};

        try {
            pw = new PrintWriter(f1);

            for (int i = 1; i <= 1000; i++) {
                String fn = "FirstName" + i;
                String ln = "LastName" + i;
                int rk = Randomizer.randomInt(rank.length);
                double sal;
                switch(rk){
                    case 0:
                        sal = Randomizer.randomDouble(50000, 80000);break;
                    case 1:
                        sal = Randomizer.randomDouble(60000, 110000);break;
                    default:
                        sal = Randomizer.randomDouble(75000, 130000);break;
                }
                pw.printf("%s %s %s %.2f%n", fn,ln,rk,sal);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            assert pw != null;
            pw.close();
        }
    }
    public static void ex25() {//Process large dataset
        File f1 = new File("src/auxp/ch12/e24data.txt");

        ArrayList<Double> r0 = new ArrayList<>();
        ArrayList<Double> r1 = new ArrayList<>();
        ArrayList<Double> r2 = new ArrayList<>();
        String[] file = null;
        try {
            file = FileIn.fileToArray(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assert file != null;
        for (String s : file) {
            String[] line = s.split(" ");
            switch (line[2]) {
                case "0":
                    r0.add(Double.parseDouble(line[3]));
                    break;
                case "1":
                    r1.add(Double.parseDouble(line[3]));
                    break;
                default:
                    r2.add(Double.parseDouble(line[3]));
                    break;
            }
        }

        double av0=0,av1=0,av2=0;
        for (int i = 0; i < r0.size(); i++) {
            av0 +=  r0.get(i);
        }
        for (int i = 0; i < r1.size(); i++) {
            av1 +=  r1.get(i);
        }
        for (int i = 0; i < r2.size(); i++) {
            av2 +=  r2.get(i);
        }
        println(av0 + "\n" + av0/r0.size());
        println(av1 + "\n" + av1/r1.size());
        println(av2 + "\n" + av2/r2.size());

    }
    public static void ex26() {//Create a directory
        String newDir = scanNext("Enter a new dir name: ");
        File f1 = new File("src/auxp/ch12/" + newDir + "/");
        if(f1.exists())
            println("Directory already exists");
        else {
            f1.mkdir();
        }
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