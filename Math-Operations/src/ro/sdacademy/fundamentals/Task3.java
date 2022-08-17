package ro.sdacademy.fundamentals;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the coefficient for a: ");
        float a = scanner.nextFloat();

        System.out.println("Please enter the coefficient for b: ");
        float b = scanner.nextFloat();

        System.out.println("Please enter the coefficient for c: ");
        float c = scanner.nextFloat();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if(delta < 0){
            System.out.println("Delta is negative");
            System.exit(0);
        } else {

            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);

            System.out.format("X1: %.2f", x1);
            System.out.println();
            System.out.format("X2: %.2f", x2);

        }

    }
}
