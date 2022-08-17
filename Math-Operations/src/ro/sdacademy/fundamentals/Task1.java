package ro.sdacademy.fundamentals;

import java.util.Scanner;

public class Task1 {

    // formulas
    // radius = diameter / 2
    // circle perimeter = 2 * pi * radius
    // circle area = pi * radius ^ 2

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle diameter: ");

        float diameter = scanner.nextFloat();

        float radius = diameter / 2;
        float pi = 3.14F;

        double perimeter = 2 * Math.PI * radius;
        double area = pi * Math.pow(radius, 2);

        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);

    }

}
