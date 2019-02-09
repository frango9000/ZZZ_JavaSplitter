package auxp.ch06;

public class Misc06 {
    public static boolean isConsecutiveFour(int[] array){
        for (int i = 0; i < array.length - 3; i++)
            if( array[i] == array[i+1] && array[i] == array[i+2] && array[i] == array[i+3] )
                return true;
        return false;
    }
}
