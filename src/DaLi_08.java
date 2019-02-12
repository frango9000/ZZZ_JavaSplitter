import lib.Data.ArrayTool;

import static lib.Misc.IO.*;
import static lib.Misc.Randomizer.*;

public class DaLi_08 {
    public static void main(String[] args) {
        ex03();
    }
    public static void ex00(){
    }
    public static void ex01(){
        int[][] table = randomIntsTable(3, 4, 1, 10);
        ArrayTool.printTable(table, 6);
        for (int i = 0; i < table.length; i++) {
            print("Sum of row %d  = %d\n", i, ex01sumOfRow(table[i]));

        }
    }
    public static int ex01sumOfRow(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static void ex02(){
        int[][] table = randomIntsTable(4, 4, 1, 10);
        ArrayTool.printTable(table, 6);
        print(ex02averageMajorDiagonal(table));

    }
    public static double ex02averageMajorDiagonal(int[][] table){
        int sum = 0;
        int diagonalLength = (table.length <= table[0].length) ? table.length : table[0].length;
        for (int i = 0; i < diagonalLength; i++) {
            sum += table[i][i];
        }
        return sum/(float)diagonalLength;
    }
    public static void ex03(){
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] correct= new int[answers.length];
        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student

            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correct[i]++;
            }

            System.out.println("Student " + i + "'s correct count is " +
                    correct[i]);
        }
        int[] ordered = ArrayTool.bubbleSortIndexDesc(correct);
        for (int i = 0; i < ordered.length; i++) {
            printf("Student %d correct count is %d\n", ordered[i], correct[ordered[i]]);
        }
    }
    public static void ex04(){
    }
    public static void ex05(){
    }
    public static void ex06(){
    }
    public static void ex07(){
    }
    public static void ex08(){
    }
    public static void ex09(){
    }
    public static void ex10(){
    }
    public static void ex11(){
    }
    public static void ex12(){
    }
    public static void ex13(){
    }
    public static void ex14(){
    }
    public static void ex15(){
    }
    public static void ex16(){
    }
    public static void ex17(){
    }
    public static void ex18(){
    }
    public static void ex19(){
    }
    public static void ex20(){
    }
    public static void ex21(){
    }
    public static void ex22(){
    }
    public static void ex23(){
    }
    public static void ex24(){
    }
    public static void ex25(){
    }
    public static void ex26(){
    }
    public static void ex27(){
    }
    public static void ex28(){
    }
    public static void ex29(){
    }
    public static void ex30(){
    }
    public static void ex31(){
    }
    public static void ex32(){
    }
    public static void ex33(){
    }
    public static void ex34(){
    }
    public static void ex35(){
    }
    public static void ex36(){
    }
    public static void ex37(){
    }
}
