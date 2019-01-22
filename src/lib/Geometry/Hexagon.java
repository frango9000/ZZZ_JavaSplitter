package lib.Geometry;

public class Hexagon {
    public float sides;

    public Hexagon(float sides) {
        this.sides = sides;
    }

    public double area(){
        return ((3*Math.sqrt(3))/2)*(sides*sides);
    }
}
