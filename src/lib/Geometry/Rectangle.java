package lib.Geometry;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public double perimeter(){
        return 2*(width+height);
    }

    public double area(){
        return width*height;
    }
}
