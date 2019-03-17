package lib.Geometry;

public abstract class GeometricObject implements Comparable<GeometricObject> {

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject o) {
        double dif = getArea() - o.getArea();
        if(dif > 0)
            return 1;
        else if (dif < 0)
            return -1;
        else return 0;
    }

}
