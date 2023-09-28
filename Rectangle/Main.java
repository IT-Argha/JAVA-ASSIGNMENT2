// Q: 1
// AUTHOR: ARGHA DIGAR
// TITLE: Rectangle Class with Area, Perimeter, and Diagonal Calculation
// DESCRIPTION: This Java program defines a Rectangle class with width and height attributes and calculates the area, perimeter, and diagonal of the rectangle.

import java.lang.Math;

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double wid, double heig) {
      width = wid;
      height = heig;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double wid) {
    width = wid;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double heig) {
    height = heig;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public double calculateDiagonal() {
        return Math.sqrt(width * width + height * height);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Rectangle object with width 5.0 and height 7.0
        Rectangle rectangle = new Rectangle(5.0, 7.0);

        // Calculate and print the area, perimeter, and diagonal
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle Diagonal: " + rectangle.calculateDiagonal());
    }
}
