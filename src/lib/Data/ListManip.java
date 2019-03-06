package lib.Data;

import java.util.ArrayList;
import java.util.Arrays;

public class ListManip {
    public static void printList(ArrayList<int[]> list){
        for ( int[] o:list) {
            System.out.println(Arrays.toString(o));
        }

    }
}
