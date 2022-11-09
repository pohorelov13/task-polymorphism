package geometry;

//клас наслідує Фігуру
public class Square extends Figure {

    private double side;

    //конструктор приймає ім'я та сторони квадрата
    //після чого розраховує площу
    public Square(String name, double side) {
        super(name);
        this.side = side;
        calcArea();
    }

    //формула розрахунку площі квадрата: сторона в квадраті)
    @Override
    public void calcArea() {
        super.setArea(Math.pow(side,2));
    }
}