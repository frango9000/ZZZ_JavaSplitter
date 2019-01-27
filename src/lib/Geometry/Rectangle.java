package lib.Geometry;

import java.util.Random;

public class Rectangle {
    private float width;
    private float height;

    private Point center;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(float width, float height, Point center) {
        this.width = width;
        this.height = height;
        this.center = center;
    }

    public double perimeter(){
        return 2*(width+height);
    }

    public double area(){
        return width*height;
    }

    public float[] randomPoint(){
        Random rand = new Random();
        float[] randPoint =new float[2];

        int boundX = (int) (width*100f);
        float randX =  rand.nextInt(boundX);
        randPoint[0] = (randX - (boundX/2f))/100 + center.x;

        int boundY = (int) (height*100f);
        float randY =  rand.nextInt(boundY);
        randPoint[1] = (randY - (boundY/2f))/100 + center.y;

        return randPoint;
    }
    public boolean isInRectangle(Point point){
        center = center == null ? new Point(0,0) : center;
        boolean xInBound = point.x < ((width/2)+center.x) && point.x > (-(width/2)-center.x);
        boolean yInBound = point.y < ((width/2)+center.y) && point.y > (-(width/2)-center.y);
        return xInBound && yInBound;
    }

}
