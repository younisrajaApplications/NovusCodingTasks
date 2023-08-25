package Methods;
/*
Create a new project called MyCalculator.
Read in two numbers from the user (num1 and num2) then create and call all four of
the following methods (and print the results accordingly):
• Write a method to add the two numbers
• Write a method to subtract the two numbers
• Write a method to multiply the two numbers
• Write a method to divide the two numbers
*/

import java.util.Scanner;

/**
 * Take in two numbers from the user and apply the following operations on them
 * through the use of methods:
 * - Addition
 * - Subtraction
 * - Division
 * - Multiplication
 * {@code @Author} Younis Mubashar Raja
 * {@code @Version} 25.08.2023
 */
public class MyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Please enter your second number: ");
        float num2 = scanner.nextFloat();
        MyCalculator calculator = new MyCalculator();
        calculator.add(num1, num2);
        calculator.subtract(num1, num2);
        calculator.divide(num1, num2);
        calculator.multiply(num1, num2);
        scanner.close();
    }

    /**
     * Apply + to the two numbers input by the user
     * @param num1 User input
     * @param num2 User input
     */
    private void add(float num1, float num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    /**
     * Apply - to the two numbers input by the user
     * @param num1 User input
     * @param num2 User input
     */
    private void subtract(float num1, float num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    /**
     * Apply * to the two numbers input by the user
     * @param num1 User input
     * @param num2 User input
     */
    private void multiply(float num1, float num2) {
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
    }

    /**
     * Apply / to the two numbers input by the user
     * @param num1 User input
     * @param num2 User input
     */
    private void divide(float num1, float num2) {
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
