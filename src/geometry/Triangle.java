package geometry;

//���� ������ Գ����
public class Triangle extends Figure {

    private double heightA;
    private double sideA;
    private double sideB;
    private double sideC;
    private int angle;


    //������ ��'�, ������� �� ������, ��������� �� ���� �������
    //���� ����� �������� ����� ������
    public Triangle(String name, double side, double height) {
        super(name);
        this.heightA = height;
        this.sideA = side;
        calcArea();
    }

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        calcArea();
    }

    public Triangle(String name, double sideA, double sideB, int angle) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
        calcArea();
    }


    @Override
    public void calcArea() {
        if (this.sideB != 0 && this.sideA != 0 && this.sideC != 0) {
            calcAreaThreeSide();
        } else if (this.sideA != 0 && this.heightA != 0) {
            calcAreaHeight();
        } else if (this.sideA != 0 && this.sideB != 0 && this.angle !=0) {
            calcAreaTwoSideAngle();
        }
    }

    //����������� ������� ��� ����-����� ����������:
    // 1/2 * ������� * ������, ��������� �� ���� �������
    void calcAreaHeight(){
        super.setArea((heightA * sideA) / 2);
    }

    //���������� �� ������ ���������
    void calcAreaThreeSide() {
        double p = (this.sideA + this.sideB + this.sideC) / 2;
        super.setArea(Math.sqrt(p * (p - this.sideA) * (p - sideB) * (p - sideC)));
    }

    //���������� �� ��� ��������� � ����� �� ����
    void calcAreaTwoSideAngle() {
        double a = Math.toRadians(this.angle);
        super.setArea((this.sideA * this.sideB * Math.sin(a)) / 2);
    }
}
