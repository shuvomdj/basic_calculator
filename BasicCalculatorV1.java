package twentyfive.fall.oop.group2.lesson1.class3;

import java.util.Scanner;
public class basiccalculator {
    public static void main(String[] args) {
        // Input first entry value
        System.out.println("First Number Input: ");
        Scanner to = new Scanner(System.in); // input first data to scanner
        float toadd = to.nextFloat();
        // Input math mode (+, -, *, /)
        System.out.println("Input Math Function (+, -, *, /): ");
        Scanner motiv = new Scanner(System.in);
        char motivadd = motiv.next().charAt(0);
        // input 2nd entry value
        System.out.println("Second No Input: ");
        Scanner with = new Scanner(System.in);
        float withadd = with.nextFloat();
        // result method
        float result = 0;
        if (motivadd == '+') result = toadd + withadd;
        else if (motivadd == '-') result = toadd - withadd;
        else if (motivadd == '*') result = toadd * withadd;
        else if (motivadd == '/') result = toadd / withadd;
        else System.out.println("Invalid operator!");
        // result output
        System.out.println("Result: " + result);
    }
}
