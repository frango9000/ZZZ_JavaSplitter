import lib.Geometry.TriangleEquilateral;
import lib.Math.Scales;
import lib.Misc.IO;
import lib.Misc.Time;

import static lib.Misc.IO.*;


public abstract class DaLi_02 {

    public static void main(String[] args) {
        Ex11();

    }

    public static void Ex00() {

    }

    public static void Ex01() {
        print("Enter miles: ");
        float miles = IO.scanFloat();
        println(miles + " miles is " + Scales.mileToKilometer(miles) + " kilometers;");
    }

    public static void Ex02() {
        print("Enter length of the sides and height of the Equilateral\n" +
                "triangle: ");
        float sides = IO.scanFloat();
        TriangleEquilateral triangle = new TriangleEquilateral(sides, sides);
        println("Area : " + triangle.area());
        println("Volume of prism : " + triangle.volume());
    }

    public static void Ex03() {
        print("Enter a value for meter:");
        float meter = IO.scanFloat();
        println(meter + " meters is " + Scales.meterToFeet(meter) + " feet");
    }

    public static void Ex04() {
        print("Enter a number in square meter: ");
        float squareMeters =IO.scanFloat();
        println(squareMeters + " square meters is " + squareMeters*0.3025f + " pings");
    }

    public static void Ex05() {
        print("Enter subtotal: ");
        float subtotal = scanFloat();
        print("Enter grat. rate: ");
        float rate = scanFloat();
        float grat =subtotal*(rate/100);
        println("The gratuity is $"+grat+" and total is $"+(subtotal+grat));
    }
    public static void Ex06() {
        print("Enter a number between 0 and 1000: ");
        int number =scanInt();
        int er,mb,nu;
        if (number%10==0)er=1;
        else er = number%10;

        if ((number/10)%10==0)mb=1;
        else mb = (number/10)%10;

        if((number/100)%10==0)nu=1;
        else nu = (number/100)%10;

        println((nu*mb*er));


    }
    public static void Ex07() {
        print("Enter value of minutes: ");
        int totalMinutes =scanInt();
        double yearsfloat = Time.minutesToYears(totalMinutes);
        int years = (int)Time.minutesToYears(totalMinutes);
        int remainingDays = (int)Time.yearsToDays(yearsfloat-years);
        println(totalMinutes + " minutes is approximately "+years+" years and "+remainingDays+" days");
    }
    public static void Ex08() {
        print("Enter the time zone offset to GMT: ");
        byte offset=scanByte();
        println(Time.timeToString(offset));
        println(Time.timeToString());
    }
    public static void Ex09() {
        print("Enter V0: ");
        float v0=scanFloat();

        print("Enter V1: ");
        float v1=scanFloat();

        print("Enter time: ");
        float time=scanFloat();

        println("The average acceleration is : " + ((v1-v0)/time));
    }

    public static void Ex10() {
        print("Enter kg of water: ");
        float m=scanFloat();

        print("Enter initial temperature: ");
        float initialTemperature=scanFloat();

        print("Enter final temperature: ");
        float finalTemperature=scanFloat();

        println("The energy needed is : " + (m*(finalTemperature-initialTemperature)*4184f) + " joules");
    }
    public static void Ex11(){
        print("Enter the number of years: ");
        int years = scanInt();

        int secondsInADay = 86400;
        float birthsPerDay = secondsInADay / 7f;
        float deathsPerDay = secondsInADay / 13f;
        float immigrantsPerDay = secondsInADay / 45f;
        float changePerDay = birthsPerDay - deathsPerDay + immigrantsPerDay;
        float changePerYear = changePerDay*365;
        int startPopulation = 312032486;

        println("Year 0 : "+ startPopulation);
        println("Year "+years+" : "+ (startPopulation+(int)(changePerYear*years)));
    }
}
