package lib.Geometry;

public class Triangle {

    public Point pointA;
    public Point pointB;
    public Point pointC;

    public Triangle() {
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }
    public double sideH(){
        return Point.distanceBetweenTwoPoints(pointA, pointB);
    }
    public double sideI(){
        return Point.distanceBetweenTwoPoints(pointB, pointC);
    }
    public double sideJ(){
        return Point.distanceBetweenTwoPoints(pointC, pointA);
    }

    public double area(){
        double s = (sideH()+sideI()+sideJ())/2;
        return Math.sqrt(s*(s-sideH())*(s-sideI())*(s-sideJ()));
    }


}
