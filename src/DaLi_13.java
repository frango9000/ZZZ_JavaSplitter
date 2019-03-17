import lib.Data.ListManip;
import lib.Misc.Randomizer;

import java.util.ArrayList;

import static lib.Misc.IO.print;

public abstract class DaLi_13 {

    public static void main(String[] args) {
        ex03();

    }

    public static void ex00() {
    }
    public static void ex01() {
    }
    public static void ex02() {//Average ArrayList
        ArrayList<Integer> list = Randomizer.randomIntList(10,100);
        int sum = ListManip.sum(list);
        double avg = (float)sum / list.size();
        print(avg);
    }
    public static void ex03() {//Sort ArrayList
        ArrayList<Integer> list = Randomizer.randomIntList(10,100);
        ListManip.sort(list);
        print(list.toString());
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
}