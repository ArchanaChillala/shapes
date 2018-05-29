package FlatShapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void shouldCalculateTheAreaOfSquare() {
        Square square = new Square(6);

        assertEquals(36, square.area(), 0);
    }
}
