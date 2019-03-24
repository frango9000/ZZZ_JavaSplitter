package lib.Geometry;

public class Hexagon extends Polygon {

    public Hexagon() {
        super(6);
    }

    public Hexagon(double sideLength) {
        super(6, sideLength);
    }

    public Hexagon(double radius, boolean dummy) {
        super(6, radius, dummy);
    }
}
