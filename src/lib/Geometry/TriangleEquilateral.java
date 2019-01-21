package lib.Geometry;


public class TriangleEquilateral extends Triangle{
    private float sides;
    private float lenght;//prism

    public TriangleEquilateral(float sides) {
        this.sides = sides;
    }
    public TriangleEquilateral(float sides, float lenght) {
        this.sides = sides;
        this.lenght = lenght;
    }
    public double area(){
        return (Math.sqrt(3)/4)*Math.pow(sides,2);
    }
    public double volume(){
        return area()*lenght;
    }
}
