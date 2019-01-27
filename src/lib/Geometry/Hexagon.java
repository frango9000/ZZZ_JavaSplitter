package lib.Geometry;

public class Hexagon extends Polygon{
    public float sideLength;
    public final int NUM_OF_SIDES = 6;

    public Hexagon(float sideLength) {
        this.sideLength = sideLength;
    }
    public double area(){
        return (NUM_OF_SIDES * sideLength * sideLength) / (4*Math.tan(Math.PI/NUM_OF_SIDES));
    }
    public double perimeter(){
        return sideLength *NUM_OF_SIDES;
    }
}
