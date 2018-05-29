package FlatShapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    @Test
    public void shouldCalculateAreaOfCircle() {
        Circle circle = new Circle(7);

        assertEquals(154, circle.area(), 0.003);
    }
}
