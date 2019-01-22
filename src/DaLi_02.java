import lib.Geometry.Hexagon;
import lib.Geometry.TriangleEquilateral;
import lib.Math.Algebra;
import lib.Math.Physics;
import lib.Math.Scales;
import lib.Misc.IO;
import lib.Misc.Time;

import static lib.Misc.IO.*;


public abstract class DaLi_02 {

    public static void main(String[] args) {
        Ex18();
        Ex19();
        Ex20();
        Ex21();
        Ex22();
        Ex23();

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

        println("The average acceleration is : " + (Physics.averageAcceleration(v0,v1,time)));
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
        float birthsPerDay= secondsInADay / 7f;
        float deathsPerDay = secondsInADay / 13f;
        float immigrantsPerDay = secondsInADay / 45f;
        float changePerDay = birthsPerDay - deathsPerDay + immigrantsPerDay;
        float changePerYear = changePerDay*365;
        int startPopulation = 312032486;

        println("Year 0 : "+ startPopulation);
        println("Year "+years+" : "+ (startPopulation+(int)(changePerYear*years)));
    }


    public static void Ex12() {
        print("Enter Take off speed: ");
        float takeOffSpeed=scanFloat();
        print("Enter Acceleration: ");
        float acceleration=scanFloat();
        println("The minimum runway length for this airplane is " + (Physics.lengthOfSpeedChange(0,takeOffSpeed,acceleration)));
    }
    public static void Ex13() {
        float monthlyRate=1.003125f;
        print("Enter monthly ammount: ");
        float monthlyAmount=scanFloat();
        int monthsToShow=6;
        int month=0;
        float value=monthlyAmount*monthlyRate;
        do{

            println("After the " + ++month + " month, value: " + value);
            value=(value+monthlyAmount)*monthlyRate;
            monthsToShow--;
        }while(monthsToShow>0);
    }
    public static void Ex14() {
        print("Enter weight in pounds: ");
        float weight = scanFloat();

        print("Enter height in inches: ");
        float height = scanFloat();

        double bmi = Scales.poundToKilogram(weight)/Math.pow(Scales.inchToMeter(height),2);
        println("BMI is : " + bmi);
    }
    public static void Ex15() {
        print("x1: ");
        float x1 = scanFloat();

        print("y1: ");
        float y1 = scanFloat();

        print("x2: ");
        float x2 = scanFloat();

        print("y2: ");
        float y2 = scanFloat();

        println("The distance between the two points is :" + Algebra.distanceBetweenTwoPoints(x1,y1,x2,y2));
    }
    public static void Ex16() {
        print("Enter the length of the hexagon side: ");
        float sides = scanFloat();

        Hexagon hexagon = new Hexagon(sides);
        println("The area of the hexagon is " + hexagon.area());
    }
    public static void Ex17() {
        print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        float temp = scanFloat();
        print("Enter the wind speed (7 = 2) in miles per hour: ");
        float windSpeed = scanFloat();

        double windChill = 35.74+(0.6215*temp)-(35.75*Math.pow(windSpeed,0.16))+(0.4275*temp*Math.pow(windSpeed,0.16));
        println("The wind chill index is " + windChill);
    }
    public static void Ex18() {

    }
    public static void Ex19() {

    }
    public static void Ex20() {

    }
    public static void Ex21() {

    }
    public static void Ex22() {

    }
    public static void Ex23() {

    }

}
