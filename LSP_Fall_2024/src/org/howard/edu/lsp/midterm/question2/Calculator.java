package org.howard.edu.lsp.midterm.question2;

/**
 * Utility class that provides methods to sum different types of numbers.
 * This class contains overloaded sum() methods to handle integers, doubles,
 * and arrays of integers.
 */
public class Calculator {

    /**
     * Sums two integers.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Sums two double values.
     * 
     * @param a the first double value
     * @param b the second double value
     * @return the sum of the two double values
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Sums all elements in an array of integers.
     * 
     * @param numbers the array of integers
     * @return the sum of all elements in the array
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}