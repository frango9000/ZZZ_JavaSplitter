import lib.Data.ListManip;
import lib.Data.MatrixManip;
import lib.Geometry.Triangle;
import lib.Misc.Randomizer;

import java.util.ArrayList;

import static lib.Misc.IO.*;

public abstract class DaLi_11 {

    public static void main(String[] args) {
        ex11();

    }

    public static void ex00() {
    }
    public static void ex01() {//The Triangle class
        Triangle triangle = new Triangle(10, 15, 20);
        print(triangle.toString());
    }
    public static void ex02() {
    }
    public static void ex03() {
    }
    public static void ex04() {//Maximum element in ArrayList
        ArrayList<Integer> list = ListManip.listFromScanner();
        print(ListManip.max(list));
    }
    public static void ex05() {
    }
    public static void ex06() {
    }
    public static void ex07() {//Shuffle ArrayList
        ArrayList<Integer> list = ListManip.listFromScanner();
        println(list.toString());
        ListManip.shuffle(list);
        println(list.toString());
    }
    public static void ex08() {
    }
    public static void ex09() {
        int[][] table = Randomizer.randomIntsTable(4, 4, 0, 1);
        MatrixManip.printTable(table);
    }
    public static void ex10() {
    }
    public static void ex11() {//Sort ArrayList
        ArrayList<Integer> list = ListManip.listFromScanner();
        println(list.toString());
        ListManip.sort(list);
        println(list.toString());
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
}