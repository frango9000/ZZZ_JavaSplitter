package lib.Geometry;

public class Square extends Polygon {
    public static final int NUM_OF_SIDES = 4;

    public double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
}
