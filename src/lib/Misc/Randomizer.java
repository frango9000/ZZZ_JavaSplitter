package lib.Misc;

import java.util.Random;

public abstract class Randomizer {

    public static Random random(){
        return new Random();
    }

    public static int randomInt(){
        return random().nextInt();
    }
    public static double randomDouble(){
        return random().nextDouble();
    }

    public static int randomInt(int bound){
        return random().nextInt(bound);
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

    public static double[] randomDoublesArray(int elements, double lowBound, double highBound){
        int precision = 1000000;
        double range = (highBound-lowBound+1) * precision;
        double[] randoms = new double[elements];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (randomInt((int)range)+(precision*lowBound))/precision;
        }
        return randoms;
    }
    public static double[] randomDoublesArray(int elements, double highBound){
        return randomDoublesArray(elements, 0, highBound);
    }
    public static double[] randomDoublesArray(int elements){
        return randomDoublesArray(elements, 100);
    }

}
