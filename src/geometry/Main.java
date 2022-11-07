package geometry;

public class Main {
    static Figure[] areas;
    static double totalSquare;


    public static void main(String[] args) {
        handleData();
    }

    static void handleData() {
        Figure circle1 = new Circle("Circle", 12, 12);
        Figure circle2 = new Circle("Circle2", 7, 7);
        Figure square = new Square("Square", 15, 15);
        Figure triangle = new Triangle("Triangle", 11, 16);
        Figure triangle2 = new Triangle("Triangle2", 11,5);

        areas = new Figure[]{circle1, square, triangle, circle2, triangle2};

        calcSumArea();
        printInfo();
    }
    static void calcSumArea() {
        totalSquare = 0;
        for (Figure i : areas) {
            i.setArea(i.calcArea(i.getWidth(), i.getHeight()));
            totalSquare += i.getArea();
        }
    }

    static void printInfo(){
        System.out.print("The total area of all figures - " + totalSquare +" square centimeters");
    }
}
