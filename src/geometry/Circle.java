package geometry;

//���� ������ Գ����
public class Circle extends Figure {

    private double radius;

    //�� ��� ������� ������������, ���������� ��'� �� �����,
    //���� ���� ������������� ����� � ���������� � ���� area
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
        calcArea();
    }

    //������� ���������� ����� ����: � * ����� � �������
    @Override
    public void calcArea() {
       super.setArea(Math.PI * Math.pow(radius,2));
    }
}