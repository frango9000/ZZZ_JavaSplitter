package lib.Misc;

public abstract class Time {
    public static float secondsToHours(float seconds){
        return (seconds/60)/60;
    }
    public static float minutesToHours(float minutes){
        return minutes/60;
    }

}
