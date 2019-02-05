package lib.Data;

public class ArrayTool {

    public static int[] arrayDeRepetidos(int[] array, int num) {
        int size = contarRepetidos(array, num);
        int[] j = new int[size];
        int h = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                j[h] = i;
                h++;
            }
        }
        return j;
    }

    public static int[] agregarIndice(int[] array, int indice, int elemento) {
        int[] nuevoArray = new int[array.length + 1];
        for (int i = 0; i < nuevoArray.length; i++) {
            if (i < indice) {
                nuevoArray[i] = array[i];
            } else if (i == indice) {
                nuevoArray[i] = elemento;
            } else if (i > indice) {
                nuevoArray[i] = array[i - 1];
            }
        }
        return nuevoArray;
    }

    public static int contarRepetidos(int[] array, int num) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                j++;
            }
        }
        return j;
    }

    public static int[] eliminarIndice(int[] array, int indice) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indice) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    public static int[] arrayOrdenado(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int buscarIndice(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int indexOfMax(double[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }
}
