package geometry;

//клас наслідує Фігуру
public class Circle extends Figure {

    private double radius;

    //під час виклику конструктора, передається ім'я та радіус,
    //після чого розраховується площа і записується в поле area
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
        calcArea();
    }

    //формула розрахунку площі кола: п * радіус в квадраті
    @Override
    public void calcArea() {
       super.setArea(Math.PI * Math.pow(radius,2));
    }
}