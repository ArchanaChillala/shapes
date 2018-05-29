package SolidShapes;

import FlatShapes.FlatShape;

import static java.lang.Math.pow;

public class Cube implements SolidShape, FlatShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double area() {
        return pow(side, 2);
    }

    public double volume() {
        return pow(side, 3);
    }
}
