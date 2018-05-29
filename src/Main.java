import Calculators.AreaCalculator;
import Calculators.VolumeCalculator;
import FlatShapes.Circle;
import FlatShapes.FlatShape;
import FlatShapes.Square;
import SolidShapes.Cube;
import SolidShapes.SolidShape;
import SolidShapes.Sphere;

public class Main {

    public static void main(String[] args) {
        FlatShape[] shapes = {new Circle(4), new Square(5)};
        SolidShape[] solidShapes = {new Cube(4), new Sphere(7)};

        AreaCalculator area = new AreaCalculator();
        VolumeCalculator volume = new VolumeCalculator();

        double areas = area.sum(shapes);
        double volumes = volume.sum(solidShapes);

        System.out.println("Sum of Areas = " + areas);
        System.out.println("Sum of Volumes = " + volumes);
    }
}