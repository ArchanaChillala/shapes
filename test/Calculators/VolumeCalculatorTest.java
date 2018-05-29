package Calculators;

import SolidShapes.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeCalculatorTest {
    @Test
    public void shouldCalculateSumOfVolumesOfShapes() {
        SolidShape[] shapes = {new Cube(6), new Sphere(7)};
        VolumeCalculator volume = new VolumeCalculator();

        assertEquals(1653, volume.sum(shapes), 0.0001);
    }
}
