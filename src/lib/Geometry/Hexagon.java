package lib.Geometry;

public class Hexagon extends Polygon{
    public float sides;
    public static final int NUM_OF_SIDES = 6;

    public Hexagon(float sides) {
        this.sides = sides;
    }

    public double area(){
        return ((3*Math.sqrt(3))/2)*(sides*sides);
    }
    public double perimeter(){
        return sides*NUM_OF_SIDES;
    }
}
