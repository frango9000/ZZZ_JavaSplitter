package lib.Misc;

import lib.Data.ArrayManip;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

import static lib.Misc.IO.print;

public class FileIO {

    public static void sort(File file){
        String fileStr = "";
        try {
             fileStr = FileIn.fileToString(file);
        }catch (FileNotFoundException e){
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
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        print(Arrays.toString(array));
    }
}
