package lib.Geometry;

import lib.Math.Algebra;

public class Line {
    public Point pointA;
    public Point pointB;

    public float a;
    public float b;
    public float c;

    public float slope;
    public float yIntercept;
    public float xIntercept;


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

    public float slope(){
        return (pointB.y - pointA.y) / (pointB.x - pointA.x);
    }
    public float yIntercept() {
        return pointA.y - (slope() * pointA.x);
    }
    public float xIntercept(){//??
        return pointA.x - ((1/slope()) * pointA.y);
    }
    public float a(){
        return pointA.y-pointB.y;
    }
    public float b(){
        return -(pointA.x-pointB.x);
    }
    public float c() {
        return (pointA.y - pointB.y) * pointA.x - (pointA.x - pointB.x) * pointA.y;
    }

    public float[] intersect(Line line){
        return Algebra.linear2x2Equation(this.a, this.b, line.a, line.b, this.c, line.c);
    }
}
