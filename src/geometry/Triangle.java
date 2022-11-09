package geometry;

//клас наслідує Фігуру
public class Triangle extends Figure {

    private double height;
    private double side;

    //приймає ім'я, сторону та висоту, проведену до цієї сторони
    //після цього обчислює площу фігури
    public Triangle(String name, double height, double side) {
        super(name);
        this.height = height;
        this.side = side;
        calcArea();
    }

    //універсальна формула для будь-якого трикутника:
    // 1/2 * сторону * висоту, проведену до цієї сторони
    @Override
    public void calcArea() {
        super.setArea((height * side) / 2);
    }
}
