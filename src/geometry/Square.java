package geometry;

//���� ������ Գ����
public class Square extends Figure {

    private double side;

    //����������� ������ ��'� �� ������� ��������
    //���� ���� ��������� �����
    public Square(String name, double side) {
        super(name);
        this.side = side;
        calcArea();
    }

    //������� ���������� ����� ��������: ������� � �������)
    @Override
    public void calcArea() {
        super.setArea(Math.pow(side,2));
    }
}