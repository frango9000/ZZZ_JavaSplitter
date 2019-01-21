package lib.Geometry;

public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}
