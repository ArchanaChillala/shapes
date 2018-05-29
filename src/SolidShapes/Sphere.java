package SolidShapes;

import FlatShapes.FlatShape;

import static java.lang.Math.*;

public class Sphere implements SolidShape, FlatShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double area() {
        return round(4 * PI * radius * radius);
    }

    public double volume() {
        return round(4 * PI * pow(radius, 3) / 3);
    }
}
