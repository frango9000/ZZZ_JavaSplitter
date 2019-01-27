package lib.Geometry;


public class TriangleEquilateral extends Triangle{
    private float sides;

    public TriangleEquilateral(float sides) {
        this.sides = sides;
    }
    public double area(){
        return (Math.sqrt(3)/4)*Math.pow(sides,2);
    }
    public double perimeter(){
        return sides * NUM_OF_SIDES;
    }
}
