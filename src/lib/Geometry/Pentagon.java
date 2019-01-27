package lib.Geometry;

public class Pentagon {
    public double r; //center to vertex
    public double side;

    public Pentagon() {
    }

    public Pentagon(double centerToVertex) {
        this.r = centerToVertex;
        this.side=side();
    }
    public Pentagon(boolean bool, double side){
        this.side=side;
        this.r=centerToVertex();
    }


    public double side(){
        return 2*r*Math.sin(Math.PI/5);
    }
    public double centerToVertex(){
        return side / (2*Math.sin(Math.PI/5));
    }


    public double area(){
        return (5*side()*side()) / (4*Math.tan(Math.PI/5));
    }
    public double perimeter(){
        return 5*r;
    }
}
