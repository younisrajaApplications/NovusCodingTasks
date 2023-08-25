package Arrays;

import java.util.Scanner;

/*
Create a new Java program called ExistInArray
Create and initialise an integer array and pre-fill it with values of your choosing.
Ask the user to enter an integer value to search for in your array.
If the value exists, output “Value X found in array” otherwise, output “Value was
not found in array”.
 */

/**
 * Create array and look for user inputted value
 * {@code @Author} Younis Mubashar Raja
 * {@code @Version} 24.08.2023
 */
public class ExistInArray {
    public static void main(String[] args) {
        int[] numbers = {3,2,4,6,8,5,7,43};
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter a number to look for in the array: ");
        int searchVal = reader.nextInt();
        boolean found = false;
        for (int number : numbers) {
            if (number == searchVal) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(searchVal + " found in the array.");
        } else {
            System.out.println(searchVal + " not found in the array");
        }
        reader.close();
    }
}
