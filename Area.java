package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius = 0;
        Scanner input = new Scanner(System.in);
        try {
            do {
                System.out.println("Enter the radius of the circle: ");
                radius = input.nextDouble();
            } while (radius <= 0);
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        } catch (Exception e) {
            System.err.println("Invalid radius entered.");
        }
    }
}
