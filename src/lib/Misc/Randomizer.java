package lib.Misc;

import java.util.Random;

public abstract class Randomizer {

    public static int randomInt(){
        Random rand = new Random();
        return rand.nextInt();
    }

    public static int randomInt(int bound){
        Random rand = new Random();
        return rand.nextInt(bound);
    }

    public static int[] randomIntsArray(int elements, int lowBound, int highBound){
        int range = highBound-lowBound+1;
        int[] randoms = new int[elements];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = randomInt(range)+lowBound;
        }
        return randoms;
    }
    public static int[] randomIntsArray(int elements, int highBound){
        return randomIntsArray(elements, 0, highBound);
    }
    public static int[] randomIntsArray(int elements){
        return randomIntsArray(elements, 100);
    }
}
