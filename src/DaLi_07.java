import lib.Data.ArrayTool;
import lib.Math.*;
import lib.Misc.IO;

import java.util.Arrays;

import static lib.Misc.IO.*;
import static lib.Misc.Randomizer.*;

public class DaLi_07 {
    public static void main(String[] args) {

        ex22();

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
            if(students[i] >= best - 5 ) IO.print("Student %d grade A", i);
            else if(students[i] >= best - 10 ) IO.print("Student %d grade B", i);
            else if(students[i] >= best - 15 ) IO.print("Student %d grade C", i);
            else if(students[i] >= best - 20 ) IO.print("Student %d grade D", i);
            else IO.print("Student %d grade F", i);
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
                IO.print(" number %d appears %d time%s\n", i, numbers[i], numbers[i]>1?"s":"");

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
        IO.print("average: %f,%n above avg count:%d", average, above);
    }
    public static void ex05() {
        int[] nums = randomIntsArray(20, 1,9);
        int odd=0,even=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0)even++;
            else odd++;
        }
        IO.print("%d odds%n%d evens", odd, even);
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
                IO.print("%d is prime\n", i);
    }
    public static void ex07() {
        int[] rands = randomIntsArray(200, 9);
        int[] counts= new int[10];
        for (int i = 0; i < rands.length; i++) {
            counts[rands[i]]++;
        }
        for (int i = 0; i < counts.length; i++) {
            IO.print("%d %d\n",i, counts[i]);
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
        int[] rands = randomIntsArray(10, 10);
        ArrayTool.printArray(rands);
        IO.print("%n%d",ArrayTool.getRandom(rands));
    }
    public static void ex14() {
        int[] rands = randomIntsArray(10, 5,100);
        ArrayTool.printArray(rands);
        IO.print("%n%d",Algebra.greatestCommonDivisor(rands));
        IO.print("%n%d",Algebra.leastCommonMultiple(rands));
    }
    public static void ex15() {
        int[] rands = randomIntsArray(10, 5,9);
        ArrayTool.printArray(rands);
        println("");
        rands =ArrayTool.removeDuplicates(rands);
        ArrayTool.printArray(rands);
    }
    public static void ex16() {
        int[] array = new int[100000000];
        for (int i = 1; i < array.length; i++) {
            array[i] = i;
        }
        long startTime, endTime, totalTime;
        int search, index;
        int[] searches = {1,25000000,50000000,75000000,10000000};

        for (int i = 0; i < searches.length; i++) {

            search = searches[i];
            startTime = System.nanoTime();
            index = ArrayTool.linearSearch(array, search);
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            IO.print("Linear search of number %d took %dns found in index %d%n", search, totalTime,index);

            startTime = System.nanoTime();
            index = ArrayTool.binarySearch(array, search);
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            IO.print("Binary search of number %d took %dns found in index %d%n%n", search, totalTime,index);
        }
    }
    public static void ex17() {
        int numberOfStudents = scanInt("Enter number of students: ");
        int[] grades = new int[numberOfStudents];
        String[] names = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            grades[i]=scanInt("Enter Grade of student %d:", (i+1));
            names[i]=scanNext("Enter Name of student %d:", (i+1));
        }
        int[] sortedIndexes = ArrayTool.bubbleSortIndex(grades);

        for (int i = 0; i < sortedIndexes.length; i++) {
            print("%d Name: %s grade: %d%n", i,names[sortedIndexes[i]], grades[sortedIndexes[i]] );
        }
    }
    public static void ex18() {
        int[] rands = randomIntsArray(10, 0, 50);
        ArrayTool.bubbleSort(rands);
        ArrayTool.printArray(rands);
    }
    public static void ex19() {
        int[] rands = randomIntsArray(10, 0, 50);
        ArrayTool.bubbleSort(rands);
        ArrayTool.printArray(rands);
        println(ArrayTool.isSorted(rands));
        println(ArrayTool.isSortedDesc(rands));

        ArrayTool.bubbleSortDesc(rands);
        println(ArrayTool.isSorted(rands));
        println(ArrayTool.isSortedDesc(rands));
    }
    public static void ex20() {
        ex19();
    }
    public static void ex21() {
        int[] rands = randomIntsArray(10, 0, 50);
        int max = rands[ArrayTool.indexOfMax(rands)];

        for (int i = 0; i < rands.length; i++) {
            println(Extras.map(rands[i], 0,max, 0, 1));
        }
    }
    public static void ex22() {
        String string = scanNext("Enter string ");
        int countHigh = 0, countLow = 0;
        for (int i = 0; i < string.length(); i++) {
            if( string.charAt(i) >= 'A' && string.charAt(i) <= 'Z' )
                countHigh++;
            else if ( string.charAt(i) >= 'a' && string.charAt(i) <= 'z' )
                countLow++;
        }
        print("%d Uppercases,%n%d Lowercases.", countHigh,countLow);
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
