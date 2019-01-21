package lib.Misc;



public abstract class Time {
    // Obtain the total milliseconds since midnight, Jan 1, 1970
    static long totalMilliseconds = System.currentTimeMillis();
    // Obtain the total seconds since midnight, Jan 1, 1970
    static long totalSeconds = totalMilliseconds / 1000;
    // Compute the current second in the minute in the hour
    static long currentSecond = totalSeconds % 60;
    // Obtain the total minutes
    static long totalMinutes = totalSeconds / 60;
    // Compute the current minute in the hour
    static long currentMinute = totalMinutes % 60;
    // Obtain the total hours
    static long totalHours = totalMinutes / 60;
    // Compute the current hour
    static long currentHour = totalHours % 24;

    public static String timeToString(){
        return("Current time is " + currentHour + ":"+ currentMinute + ":" + currentSecond + " local ");
    }
    public static String timeToString(byte offset){
        long offsetHour=currentHour + offset;
        if (offsetHour>=24)offsetHour-=24;
        return("Current time is " + offsetHour + ":" + currentMinute + ":" + currentSecond + " local " + offset);
    }

    public static float secondsToHours(float seconds) {
        return (seconds / 60) / 60;
    }

    public static float minutesToHours(float minutes) {
        return minutes / 60;
    }

    public static double minutesToYears(int minutes) {
        return minutes / 60f / 24f / 365f;
    }

    public static double yearsToDays(double years) {
        return years * 365;
    }

}
