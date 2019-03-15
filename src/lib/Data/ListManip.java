package lib.Data;

import java.util.ArrayList;
import java.util.Arrays;

public class ListManip {
    public static void printList(ArrayList<int[]> list) {
        printList(list, 0, list.size() - 1, false, 0);
    }

    public static void printList(ArrayList<int[]> list, boolean withIndex, int firstIndex) {
        printList(list, 0, list.size() - 1, withIndex, firstIndex);
    }

    public static void printList(ArrayList<int[]> list, int start, int end, boolean withIndex, int firstIndex) {
        String index = "";
        if (!(start > list.size() - 1 || end > list.size() - 1 || start < 0 || end < 0))
            for (int i = start; i < list.size() && i <= end; i++) {
                if (withIndex)
                    index = (i + firstIndex) + " ";
                System.out.println(index + Arrays.toString(list.get(i)));
            }
    }

    public static int[][] listToMatrix(ArrayList<int[]> list) {
        int[][] array = new int[list.size()][];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static Integer max(ArrayList<Integer> list){
        if( list == null || list.size() ==0 )
            return null;
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i)> max)
                max = list.get(i);

        }
        return max;
    }
}
