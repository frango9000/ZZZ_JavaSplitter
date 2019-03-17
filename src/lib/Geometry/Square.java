package lib.Geometry;

public class Square extends Polygon {

    protected Square() {
        numOfSides = 4;
    }

    public Square(double sideLength) {
        this();
        this.sideLength = sideLength;
    }
}
