package Methods;
/*
Create a new project called FibonacciCalc. Write a method ‘Fibonacci’ (that is called from
your Main method) that prints out the first 100 numbers of the Fibonacci sequence.
The Fibonacci sequence is a series of numbers where a number is found by adding up the two
numbers before it.
Starting with 0 and 1, the sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so forth.
Written as a rule, the expression is x(n) = x(n-1) + x(n-2)
*/

import java.math.BigInteger;

/**
 * Class with a method to print out the first 100 fibonacci numbers.
 * {@code @Author} Younis Mubashar Raja
 * {@code @Version} 24.08.2023
 */
public class FibonacciCalc {
    public static void main(String[] args) {
        FibonacciCalc calc = new FibonacciCalc();
        calc.fibonacci();
    }

    /**
     * Print out the first 100 fibonacci numbers.
     */
    private void fibonacci() {
        BigInteger x1 = BigInteger.valueOf(0);
        BigInteger x2 = BigInteger.valueOf(1);
        BigInteger xn = x1.add(x2);
        System.out.print(x1 + ", " + x2 + ", " + xn + ", ");
        byte counter = 3;
        while (counter < 100) {
            x1 = x2;
            x2 = xn;
            xn = x1.add(x2);
            System.out.print(xn + ", ");
            counter++;
        }
    }
}
