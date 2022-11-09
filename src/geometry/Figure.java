package geometry;

public abstract class Figure {
    private String name;
    private double area;

    //в конструктор батьківського класу передається лише ім'я фігури
    public Figure(String name) {
        this.name = name;
    }

    //сеттери і геттери для приватних полів
    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    abstract void calcArea();
}
