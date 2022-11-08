package geometry;

public class Triangle extends Figure {

    public Triangle(String name, int side, int height) {
        super(name, side, height);
    }

    @Override
    double calcArea(int width, int height) {
        return 0.5 * width * height;
    }
}
