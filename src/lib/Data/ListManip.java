package lib.Data;

import lib.Misc.Randomizer;

import java.util.ArrayList;
import java.util.Arrays;

import static lib.Misc.IO.scanInt;

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

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0)
            return null;
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);

        }
        return max;
    }

    public static void shuffle(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            int rand = Randomizer.randomInt(list.size());
            list.set(i, list.get(rand));
            list.set(rand, integer);
        }
    }

    public static ArrayList<Integer> listFromScanner() {
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        while (true) {
            i = scanInt();
            if (i == 0)
                break;
            list.add(i);
        }
        return list;
    }

    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer integer = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, integer);
                }
            }
        }
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); ) {
            if (list2.contains(list.get(i)))
                list.remove(i);
            else {
                list2.add(list.get(i));
                i++;
            }
        }
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> union = new ArrayList<>(list1.size() + list2.size());
        union.addAll(list1);
        union.addAll(list2);
        return union;
    }

    public static ArrayList<Character> toCharList(String str) {
        ArrayList<Character> toCharList = new ArrayList<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            toCharList.add(str.charAt(i));
        }
        return toCharList;
    }
}
