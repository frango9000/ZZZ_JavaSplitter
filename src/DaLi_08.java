import lib.Data.ArrayTool;
import lib.Geometry.Point;
import lib.Math.Algebra;

import java.util.Arrays;

import static lib.Misc.IO.*;
import static lib.Misc.Randomizer.*;

public class DaLi_08 {
    public static void main(String[] args) {
        ex07();
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
        int[][] table = randomIntsTable(7, 8, 1, 9);
        for (int i = 0; i < table.length; i++) {

            println(Arrays.toString(table[i]) + " " + ex01sumOfRow(table[i]));
        }
    }
    public static void ex05(){
        double[][] matrix1 = randomDoublesTable(3, 3, 1, 4);
        ArrayTool.printTable(matrix1);
        double[][] matrix2 = randomDoublesTable(3, 3, 1, 4);
        ArrayTool.printTable(matrix2);
        ArrayTool.printTable(ex05addMatrix(matrix1, matrix2));
    }
    public static double[][] ex05addMatrix(double[][] matrix1, double[][] matrix2){
        if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            double[][] addition = new double[matrix1.length][matrix2[0].length];
            for (int i = 0; i < addition.length; i++) {
                for (int j = 0; j < addition[i].length; j++) {
                    addition[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return addition;
        }else return null;
    }
    public static void ex06(){
        double[][] matrix1 = randomDoublesTable(3, 3, 1, 4);
        ArrayTool.printTable(matrix1);
        double[][] matrix2 = randomDoublesTable(3, 3, 1, 4);
        ArrayTool.printTable(matrix2);
        ArrayTool.printTable(ex06multiplyMatrix(matrix1, matrix2));

    }
    public static double[][] ex06multiplyMatrix(double[][] matrix1, double[][] matrix2){
        double[][] dotProduct = new double[Algebra.min(matrix1.length, matrix2.length)][Algebra.min(matrix1[0].length, matrix2[0].length)];
        for (int i = 0; i < dotProduct.length; i++) {
            for (int j = 0; j < dotProduct[0].length; j++) {
                dotProduct[i][j] += matrix1[i][j] * matrix2[j][i];
            }
        }
        return dotProduct;
    }
    public static void ex07(){
        Point[] points = {new Point(-1,3), new Point(-1,-1 ), new Point(1,1), new Point(2,0.5), new Point(2, -1), new Point(3,3), new Point(4,2), new Point(4,-0.5)};
        int[] cp = Point.closestPoints(points);
        println(points[cp[0]]+" "+points[cp[1]]);
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
