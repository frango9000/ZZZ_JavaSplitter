package lib.Misc;

import java.util.Scanner;

public abstract class IO {

    public static void println(Object str){
        System.out.println(str);
    }
    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    public static float scanFloat(){
        return scanner().nextFloat();
    }

}
