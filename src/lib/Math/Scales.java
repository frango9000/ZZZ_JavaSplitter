package lib.Math;

public abstract class Scales {
    public static float kilometerToMile(float km){
        return km*0.621371f;
    }
    public static float mileToKilometer(float mile){
        return mile*1.60934f;
    }
    public static float meterToFeet(float meter){
        return meter*3.28084f;
    }
    public static float feetToMeter(float feet){
        return feet * 0.3048f;
    }
}
