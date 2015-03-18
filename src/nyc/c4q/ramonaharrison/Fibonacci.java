package nyc.c4q.ramonaharrison;

/**
 * Ramona Harrison
 * Access Code 2.1
 * Scratch.java
 * This class compares two methods for finding the nth fibonacci number
 */


public class Fibonacci {
    public static void main(String[] args) {

        // times finding the 40th fibonacci number iteratively

        long startTime = System.nanoTime();
            System.out.println("fibonacci(40): " + fibonacci(40));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("Time to find the 40th fibonacci number iteratively: ~" + duration + " nanoseconds\n");

        // times finding the 40th fibonacci number recursively

        long startTime2 = System.nanoTime();
        System.out.println("recursiveFib(40): " + recursiveFib(40));
        long endTime2 = System.nanoTime();

        long duration2 = (endTime2 - startTime2);
        System.out.println("Time to find the 40th fibonacci number recursively: ~" + duration2 + " nanoseconds");

    }

    public static int fibonacci(int n) {

        // iterative approach: starts with two lowest fib values and loops n times, summing the two most recent fib values

        int fib1 = 1;
        int fib2 = 0;
        int nextFib = 0;
        int nthFib = 0;

        for (int i = 0; i < n; i++) {
            nthFib = nextFib;
            nextFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = nextFib;

        }

        return nthFib;
    }

    public static int recursiveFib(int n) {

        // recursive approach: for each value n, returns the sum of the two previous fibonacci numbers, until the first two fibonacci numbers are reached

        if (n == 1) {
            return (0);
        } else if (n == 2) {
            return 1;
        } else {
            return (recursiveFib(n - 1) + recursiveFib(n - 2));
        }
    }

}



