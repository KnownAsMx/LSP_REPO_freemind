package org.howard.edu.lsp.midterm.question2;

public class Calculator {

    /**
     * Sums two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return sum
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * sums two doubles
     * @param a double value
     * @param b double value
     * @return sum
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Sums all the elements in an array of integers.
     *
     * @param numbers an array of integers
     * @return the sum of all integers in the array
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}



