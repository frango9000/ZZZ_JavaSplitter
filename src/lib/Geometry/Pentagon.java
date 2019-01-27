package lib.Geometry;

public class Pentagon extends Polygon {
    public double radius; //center to vertex
    public double side;
    public static final int NUM_OF_SIDES = 5;

    public Pentagon() {
    }

    public Pentagon(double centerToVertex) {
        this.radius = centerToVertex;
        this.side=side();
    }
    public Pentagon(boolean bool, double side){
        this.side=side;
        this.radius =centerToVertex();
    }


    public double side(){
        return 2* radius *Math.sin(Math.PI/5);
    }
    public double centerToVertex(){
        return side / (2*Math.sin(Math.PI/5));
    }


    public double area(){
        return (5*side()*side()) / (4*Math.tan(Math.PI/5));
    }
    public double perimeter(){
        return radius * NUM_OF_SIDES;
    }
}
