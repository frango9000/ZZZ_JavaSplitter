package lib.Geometry;

public class Point {
    public double x;
    public double y;

    public double[] point;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.point = new double[]{x, y};
    }

    public Point(double[] point) {
        this.x = point[0];
        this.y = point[1];
        this.point = new double[]{point[0], point[1]};
    }


    public static double distanceBetweenPoints(Point p1, Point p2) {
        return distanceBetweenPoints(p1.x, p1.y, p2.x, p2.y);
    }

    public static double distanceBetweenPoints(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double[] middlePoint(double x1, double y1, double x2, double y2) {
        return new double[]{(x1 + x2) / 2, (y1 + y2) / 2};
    }

    public double distanceBetweenPoints(Point point) {
        return distanceBetweenPoints(this, point);
    }

    public String toString() {
        return "( " + x + ", " + y + " )";
    }

    public static int[] closestPoints(Point... points){
        int[] indexesOfClosestPoints = new int[2];
        int p1 = 0, p2 = 1;
        double shortestDistance = distanceBetweenPoints(points[p1],points[p2]);
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distanceBetweenPoints(points[i], points[j]);
                if(shortestDistance > distance){
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        return new int[]{p1,p2};
    }

}
