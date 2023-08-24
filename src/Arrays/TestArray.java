package Arrays;
/*
• Create a new Java program called TestArray
• Initialise an integer variable called sum, set to 0
• Create and initialise an integer array called numbers with a size of 10.
• Fill the array with 10 integer values of your choice
• Write the code to sum the values within numbers array and output the result via the
  sum variable.
• Now calculate the average (using a double variable titled average) and output this
  result also.
*/

/**
 * Create an array of 10 numbers and print out the sum of all the numbers within the array
 */
public class TestArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * i;
        }
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
