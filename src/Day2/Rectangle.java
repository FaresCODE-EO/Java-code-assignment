package Day2;

public class Rectangle {
    private double length;
    private double width;

    // Default Constructor
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // Overloaded Constructor
    public Rectangle(double length, double width) { // Parameterized Constructor
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return (length * 2) + (width * 2);
    }
}