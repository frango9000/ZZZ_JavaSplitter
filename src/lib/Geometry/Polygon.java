package lib.Geometry;

public class Polygon {
    public int numOfSides;
    public double sideLength;

    public Polygon() {
    }

    public Polygon(int numOfSides, double sideLength) {
        this.numOfSides = numOfSides;
        this.sideLength = sideLength;
    }

    public double area(){
        return (numOfSides * sideLength * sideLength) / (4*Math.tan(Math.PI/ numOfSides));
    }
    public double perimeter(){
        return sideLength * numOfSides;
    }

}
