package lib.Geometry;

public class Hexagon extends Polygon {

    protected Hexagon() {
        numOfSides = 6;
    }

    public Hexagon(float sideLength) {
        this();
        this.sideLength = sideLength;
    }

}
