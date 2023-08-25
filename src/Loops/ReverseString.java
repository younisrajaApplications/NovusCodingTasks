package Loops;

import java.util.Scanner;

/*
Create a new Java program called ReverseString
Create a string array called letters and ask the user to
input text for this array with this code:
Scanner reader = new Scanner(System.in);
System.out.print("Input a string: ");
char[] letters = reader.nextLine().toCharArray();
Use a For Loop to print the letters array in reverse...
Example: “Trevor Smith” = “htimS roverT”
You may use the Internet to assist with this task.
 */

/**
 * Get a array of characters input by user and print in reverse order
 * {@code @Author} Younis Mubashar Raja
 * {@code @Version} 24.08.2023
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = reader.nextLine().toCharArray();
        for (int i = 1; i <= letters.length; i++) {
            System.out.print(letters[(letters.length - i)]);
        }
        reader.close();
    }
}
