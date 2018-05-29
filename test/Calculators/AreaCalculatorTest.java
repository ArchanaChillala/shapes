package Calculators;

import FlatShapes.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AreaCalculatorTest {
    @Test
    public void shouldCalculateSumOfAreasOfShapes() {
        AreaCalculator calculator = new AreaCalculator();
        FlatShape[] shapes = {new Circle(7), new Square(6)};

        double totalArea = calculator.sum(shapes);

        assertEquals(190, totalArea, 0.0001);
    }
}
