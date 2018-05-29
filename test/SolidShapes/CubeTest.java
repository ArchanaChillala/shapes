package SolidShapes;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CubeTest {
    Cube cube;

    @Before
    public void setUp() {
        cube = new Cube(6);
    }

    @Test
    public void shouldCalculateTheVolumeOfCube() {
        assertEquals(216, cube.volume(), 0);
    }

    @Test
    public void shouldCalculateSurfaceAreaOfCube() {
        assertEquals(36, cube.area(), 0);

    }
}
