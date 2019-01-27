package lib.Geometry;

public class Pentagon extends Polygon {
    public double radius; //center to vertex
    public double sideLength;
    public static final int NUM_OF_SIDES = 5;

    public Pentagon() {
    }

    public Pentagon(double centerToVertex) {
        this.radius = centerToVertex;
        this.sideLength =side();
    }
    public Pentagon(boolean bool, double sideLength){
        this.sideLength = sideLength;
        this.radius =centerToVertex();
    }


    public double side(){
        return 2 * radius * Math.sin(Math.PI/NUM_OF_SIDES);
    }
    public double centerToVertex(){
        return sideLength / (2*Math.sin(Math.PI/5));
    }


    public double area(){
        return (NUM_OF_SIDES * sideLength * sideLength) / (4f*Math.tan(Math.PI/NUM_OF_SIDES));
    }
    public double perimeter(){
        return radius * NUM_OF_SIDES;
    }
}
