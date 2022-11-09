package geometry;

import geometry.util.Rounder;

public class Data {

    static Figure[] areas;
    static double totalSquare;

    static void handleData() {
        //створення об'єктів, масиву, виклик методів
        Figure circle1 = new Circle("O", 12);
        Figure circle2 = new Circle("O1", 7);
        Figure square = new Square("ABCD", 15, 15);
        Figure triangle = new Triangle("ABC", 15, 16);
        Figure triangle2 = new Triangle("CDE", 11, 5);

        areas = new Figure[]{circle1, square, triangle, circle2, triangle2};

        calcSumArea();
        printInfo();
    }

    static void calcSumArea() {
        //прохід по масиву фігур, сумується площа
        totalSquare = 0;
        for (Figure i : areas) {
            totalSquare += i.getArea();
        }
    }

    static void printInfo() {
        //Метод виводить округлену загальну площу
        System.out.println("The total area of all figures - " +
                Rounder.roundValue(totalSquare) + " square centimeters");
    }
}
