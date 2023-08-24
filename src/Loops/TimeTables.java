package Loops;

import java.util.Scanner;
/*
Create a new Java program called Times Table
Ask user for number for the times table with this code:
Scanner reader = new Scanner(System.in);
System.out.print
(“What times table would you like? : ");
int timesTable = reader.nextInt();
Use a For Loop to display the times table up to 12 x
timesTable
Print the result for each within the For Loop using println
*/

/**
 * Ask for input and print timetables.
 */
public class TimeTables {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What times table would you like : ");
        int timesTable = reader.nextInt();
        for (int i = 1; i <= 12 ; i++) {
            System.out.println(timesTable + " x " + i + " = " + (timesTable*i));
        }
    }
}
