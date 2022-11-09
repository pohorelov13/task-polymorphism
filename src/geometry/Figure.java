package geometry;

public abstract class Figure {
    private String name;
    private double area;

    //� ����������� ������������ ����� ���������� ���� ��'� ������
    public Figure(String name) {
        this.name = name;
    }

    //������� � ������� ��� ��������� ����
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
