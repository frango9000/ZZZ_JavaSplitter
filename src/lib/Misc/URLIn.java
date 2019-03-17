package lib.Misc;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class URLIn {

    public static String urlToString(URL url) throws IOException {
        StringBuilder content = new StringBuilder();
        try (Scanner scan = new Scanner(url.openStream())) {
            while (scan.hasNext()) {
                content.append(scan.nextLine()).append("\n");
            }
        }
        return content.toString();
    }

    public static String[] urlToArray(URL url) throws IOException {
        return urlToString(url).split("\n");
    }
}
