package nyc.c4q.ramonaharrison;

/**
 * Ramona Harrison
 * Access Code 2.1
 * TwentyQuestions.java
 * This class gives you twenty chances to guess a randomly generated number
 */

import java.util.Scanner;

public class TwentyQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Double xx = Math.random() * 100000;
        Integer x = xx.intValue();
        int i;

        System.out.println("Guess the value of X!\n");

        for (i = 20; i > 0; i--) {

            System.out.println("\n" + i + ". Your guess:");
            int guess = input.nextInt();

            if (guess > x) {
                System.out.println("\nYour guess is greater than X.");
            } else if (guess < x) {
                System.out.println("\nYour guess is lower than X.");
            } else {
                System.out.println("\nThat's right -- you win!");
                break;
            }

        }

        if (i == 0)
            System.out.println("\nOut of chances, better luck next time!");
    }
}
