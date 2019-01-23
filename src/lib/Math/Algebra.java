package lib.Math;

import java.util.Arrays;

public abstract class Algebra {
    public static float[] linear2x2Equation(float a, float b, float c, float d, float e, float f) {

        //ax+by=e
        //cx+dy=f
        float discriminant=(a*d)-(b*c);

        if (discriminant== 0)return null;
        float x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        float y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        float[] z = {x, y};
        return z;
    }

    public static double[] quadraticEquation(float a, float b, float c){
        //
        //
        double[] r;
        float discriminant=(b*b)-(4f*a*c);
        if (discriminant>0){
            r = new double[2];
            r[0]=(-b+Math.sqrt(discriminant))/(2f*a);
            r[1]=(-b-Math.sqrt(discriminant))/(2f*a);

        }else if(discriminant==0){
            r = new double[1];
            r[0]=(-b+Math.sqrt(discriminant))/(2f*a);
        }else{
            return null;
        }
        return r;
    }

}
