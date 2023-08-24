package Loops;

import java.util.Scanner;

/*
Create a new Java program called SumNumbers
Create an integer called sumTotal initialised to 0
Ask user for number to sum to with this code:
Scanner reader = new Scanner(System.in);
System.out.print
("Input a number to sum to: ");
int sumTo = reader.nextInt();
Use a While Loop to sum the numbers from 1 to sumTo
adding each to the sumTotal
Print the result after exiting the While Loop
For example: an entry of 3 will give 6: 1 + 2 + 3
 */

/**
 * Print the sum of all the numbers to a given numbers
 */
public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        int sumTo = reader.nextInt();
        int sumTotal = 0;
        byte counter = 1;
        while (counter <= 3) {
            sumTotal += counter;
            counter++;
        }
        System.out.println(sumTotal);
    }
}
