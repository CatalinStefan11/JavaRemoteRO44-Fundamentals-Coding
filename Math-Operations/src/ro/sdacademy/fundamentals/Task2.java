package ro.sdacademy.fundamentals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your weight in kilograms: ");
        float weight = scanner.nextFloat();

        System.out.println("Please enter your height in centimeters: ");
        int height = scanner.nextInt();

        float heightInCm = height / 100.0F;

        double bmi = weight / (heightInCm * heightInCm);

        System.out.println("Your BMI is: " + Math.floor(bmi * 100) / 100);

        String dmf = new DecimalFormat("#.##").format(bmi);
        System.out.println("Your BMI is: " + dmf);

        if (18.5 > bmi || 24.9 < bmi) {
            System.out.println("BMI not optimal!");
        } else {
            System.out.println("BMI optional");
        }

    }
}
