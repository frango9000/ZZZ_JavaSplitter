package lib.Geometry;

public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double perimeter(){
        return 2*radius*Math.PI;
    }

    public double area(){
        return radius*radius*Math.PI;
    }
}
