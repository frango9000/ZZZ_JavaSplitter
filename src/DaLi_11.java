import lib.Data.ListManip;
import lib.Geometry.Triangle;

import java.util.ArrayList;

import static lib.Misc.IO.print;
import static lib.Misc.IO.scanInt;

public abstract class DaLi_11 {

    public static void main(String[] args) {
        ex04();

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
        ArrayList<Integer> list = new ArrayList<>();
        int i = -1;
        while(i != 0){
            i=scanInt();
            list.add(i);
        }
        print(ListManip.max(list));
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