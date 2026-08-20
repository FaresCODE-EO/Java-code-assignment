package Day2;

public class HomeAreaCalculation {
    public static void main(String[] args) {
        int a = 10;

        Rectangle room1 = new Rectangle();
        room1.setLength(20);
        room1.setWidth(10);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println("The area of room 1 is: " + areaOfRoom1);

        Rectangle room2 = new Rectangle(30, 10);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println("The area of room 2 is: " + areaOfRoom2);

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("The total area is: " + totalArea);
    }
}