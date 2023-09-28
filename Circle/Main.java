// Q: 2
// AUTHOR: ARGHA DIGAR
// TITLE: Circle Class with Area and Circumference Calculation
// DESCRIPTION: This Java program defines a Circle class with a radius attribute. It provides methods to access and modify the radius and calculates the area and circumference of the circle.

import java.lang.Math;

class Circle {
    private double radius;

    public Circle(double radiu) {
       radius = radiu;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radiu) {
        radius = radiu;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Circle object with a radius of 3.0
        Circle circle = new Circle(3.0);

        // Access and modify the radius
        double newRadius = 5.0;
        circle.setRadius(newRadius);

        // Calculate and print the area and circumference
        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());
    }
}
