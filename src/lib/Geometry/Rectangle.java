package lib.Geometry;

import java.util.Random;

public class Rectangle extends Polygon{
    private float width;
    private float height;

    private Point center;

    public static final int NUM_OF_SIDES = 4;

    public Rectangle() {
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
        center = new Point(0, 0);
    }

    public Rectangle(float width, float height, Point center) {
        this.width = width;
        this.height = height;
        this.center = center;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double area() {
        return width * height;
    }

    public double maxX() {
        return center.x + (width / 2);
    }

    public double minX() {
        return center.x - (width / 2);
    }

    public double maxY() {
        return center.y + (height / 2);
    }

    public double minY() {
        return center.y - (height / 2);
    }

    public double[] randomPoint() {
        Random rand = new Random();
        double[] randPoint = new double[2];

        int boundX = (int) (width * 100f);
        double randX = rand.nextInt(boundX);
        randPoint[0] = (randX - (boundX / 2f)) / 100 + center.x;

        int boundY = (int) (height * 100f);
        double randY = rand.nextInt(boundY);
        randPoint[1] = (randY - (boundY / 2f)) / 100 + center.y;

        return randPoint;
    }

    public boolean isInRectangle(Point point) {

        boolean xInBound = point.x < (maxX()) && point.x > (minX());
        boolean yInBound = point.y < (maxY()) && point.y > (minY());
        return xInBound && yInBound;
    }

    public boolean isInRectangle(Rectangle rectangle) {
        double xDistance = Math.abs(this.center.x - rectangle.center.x);
        double yDistance = Math.abs(this.center.y - rectangle.center.y);

        if (xDistance <= Math.abs(this.width - rectangle.width) / 2 && yDistance <= Math.abs(this.height - rectangle.height) / 2) {
            if (this.width > rectangle.width)
                System.out.println("rectangle 2 is in rectangle 1");
            else if (rectangle.width > this.width)
                System.out.println("rectangle 1 is in rectangle 2");
            else
                System.out.println(" identical");
        } else if (xDistance <= Math.abs(this.width + rectangle.width) / 2 && yDistance <= Math.abs(this.height + rectangle.height) / 2)
            System.out.println("r2 overlaps r1");
        else {
            System.out.println("r2 does not overlap r1");
            return false;
        }
        return true;
    }
}
