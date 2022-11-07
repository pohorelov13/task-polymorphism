package geometry;

public class Square extends Figure{

    protected Square(String name, int side, int height) {
        super(name, side, height);
    }

    @Override
    double calcArea(int width, int height) {
        return width * height;
    }
}
