package geometry;

//���� ������ Գ����
public class Square extends Figure {

    private double sideA;
    private double sideB;

    //����������� ������ ��'� �� ������� ��������
    //���� ���� ��������� �����
    public Square(String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        calcArea();
    }

    //������� ���������� ����� ������������: ������������ ���� �����
    @Override
    public void calcArea() {
        super.setArea(sideA * sideB);
    }
}
