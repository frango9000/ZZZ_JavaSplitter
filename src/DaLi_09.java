import lib.Data.ArrayTool;
import lib.Geometry.Rectangle;
import lib.Misc.Randomizer;

import java.util.Date;

import static lib.Misc.IO.*;
public abstract class DaLi_09 {

    public static void main(String[] args) {
        ex04();

    }

    public static void ex00() {
    }

    public static void ex01() {
        Rectangle rect1 = new Rectangle(4,40);
        Rectangle rect2 = new Rectangle(3.5,35.9);

        println("%.3f %.3f %.3f %.3f", rect1.getWidth(), rect1.getHeight(), rect1.area(), rect1.perimeter());
        println("%.3f %.3f %.3f %.3f", rect2.getWidth(), rect2.getHeight(), rect2.area(), rect2.perimeter());
    }

    public static void ex02() {
    }

    public static void ex03() {
        int exp = 18;
        for (int i = 1; i <= exp; i++) {
            Date date = new Date((long)Math.pow(10, i));
            println(date.toString());
        }
    }

    public static void ex04() {
        ArrayTool.printArray(Randomizer.randomIntsArray(50, 0, 100));
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