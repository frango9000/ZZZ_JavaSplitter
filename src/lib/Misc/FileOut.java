package lib.Misc;

import java.io.*;

public class FileOut {

    public static void printOnFile(File file, String string) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(string);
        }
    }

    public static void printOnFile(File file, String[] strings) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(file)) {
            for (String string : strings) {
                pw.println(string);
            }
        }
    }

    public static void appendOnFile(File file, String string) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
            pw.println(string);
        }
    }

    public static void appendOnFile(File file, String[] strings) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
            for (String string : strings) {
                pw.println(string);
            }
        }
    }


    public static void prependOnFile(File file, String string) throws IOException {
        String fileStr = FileIn.fileToString(file);
        FileOut.printOnFile(file, string);
        FileOut.appendOnFile(file, fileStr);
    }

    public static void prependOnFile(File file, String[] strings) throws IOException {
        String[] array = FileIn.fileToArray(file);
        FileOut.printOnFile(file, strings);
        FileOut.appendOnFile(file, array);
    }

}
