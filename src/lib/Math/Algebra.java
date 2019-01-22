package lib.Math;

public abstract class Algebra {
    public static float[] linear2x2Equation(float a, float b, float c, float d, float e, float f) {

        //ax+by=e
        //cx+dy=f

        if (((a*d)-(b*c))== 0)return null;
        float x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        float y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        float[] z = {x, y};
        return z;
    }

}
