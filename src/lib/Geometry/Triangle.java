package lib.Geometry;

public class Triangle {

    public Point pointA;
    public Point pointB;
    public Point pointC;

    public double sideAB;
    public double sideBC;
    public double sideCA;

    public Triangle() {
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        sideAB = Point.distanceBetweenPoints(pointA, pointB);
        sideBC = Point.distanceBetweenPoints(pointB, pointC);
        sideCA = Point.distanceBetweenPoints(pointC, pointA);

    }

    public Triangle(double sideAB, double sideBC, double sideCA) {
        if (isValidTriangle(sideAB, sideBC, sideCA)) {
            this.sideAB = sideAB;
            this.sideBC = sideBC;
            this.sideCA = sideCA;
        }
    }

    public double area() {
        double s = (sideAB + sideBC + sideCA) / 2;
        return Math.sqrt(s * (s - sideAB) * (s - sideBC) * (s - sideCA));
    }

    public double perimeter() {
        return sideAB + sideBC + sideCA;
    }


    public static boolean isValidTriangle(double sideAB, double sideBC, double sideCA) {
        return (((sideAB + sideBC) > sideCA) && ((sideBC + sideCA) > sideAB) && ((sideCA + sideAB) > sideBC));
    }
}
