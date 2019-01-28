package lib.Geometry;

import java.util.Arrays;

public class Pentagon extends Polygon {
    public double radius; //center to vertex
    public double sideLength;
    public double angleOfPoint0;                //The point with the max Y, if top side is Y-bound, p0 is the one with positive X;
                                                //angle relative to the y axis
                                                //Max =  17.999999999 // Min = -18; (72-90)
    public final int numOfSides = 5;

    public Point center;
    public Point[] points= new Point[numOfSides];

    public Pentagon() {
    }



    public Pentagon(double radius) {
        this.radius = radius;
        this.sideLength =side();
    }
    public Pentagon(double radius, Point center) {
        this.radius = radius;
        this.sideLength =side();
        this.center = center;
    }

    public Pentagon(double radius, Point center, double angleOfPoint0) {
        this.radius = radius;
        this.angleOfPoint0 = angleOfPoint0;
        this.center = center;
        this.sideLength =side();
        setPoints();
    }

    public Pentagon(boolean bool, double sideLength){
        this.sideLength = sideLength;
        this.radius =centerToVertex();
    }

    private void setPoints(){
        Circle circle = new Circle(radius, center);
        points[0] = circle.pointOnAngle(90+angleOfPoint0);
        points[1] = circle.pointOnAngle(90+angleOfPoint0+72);
        points[2] = circle.pointOnAngle(90+angleOfPoint0+72+72);
        points[3] = circle.pointOnAngle(90+angleOfPoint0+72+72+72);
        points[4] = circle.pointOnAngle(90+angleOfPoint0+72+72+72+72);
    }

    public double side(){
        return 2 * radius * Math.sin(Math.PI/numOfSides);
    }
    public double centerToVertex(){
        return sideLength / (2*Math.sin(Math.PI/5));
    }


    public double area(){
        return (numOfSides * sideLength * sideLength) / (4f*Math.tan(Math.PI/numOfSides));
    }
    public double perimeter(){
        return radius * numOfSides;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                "\nradius=" + radius +
                ",\n sideLength=" + sideLength +
                ",\n angleOfPoint0=" + Math.toDegrees(angleOfPoint0) +
                ",\n numOfSides=" + numOfSides +
                ",\n center=" + center.toString() +
                ",\n points=" + Arrays.toString(points) +
                ",\n area=" + area() +
                ",\n perimeter=" + perimeter() +
                '}';
    }
}
