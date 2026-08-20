package Day2;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculatorRedo = new HomeAreaCalculatorRedo();

        Rectangle kitchen = calculatorRedo.getDimentions();
        Rectangle bathroom = calculatorRedo.getDimentions();

        double totalArea = calculatorRedo.calculateArea(kitchen, bathroom);
        System.out.println("The total area is: " + totalArea);

        scanner.close();
    }

    public Rectangle getDimentions() {
        System.out.println("Please enter length: ");
        double length = scanner.nextDouble();
        System.out.println("Please enter width: ");
        double width = scanner.nextDouble();
        Rectangle room = new Rectangle(length, width);
        return room;
    }

    public double calculateArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}