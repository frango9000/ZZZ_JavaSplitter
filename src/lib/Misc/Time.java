package lib.Misc;

public class Time {
    // Obtain the total milliseconds since midnight, Jan 1, 1970
    long totalMilliseconds = System.currentTimeMillis();
    // Obtain the total seconds since midnight, Jan 1, 1970
    long totalSeconds = totalMilliseconds / 1000;
    // Compute the current second in the minute in the hour
    long currentSecond = totalSeconds % 60;
    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;
    // Compute the current minute in the hour
    long currentMinute = totalMinutes % 60;
    // Obtain the total hours
    long totalHours = totalMinutes / 60;
    // Compute the current hour
    long currentHour = totalHours % 24;

    long totalDays = totalHours / 24;

    public Time() {
    }

    public Time(long totalMilliseconds) {
        this.totalMilliseconds = totalMilliseconds;
    }

    public static String millisToTimeString(long millis) {
        long totalMilliseconds = millis;
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        return totalHours + ":" + currentMinute + ":" + currentSecond;
    }

    public long getCurrentSecond() {
        return currentSecond;
    }

    public void setCurrentSecond(long currentSecond) {
        this.currentSecond = currentSecond;
    }

    public long getCurrentMinute() {
        return currentMinute;
    }

    public void setCurrentMinute(long currentMinute) {
        this.currentMinute = currentMinute;
    }

    public long getCurrentHour() {
        return currentHour;
    }

    public void setCurrentHour(long currentHour) {
        this.currentHour = currentHour;
    }

    public void setTime() {
        long totalMilliseconds = System.currentTimeMillis();
    }

    public String timeToString() {
        return ("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT: ");
    }

    public String timeToStringM(byte offset) {
        long offsetHour = currentHour + offset;
        if (offsetHour >= 24) offsetHour -= 24;
        return ("Current time is " + offsetHour + ":" + currentMinute + ":" + currentSecond + " GMT: " + offset);
    }

    public String timeToString(byte offset) {
        long offsetHour = currentHour + offset;
        String post = "AM";
        if (offsetHour >= 24) offsetHour -= 24;
        if (offsetHour > 12) {
            offsetHour -= 12;
            post = "PM";
        }
        return ("Current time is " + offsetHour + ":" + currentMinute + ":" + currentSecond + " " + post + " GMT: " + offset);
    }

}
