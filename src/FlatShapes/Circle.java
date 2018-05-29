package FlatShapes;

import static java.lang.Math.*;

public class Circle implements FlatShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return round(PI * radius * radius);
    }
}
