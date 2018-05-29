package SolidShapes;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class SphereTest {
    Sphere sphere;

    @Before
    public void setUp() {
        sphere = new Sphere(7);
    }

    @Test
    public void shouldCalculateTheVolumeOfSphere() {
        assertEquals(1437, sphere.volume(), 0);
    }

    @Test
    public void shouldCalculateSurfaceAreaOfSphere() {
        assertEquals(616, sphere.area(), 0);

    }
}
