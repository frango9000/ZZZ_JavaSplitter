import lib.Geometry.Pentagon;
import lib.Geometry.Polygon;
import lib.Geometry.Triangle;
import lib.Math.Algebra;
import lib.Math.Extras;
import lib.Math.Primes;
import lib.Math.Scales;
import lib.Data.StringManip;
import lib.Data.CharManip;
import lib.Misc.Time;

import static lib.Misc.IO.*;
import static lib.Misc.Randomizer.*;

public class DaLi_07 {
    public static void main(String[] args) {

        ex04();

    }

    public static void ex00() {
    }
    public static void ex01() {
        byte number = scanByte("Number of students ");
        int[] students = new int[number];
        int best =0;
        for (int i = 0; i < students.length; i++) {
            students[i]= scanByte("Enter grade for student " + (i+1));
            if(students[i]>best)best=students[i];
        }
        for (int i = 1; i <= students.length ; i++) {
            if(students[i] >= best - 5 ) printf("Student %d grade A", i);
            else if(students[i] >= best - 10 ) printf("Student %d grade B", i);
            else if(students[i] >= best - 15 ) printf("Student %d grade C", i);
            else if(students[i] >= best - 20 ) printf("Student %d grade D", i);
            else printf("Student %d grade F", i);
            println("");
        }
    }
    public static void ex02() {
        int[] eleven = new int[11];
        for (int i = 0; i < eleven.length; i++) {
            eleven[i]=scanInt("Enter number " + (i+1) + " ");
        }
        for (int i = 0; i < eleven.length -1; i++) {
            if ( eleven[i] < eleven[10] )println("lesser");
            else if ( eleven[i] > eleven[10] )println("greater");
            else println("equal");
        }
    }
    public static void ex03() {
        int[] numbers = new int[100];
        int num = -1;
        for (int i = 0; num != 0; i++) {
            num = scanInt("Enter numbers; 0 to break;");
            if (num > 0 && num < 101)
                numbers[num]++;
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 0)
                printf(" number %d appears %d time%s\n", i, numbers[i], numbers[i]>1?"s":"");

        }
    }
    public static void ex04() {
        int[] numbers = new int[100];
        int num = -1;
        int count = 0;
        for (int i = 0; num != 0; i++) {
            num = scanInt("Enter numbers; 0 to break;");
            if (num > 0 && num < 101) {
                count++;
                numbers[num]++;
            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] * i;
        }
        float average = sum / (float) count;
        int above = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (i >= average && numbers[i] > 0) {
                above += numbers[i];
            }
        }
        printf("average: %f,%n above avg count:%d", average, above);
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
    public static void ex34() {
    }
    public static void ex35() {
    }
    public static void ex36() {
    }
    public static void ex37() {
    }
}
