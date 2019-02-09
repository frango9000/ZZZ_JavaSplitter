package lib.Geometry;


public class TriangleEquilateral extends Triangle {
    private float sideLength;

    public TriangleEquilateral(float sideLength) {
        this.sideLength = sideLength;
    }

    public double area() {
        return (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);
    }

    public double perimeter() {
        return sideLength * NUM_OF_SIDES;
    }
}
