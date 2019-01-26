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

    public static String monthName(int monthNumber){
        String monthName="";
        switch (monthNumber){
            case  1:monthName="January";    break;
            case  2:monthName="Febuary";    break;
            case  3:monthName="March";      break;
            case  4:monthName="April";      break;
            case  5:monthName="May";        break;
            case  6:monthName="June";       break;
            case  7:monthName="July";       break;
            case  8:monthName="August";     break;
            case  9:monthName="September";  break;
            case 10:monthName="October";    break;
            case 11:monthName="November";   break;
            case 12:monthName="December";   break;
        }
        return monthName;
    }
    public static String dayName(int dayNumber){
        String monthName="";
        if(dayNumber>6)dayNumber=dayNumber%7;
        switch (dayNumber){
            case  0:monthName="Sunday";     break;
            case  1:monthName="Monday";     break;
            case  2:monthName="Tuesday";    break;
            case  3:monthName="Wednesday";  break;
            case  4:monthName="Thursday";   break;
            case  5:monthName="Friday";     break;
            case  6:monthName="Saturday";   break;
        }
        return monthName;
    }

    public static int daysInMonth(int monthIndex, int year){
        switch(monthIndex){
            case 0:         //January
            case 2:         //March
            case 4:         //May
            case 6:         //July
            case 7:         //August
            case 9:         //October
            case 11:        //December
                return 31;
            case 3:         //April
            case 5:         //June
            case 8:         //September
            case 10:        //November
                return 30;
            case 1:         //February
                return isLeapYear(year) ?  29 : 28 ;
        }
        return -1;
    }
    public static boolean isLeapYear(int year){
        if(year%4!=0)return false;
        else if (year%100!=0)return true;
        else if (year%400!=0)return false;
        else return true;
    }
    public static int dayOfWeek(int year, int month, int day){
        int m;
        if( month == 1 || month == 2){
            m = month+12;
            year-=1;
        }else m = month;
        int j = year / 100;
        int k = year % 100;
        int q = day;

        int dayOfWeek = ( q + ( ( 26* (m+1) ) / 10 ) + k + (k/4) + (j/4) + (5*j) ) % 7;

        return dayOfWeek<1 ? 6 : dayOfWeek-1;
    }

    public static String dayOfWeekString(int year, int month, int day){
        return dayName(dayOfWeek(year,month,day));
    }

}
