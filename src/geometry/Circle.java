package geometry;

public class Circle extends Figure {
    public Circle(String name, int side, int height) {
        super(name, side, height);
    }

    @Override
    double calcArea(int width, int height) {
        return Math.round(Math.PI * width * height);
    }
}
