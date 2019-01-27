package lib.Geometry;

public class Circle {
    public float radius;
    public Point center;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(float radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double perimeter(){
        return 2*radius*Math.PI;
    }

    public double area(){
        return radius*radius*Math.PI;
    }

    public boolean isInCircle(Point point){
        return radius > center.distanceBetweenPoints(point);
    }

    public boolean isInCircle(Circle circle){
        return this.radius+circle.radius > this.center.distanceBetweenPoints(circle.center);
    }
}
