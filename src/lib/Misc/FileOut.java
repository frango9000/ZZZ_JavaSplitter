package lib.Misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOut {

    public static void printOnFile(File file,String string) throws FileNotFoundException {
        try(PrintWriter pw = new PrintWriter(file)){
            pw.print(string);
        }
    }

    public static void printOnFile(File file,String[] strings) throws FileNotFoundException {
        try(PrintWriter pw = new PrintWriter(file)){
            for (String string : strings) {
                pw.println(string);
            }
        }
    }
}
