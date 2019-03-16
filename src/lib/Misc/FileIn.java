package lib.Misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIn {


    public static String fileToString(File file) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        try(Scanner scan = new Scanner(file)){
            while(scan.hasNextLine())
                content.append(scan.nextLine()).append("\n");
        }
        return content.toString();
    }

    public static int indexOfLine(File file, String line) throws FileNotFoundException {
        int lineNumber = 1;
        try(Scanner scan = new Scanner(file)){
            while(scan.hasNextLine()) {
                if (scan.nextLine().equals(line))
                    return lineNumber;
                else lineNumber++;
            }
        }
        return -1;
    }
}
