package lib.Geometry;

public class Square extends Polygon {

    public Square() {
        super(2);
    }

    public Square(double sideLength) {
        super(2, sideLength);
    }

    public Square(double radius, boolean dummy) {
        super(2, radius, dummy);
    }
}
