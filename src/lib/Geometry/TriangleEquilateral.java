package lib.Geometry;


public class TriangleEquilateral extends Polygon {

    public TriangleEquilateral() {
        numOfSides = 3;
    }

    public TriangleEquilateral(float sideLength) {
        this();
        this.sideLength = sideLength;
    }

}
