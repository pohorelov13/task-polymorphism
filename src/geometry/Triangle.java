package geometry;

//клас наслідує Фігуру
public class Triangle extends Figure {

    private double heightA;
    private double sideA;
    private double sideB;
    private double sideC;
    private int angle;


    //приймає ім'я, сторону та висоту, проведену до цієї сторони
    //після цього обчислює площу фігури
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

    //універсальна формула для будь-якого трикутника:
    // 1/2 * сторону * висоту, проведену до цієї сторони
    void calcAreaHeight(){
        super.setArea((heightA * sideA) / 2);
    }

    //розрахунок за трьома сторонами
    void calcAreaThreeSide() {
        double p = (this.sideA + this.sideB + this.sideC) / 2;
        super.setArea(Math.sqrt(p * (p - this.sideA) * (p - sideB) * (p - sideC)));
    }

    //розрахунок за два сторонами і кутом між ними
    void calcAreaTwoSideAngle() {
        double a = Math.toRadians(this.angle);
        super.setArea((this.sideA * this.sideB * Math.sin(a)) / 2);
    }
}
