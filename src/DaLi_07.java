import lib.Data.ArrayTool;
import lib.Math.*;

import java.util.Arrays;

import static lib.Misc.IO.*;
import static lib.Misc.Randomizer.*;

public class DaLi_07 {
    public static void main(String[] args) {

        ex12();

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
        int[] nums = randomIntsArray(20, 1,9);
        int odd=0,even=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0)even++;
            else odd++;
        }
        printf("%d odds%n%d evens", odd, even);
    }
    public static void ex06() {
        boolean[] primes = new boolean[50];
        Arrays.fill(primes, true);
        for (int i = 2; i < primes.length; i++)
            for (int j = i+1; j < primes.length; j++)
                if(j % i == 0)
                    primes[j]=false;
        for (int i = 0; i < primes.length; i++)
            if (primes[i])
                printf("%d is prime\n", i);
    }
    public static void ex07() {
        int[] rands = randomIntsArray(200, 9);
        int[] counts= new int[10];
        for (int i = 0; i < rands.length; i++) {
            counts[rands[i]]++;
        }
        for (int i = 0; i < counts.length; i++) {
            printf("%d %d\n",i, counts[i]);
        }
    }
    public static void ex08() {
        print(Statistics.mean(randomDoublesArray(5, 0, 5)));
    }
    public static void ex09() {
        print(ArrayTool.max(randomDoublesArray(5, 0, 5)));
    }
    public static void ex10() {
        print(ArrayTool.indexOfMax(randomDoublesArray(50, 0, 5)));
    }
    public static void ex11() {
        double[] rands = randomDoublesArray(10, 0, 10);
        println(Statistics.mean(rands));
        println(Statistics.standardDeviation(rands));
        println(Statistics.standardDeviationAlt(rands));
    }
    public static void ex12() {
        int[] rands = randomIntsArray(10, 10);
        ArrayTool.printArray(rands);
        ArrayTool.printArray(ArrayTool.reverseArray(rands));
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
