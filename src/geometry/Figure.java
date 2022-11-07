package geometry;

public abstract class Figure {
    private String name;
    private int width;
    private int height;
    private double area;


    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }

    public Figure(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    abstract double calcArea(int width, int height);
}
