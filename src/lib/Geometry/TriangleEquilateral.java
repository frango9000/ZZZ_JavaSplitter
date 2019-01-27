package lib.Geometry;


public class TriangleEquilateral extends Triangle{
    private float sides;
    private float length;//prism

    public TriangleEquilateral(float sides) {
        this.sides = sides;
    }
    public TriangleEquilateral(float sides, float length) {
        this.sides = sides;
        this.length = length;
    }
    public double area(){
        return (Math.sqrt(3)/4)*Math.pow(sides,2);
    }
    public double volume(){
        return area()* length;
    }
}
