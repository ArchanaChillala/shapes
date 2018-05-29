package Calculators;

import SolidShapes.SolidShape;

public class VolumeCalculator {

    public double sum(SolidShape[] shapes) {
        double sum = 0;
        for (SolidShape shape : shapes) {
            sum += shape.volume();
        }
        return sum;
    }
}
