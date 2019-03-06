package lib.Data;

import java.util.ArrayList;
import java.util.Arrays;

public class ListManip {
    public static void printList(ArrayList<int[]> list){
        printList(list, false);
    }
    public static void printList(ArrayList<int[]> list, boolean withIndex){
        String index = "";
        for (int i = 0; i < list.size(); i++) {
            if(withIndex)
                index = i +" ";
            System.out.println(index + Arrays.toString(list.get(i)));
        }
    }
}
