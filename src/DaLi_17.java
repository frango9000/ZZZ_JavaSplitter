import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class DaLi_17 {

    public static void main(String[] args) {
        ex01();

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
    }

    public static void ex03() {
    }

    public static void ex04() {
    }

    public static void ex05() {
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

    public static void ex11() {
    }

    public static void ex12() {
    }

    public static void ex13() {
    }
}