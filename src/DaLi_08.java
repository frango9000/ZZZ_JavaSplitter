import auxp.ch08.TicTacToe;
import lib.Data.ArrayTool;
import lib.Data.MatrixManip;
import lib.Data.StringManip;
import lib.Geometry.Line;
import lib.Geometry.Point;
import lib.Math.Algebra;
import lib.Misc.Randomizer;

import java.util.Arrays;

import static lib.Misc.IO.*;
import static lib.Misc.Randomizer.*;

public class DaLi_08 {
    public static void main(String[] args) {
        ex19();
    }
    public static void ex00(){
    }
    public static void ex01(){
        int[][] table = randomIntsTable(3, 4, 1, 10);
        MatrixManip.printTable(table, 6);
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
        MatrixManip.printTable(table, 6);
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
        MatrixManip.printTable(matrix1);
        double[][] matrix2 = randomDoublesTable(3, 3, 1, 4);
        MatrixManip.printTable(matrix2);
        MatrixManip.printTable(ex05addMatrix(matrix1, matrix2));
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
        MatrixManip.printTable(matrix1);
        double[][] matrix2 = randomDoublesTable(3, 3, 1, 4);
        MatrixManip.printTable(matrix2);
        MatrixManip.printTable(ex06multiplyMatrix(matrix1, matrix2));

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
        double[][] ps = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
        Point[] points = Point.toPointsArray(ps);
        int[] cp = Point.closestPointsIndex(points);
        println(points[cp[0]].toString3()+" "+points[cp[1]].toString3());
    }
    public static void ex08(){
        Point[] points = {new Point(0,0), new Point(1,1 ), new Point(-1,-1), new Point(2,2), new Point(-2, -2), new Point(-3,-3), new Point(-4,-4), new Point(5,5)};
        println(Point.closestPoints(points));
    }
    public static void ex09(){
        TicTacToe.main();
    }
    public static void ex10(){
        int[][] table = randomIntsTable(5, 5, 0, 1);
        MatrixManip.printTable(table, 2);
        int largeRow = -1, largeCol = -1, tempRow = 0, tempCol = 0;
        int rowIndx = -1, colIndx = -1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                tempRow += table[i][j];
            }
            if (tempRow > largeRow) {
                largeRow = tempRow;
                rowIndx = i;
            }
            tempRow = 0;
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                tempCol += table[j][i];
            }
            if (tempCol > largeCol) {
                largeCol = tempCol;
                colIndx = i;
            }
            tempCol = 0;
        }
        print("Max row %d%nMax col %d", rowIndx, colIndx);
    }
    public static void ex11(){
        short number = scanShort("Enter a number ( 0 - 511 )");
        char[][] table = new char[3][3];
        number = (short) Algebra.min(number,511);
        number = (short) Algebra.max(number,0);
        String bin = StringManip.toBinaryString(number, 9);
        println(bin);
        int t =0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = bin.charAt(t++);
            }
        }
        MatrixManip.printTable(table);
    }
    public static void ex12(){
    }
    public static void ex13(){
        double[][] table = randomDoublesTable(10,10,0,10);
        MatrixManip.printTable(table);
        print(MatrixManip.indexOfMax(table)[0]+" "+MatrixManip.indexOfMax(table)[1]);
    }
    public static void ex14(){
        short size = 3;//scanShort("Enter size: ");
        int random = randomInt((int) Math.pow(2, size * size));
        String bin = StringManip.toBinaryString(random, size * size);
        char[][] table = MatrixManip.buildTable(size, size, bin.toCharArray());
        MatrixManip.printTable(table);
        ex14rows(table);
        ex14cols(table);
        ex14diag(table);

    }
    public static void ex14rows(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            char t = table[i][0];
            int count = 0;
            for (int j = 0; j < table[i].length; j++) {
                if (t == table[i][j])
                    count++;
            }
            if (count == table[i].length) {
                println("All %cs on row %d", t, i);
            }
        }
    }
    public static void ex14cols(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            char t = table[0][i];
            int count = 0;
            for (int j = 0; j < table[i].length; j++) {
                if (t == table[j][i])
                    count++;
            }
            if (count == table[i].length)
                println("All %cs on col %d", t, i);
        }
    }
    public static void ex14diag(char[][] table) {
        char t = table[0][0];
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            if (t == table[i][i])
                count++;
        }
        if (count == table.length)
            println("All %cs on major diag", t);

        t = table[table.length - 1][table[table.length - 1].length - 1];
        count = 0;
        for (int i = 0, j = table[i].length - 1; i < table.length; i++, j--) {
            if (t == table[i][j])
                count++;
        }
        if (count == table.length)
            println("All %cs on minor diag", t);
    }
    public static void ex15(){
        Point[] points1 = { new Point(3.4,2),new Point(6.5,9.5),new Point(2.3,2.3),new Point(5.5,5),new Point(-5,4)};
        Point[] points2 = { new Point(1,1),  new Point(2,2),    new Point(3,3),    new Point(4,4),  new Point(5,5) };

        Line lineA = new Line(points1[0],points1[1]);
        Line lineB = new Line(points2[0],points2[1]);

        ArrayTool.printArray(lineA.crossProduct(points1));
        ArrayTool.printArray(lineB.crossProduct(points2));
    }
    public static void ex16(){
        int[][] table = randomIntsTable(16, 5, 0, 1);
        MatrixManip.printTable(table);
        MatrixManip.sort(table);
        println("");
        MatrixManip.printTable(table);
    }
    public static void ex17(){
    }
    public static void ex18(){
        int[][] table = randomIntsTable(5, 2, 0, 5);
        MatrixManip.printTable(table);
        ex18shuffle(table);
        println("");
        MatrixManip.printTable(table);
    }
    public static void ex18shuffle(int[][] table){
        for (int i = 0; i < table.length; i++) {
            int random = Randomizer.randomInt(table.length-1);
            int[] temp = table[i];
            table[i] = table[random];
            table[random] = temp;
        }
    }
    public static void ex19(){
        int[][] table ={ {2,2,3,4},
                         {1,4,4,1},
                         {1,4,4,2},
                         {4,2,4,4} };
        print(ex19HasConsecutiveFour(table));
    }
    public static boolean ex19HasConsecutiveFour(int[][] table){
        //pre-check
        if( table.length < 4 || table[0].length < 4 )
            return false;
        //Rows
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length - 3; j++) {
                if( table[i][j] == table[i][j+1] && table[i][j] == table[i][j+2] && table[i][j] == table[i][j+3] ){
                    return true;
                }
            }
        }
        //Cols
        for (int i = 0; i < table.length - 3; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if( table[i][j] == table[i+1][j] && table[i][j] == table[i+2][j] && table[i][j] == table[i+3][j] ){
                    return true;
                }
            }
        }
        //Diag
        for (int i = 0; i < table.length - 3; i++) {
            for (int j = 0; j < table[i].length - 3; j++) {
                if( table[i][j] == table[i+1][j+1] && table[i][j] == table[i+2][j+2] && table[i][j] == table[i+3][j+3] ){
                    return true;
                }
            }
        }
        //Diag
        for (int i = 0; i < table.length - 3; i++) {
            for (int j = 3; j < table[i].length; j++) {
                if( table[i][j] == table[i+1][j-1] && table[i][j] == table[i+2][j-2] && table[i][j] == table[i+3][j-3] ){
                    return true;
                }
            }
        }

        return false;
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
