package lib.Geometry;

import java.util.Arrays;

public class Pentagon extends Polygon {
    public double radius;                       //radius of the circle formed by this.pentagon points
    public Point[] points = new Point[numOfSides];

    protected Pentagon() {
        this.numOfSides = 5;
    }

    public Pentagon(double sideLength) {
        this();
        this.sideLength = sideLength;
        this.radius = centerToVertex();
    }

    public Pentagon(double radius, Point center) {
        this();
        this.radius = radius;
        this.sideLength = side();
        this.center = center;
    }

    public Pentagon(double radius, Point center, double angleOfPoint0) {
        this(radius, center);
        setPoints(angleOfPoint0);
    }

    //angle relative to the y axis
    //Max =  17.999999999
    //Min = -18; (72-90)
    //The point with the max Y, if top side is Y-bound, p0 is the one with positive X;
    private void setPoints(double angleOfPoint0) {
        Circle circle = new Circle(radius, center);
        points[0] = circle.pointOnAngle(90 + angleOfPoint0);
        points[1] = circle.pointOnAngle(90 + angleOfPoint0 + 72);
        points[2] = circle.pointOnAngle(90 + angleOfPoint0 + 72 + 72);
        points[3] = circle.pointOnAngle(90 + angleOfPoint0 + 72 + 72 + 72);
        points[4] = circle.pointOnAngle(90 + angleOfPoint0 + 72 + 72 + 72 + 72);
    }

    private double side() {
        return 2 * radius * Math.sin(Math.PI / numOfSides);
    }

    private double centerToVertex() {
        return sideLength / (2 * Math.sin(Math.PI / numOfSides));
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                "\nradius=" + radius +
                ",\n sideLength=" + sideLength +
                ",\n numOfSides=" + numOfSides +
                ",\n center=" + center.toString() +
                ",\n points=" + Arrays.toString(points) +
                ",\n getArea=" + getArea() +
                ",\n getPerimeter=" + getPerimeter() +
                '}';
    }
}
