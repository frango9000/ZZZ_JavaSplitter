package lib.Data;

public class MatrixManip {
    public static void printTable(int[][] table) {
        printTable(table, 4);
    }

    public static void printTable(int[][] table, int spacing) {
        for (int[] row : table) {
            for (int cell : row) {
                System.out.printf("%" + spacing + "d", cell);
            }
            System.out.println();
        }
    }

    public static void printTable(char[][] table) {
        printTable(table, 4);
    }

    public static void printTable(char[][] table, int spacing) {
        for (char[] row : table) {
            for (char cell : row) {
                System.out.printf("%" + spacing + "c", cell);
            }
            System.out.println();
        }
    }

    public static void printTable(double[][] table) {
        printTable(table, 8, 2);
    }

    public static void printTable(double[][] table, int spacing, int decimalDigits) {
        for (double[] row : table) {
            for (double cell : row) {
                System.out.printf("%" + spacing + "." + decimalDigits + "f", cell);
            }
            System.out.println();
        }
    }

    public static int[][] buildTable(int rows, int cols, int... numbers){
        int[][] table = new int[rows][cols];
        int t = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if(numbers.length > t)
                    table[i][j] = numbers[t++];
                else table[i][j] = 0;
            }
        }
        return table;
    }
    public static double[][] buildTable(int rows, int cols, double... numbers){
        double[][] table = new double[rows][cols];
        int t = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if(numbers.length > t)
                    table[i][j] = numbers[t++];
                else table[i][j] = 0;
            }
        }
        return table;
    }
    public static char[][] buildTable(int rows, int cols, char... chars){
        char[][] table = new char[rows][cols];
        int t = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if(chars.length > t)
                    table[i][j] = chars[t++];
                else table[i][j] = 0;
            }
        }
        return table;
    }

    public static double max(double[][] table) {
        double max = table[0][0];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] > max) {
                    max = table[i][j];
                }
            }
        }
        return max;
    }

    public static int[] indexOfMax(double[][] table) {
        int[] indexOfMax = {0, 0};
        double max = table[0][0];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] > max) {
                    max = table[i][j];
                    indexOfMax[0] = i;
                    indexOfMax[1] = j;
                }
            }
        }
        return indexOfMax;
    }

    public static double min(double[][] table) {
        double min = table[0][0];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] > min) {
                    min = table[i][j];
                }
            }
        }
        return min;
    }

    public static int[] indexOfMin(double[][] table) {
        int[] indexOfMin = {0, 0};
        double min = table[0][0];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] > min) {
                    min = table[i][j];
                    indexOfMin[0] = i;
                    indexOfMin[1] = j;
                }
            }
        }
        return indexOfMin;
    }
}
