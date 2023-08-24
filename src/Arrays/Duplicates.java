package Arrays;

import java.util.Random;

/*

Exercise 4
Create a new Java program called Duplicates
Create and initialise two integer array (array1 and array2)
and pre-fill them with random values between 1 to 20 and print them, each on one line.
Use a pair of nested for loops to find values from array1 that are duplicated
in array2 and print them out.
*/

/**
 * Create two randomised arrays and find the duplicates in them using nested loops
 * {@code @Author} Younis Mubashar Raja
 * {@code @Version} 24.08.2023
 */
public class Duplicates {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(20) + 1;
            array2[i] = rand.nextInt(20) + 1;
        }
        System.out.print("Array 1:");
        for (int number: array1) {
            System.out.print(number + " ");
        }
        System.out.print("\nArray 2:");
        for (int number: array2) {
            System.out.print(number + " ");
        }
        System.out.print("\nDuplicates: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array2[j] + " ");
                }
            }
        }
    }
}
