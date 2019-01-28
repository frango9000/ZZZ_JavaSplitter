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
}
