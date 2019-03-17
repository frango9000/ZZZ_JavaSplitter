package lib.Geometry;

public class Octagon extends Polygon implements Cloneable {

    public Octagon() {
        numOfSides = 8;
    }

    public Octagon(double sideLength) {
        this();
        this.sideLength = sideLength;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
