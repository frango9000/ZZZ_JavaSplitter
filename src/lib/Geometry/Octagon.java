package lib.Geometry;

public class Octagon extends Polygon implements Cloneable {

    public Octagon() {
        super(8);
    }

    public Octagon(double sideLength) {
        super(8, sideLength);
    }

    public Octagon(double radius, boolean dummy) {
        super(8, radius, dummy);
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
