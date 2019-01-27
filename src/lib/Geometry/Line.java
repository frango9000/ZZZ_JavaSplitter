package lib.Geometry;

import lib.Math.Algebra;

public class Line {
    public Point pointA;
    public Point pointB;

    public double a;
    public double b;
    public double c;

    public double slope;
    public double yIntercept;
    public double xIntercept;


    public Line() {
    }

    public Line(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.a=a();
        this.b=b();
        this.c=c();
        this.slope = slope();
        yIntercept = yIntercept();
        xIntercept = xIntercept();
    }
    public Line(Point pointA, float slope){
        this.pointA = pointA;
        this.slope = slope;
        yIntercept = yIntercept();
        xIntercept = xIntercept();
    }

    public double slope(){
        return (pointB.y - pointA.y) / (pointB.x - pointA.x);
    }
    public double yIntercept() {
        return pointA.y - (slope() * pointA.x);
    }
    public double xIntercept(){//??
        return pointA.x - ((1/slope()) * pointA.y);
    }
    public double a(){
        return pointA.y-pointB.y;
    }
    public double b(){
        return -(pointA.x-pointB.x);
    }
    public double c() {
        return (pointA.y - pointB.y) * pointA.x - (pointA.x - pointB.x) * pointA.y;
    }
    public double squaredLength(){
        return (pointB.x-pointA.x)*(pointB.x-pointA.x)+(pointB.y-pointA.y)*(pointB.y-pointA.y);
    }

    public double[] intersect(Line line){
        return Algebra.linear2x2Equation(this.a, this.b, line.a, line.b, this.c, line.c);
    }

    public boolean isOnLine(Point point){
         return this.crossProduct(point)== 0;
    }
    public double crossProduct(Point point){
        return  ((pointB.x - pointA.x) * (point.y - pointA.y) - (point.x - pointA.x) * (pointB.y - pointA.y));
    }
    public double dotProduct(Point point) {
        return ((pointB.x - pointA.x) * (point.x - pointA.x) - (point.y - pointA.y) * (pointB.y - pointA.y));
    }

    public boolean isOnSegment(Point point) {
        return !( ( crossProduct(point) > 0 ) || ( crossProduct(point) < 0 ) || (point.x < pointA.x) || (point.y < pointA.y) || (point.x > pointB.x) || (point.y > pointB.y));
    }
}
