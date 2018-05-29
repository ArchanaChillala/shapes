package Calculators;

import FlatShapes.FlatShape;

public class AreaCalculator {

    public double sum(FlatShape[] shapes) {
        double sum = 0;
        for (FlatShape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }
}


