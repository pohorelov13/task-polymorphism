package geometry;

//клас наслідує Фігуру
public class Square extends Figure {

    private double sideA;
    private double sideB;

    //конструктор приймає ім'я та сторони квадрата
    //після чого розраховує площу
    public Square(String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        calcArea();
    }

    //формула розрахунку площі прямокутника: перемноження двох сторін
    @Override
    public void calcArea() {
        super.setArea(sideA * sideB);
    }
}
