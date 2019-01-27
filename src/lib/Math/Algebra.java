package lib.Math;

import java.util.Arrays;

public abstract class Algebra {
    public static double[] linear2x2Equation(double a, double b, double c, double d, double e, double f) {

        //ax+by=e
        //cx+dy=f
        double discriminant=(a*d)-(b*c);

        if (discriminant== 0)return null;
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        double[] z = {x, y};
        return z;
    }

    public static double[] quadraticEquation(double a, double b, double c){
        //
        //
        double[] r;
        double discriminant=(b*b)-(4f*a*c);
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
