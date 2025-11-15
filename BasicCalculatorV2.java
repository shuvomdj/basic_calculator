package twentyfive.fall.oop.group2.lesson1.class3;

import java.util.Scanner;

public class scientificcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // input data to system
        // Entry of first no
        System.out.println("First Number Input: ");
        float first = input.nextFloat(); // input in floating format for wide range cover
        // selecting math formula for easy calculating
        System.out.println("Select Math Function:");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. ½ (Half of first number)");
        System.out.println("6. ¼ (One-fourth of first number)");
        //input of selected calculating method
        int choice = input.nextInt();

        float second = 0;
        float result = 0;

        // Only ask for second number if needed
        if (choice >= 1 && choice <= 4) {
            System.out.println("Second Number Input: ");
            second = input.nextFloat();
        }
        // calculation
        switch (choice) {
            case 1 -> result = first + second;
            case 2 -> result = first - second;
            case 3 -> result = first * second;
            case 4 -> result = first / second;
            case 5 -> result = first / 2;
            case 6 -> result = first / 4;
            default -> System.out.println("Invalid choice!");
        }
       // result output
        System.out.println("Result: " + result);
    }
}
