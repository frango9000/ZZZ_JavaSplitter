import java.io.*;
import java.util.Scanner;

public abstract class DaLi_17 {

    public static void main(String[] args) {
        ex04();

    }

    public static void ex00() {
    }

    public static void ex01() {//Create a text file
        File file = new File("src/auxp/ch17/Exercise17_01.txt");
        try (PrintWriter filewriter = new PrintWriter(new FileWriter(file,true))) {
            for (int i = 0; i < 50; i++) {
                filewriter.print((int) (Math.random() * 100) + " ");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    public static void ex02() {//Create a binary data file
        File file = new File("src/auxp/ch17/Exercise17_02.dat");
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(file))) {
            for (int i = 0; i < 50; i++) {
                out.writeDouble(((int)(Math.random()*10000))/100);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void ex03() {//Sum all the floating points in a binary data file
        File file = new File("src/auxp/ch17/Exercise17_02.dat");
        try(DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            double sum = 0;
            while(in.available() != 0){
                sum += in.readDouble();
            }
            System.out.println("Sum is : " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void ex04() {//Convert a text file into UTF
        File textfile = new File("src/auxp/ch12/e24data.txt");
        File binfile = new File("src/auxp/ch17/Exercise17_04.dat");
        try(
                Scanner in = new Scanner(textfile);
                DataOutputStream out = new DataOutputStream(new FileOutputStream(binfile))
        ){
            while(in.hasNextLine()){
                out.writeUTF(in.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Text size = " + textfile.length());
        System.out.println("Bin copy size = " + binfile.length());
    }
    public static void ex05() {//Store objects and arrays in a file
    }
    public static void ex06() {//Store Loan objects
    }
    public static void ex07() {//Restore objects from a file
    }
    public static void ex08() {//Update count
    }
    public static void ex09() {//Address book
    }
    public static void ex10() {//Split files
    }
    public static void ex11() {//Split files GUI
    }
    public static void ex12() {//Combine files
    }
    public static void ex13() {//Combine files GUI
    }
    public static void ex14() {//Encrypt files
    }
    public static void ex15() {//Decrypt files
    }
    public static void ex16() {//Frequency of characters
    }
    public static void ex17() {//BitOutputStream
    }
    public static void ex18() {//View bits
    }
    public static void ex19() {//View hex
    }
    public static void ex20() {//Binary editor
    }
    public static void ex21() {//Hex editor
    }
}