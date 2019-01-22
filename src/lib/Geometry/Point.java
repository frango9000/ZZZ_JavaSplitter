package lib.Geometry;

public class Point {
    public float x;
    public float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static double distanceBetweenTwoPoints(Point p1, Point p2){
        return distanceBetweenTwoPoints(p1.x,p1.y,p2.x,p2.y);
    }
    public static double distanceBetweenTwoPoints(float x1,float y1, float x2, float y2){
        return Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
    }

    public static float[] middlePoint(float x1, float y1, float x2, float y2){
        return new float[]{ (x1+x2)/2 , (y1+y2)/2 };
    }
}
