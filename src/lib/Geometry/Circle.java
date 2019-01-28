package lib.Geometry;

public class Circle {
    public double radius;
    public Point center;

    public Circle(double radius) {
        this.radius = radius;
        this.center = new Point();
    }

    public Circle(double radius, Point center) {
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

    public Point pointOnAngle(double degrees){
        double angleInRadians = Math.toRadians(degrees);
        double x = radius * Math.cos(angleInRadians);
        double y = radius * Math.sin(angleInRadians);

        Point point = new Point(x,y);
        return point;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center.toString() +
                '}';
    }
}
