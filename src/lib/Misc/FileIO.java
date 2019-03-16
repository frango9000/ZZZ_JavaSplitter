package lib.Misc;

import lib.Data.ArrayManip;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

import static lib.Misc.IO.print;

public class FileIO {

    public static void sort(File file) {
        String fileStr = "";
        try {
            fileStr = FileIn.fileToString(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] array = fileStr.split("\n");
        ArrayManip.bubbleSort(array);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append("\n");
        }
        try {
            FileOut.printOnFile(file, sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        print(Arrays.toString(array));
    }

    public static void replace(File file, String replaceThis, String replaceTo) {
        StringBuilder s2 = new StringBuilder();
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String s1 = input.nextLine();
                s2.append(s1.replaceAll(replaceThis, replaceTo)).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try(PrintWriter output = new PrintWriter(file)){
            output.println(s2.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
