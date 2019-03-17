package lib.Geometry;

public class Circle extends GeometricObject {
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

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public boolean contains(Point point) {
        return radius > center.distanceBetweenPoints(point);
    }

    public boolean contains(Circle circle) {
        return center.distanceBetweenPoints(circle.center) + circle.radius <= radius;
    }

    public boolean overlaps(Circle circle) {
        return this.radius + circle.radius > this.center.distanceBetweenPoints(circle.center);
    }

    public boolean tangent(Circle circle) {
        return this.radius + circle.radius == this.center.distanceBetweenPoints(circle.center);
    }

    public Point pointOnAngle(double degrees) {
        double angleInRadians = Math.toRadians(degrees);
        double x = radius * Math.cos(angleInRadians);
        double y = radius * Math.sin(angleInRadians);

        Point point = new Point(x, y);
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
