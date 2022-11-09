package geometry;

//���� ������ Գ����
public class Triangle extends Figure {

    private double height;
    private double side;

    //������ ��'�, ������� �� ������, ��������� �� ���� �������
    //���� ����� �������� ����� ������
    public Triangle(String name, double height, double side) {
        super(name);
        this.height = height;
        this.side = side;
        calcArea();
    }

    //����������� ������� ��� ����-����� ����������:
    // 1/2 * ������� * ������, ��������� �� ���� �������
    @Override
    public void calcArea() {
        super.setArea((height * side) / 2);
    }
}
