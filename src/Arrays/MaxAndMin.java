package Arrays;
/*
• Create a new Java program called MaxAndMin
• Create and initialise an integer array and pre-fill it with random values.
• Find and output the maximum and minimum values from the array.

import java.util.Random;
Random rand = new Random();
int num = rand.nextInt(10) + 1;
 */

import java.util.Random;

/**
 * Randomise values of an int array and print the minimum and maximum values of the array
 * {@code @Author} Younis Mubashar Raja
 * {@code @Version} 24.08.2023
 */
public class MaxAndMin {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10) + 1;
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
        }
        System.out.println("Max: " + max + "\n" + "Min: " + min);
    }
}
