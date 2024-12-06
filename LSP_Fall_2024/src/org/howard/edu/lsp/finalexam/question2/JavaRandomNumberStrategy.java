package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Implementation of RandomNumberStrategy using Java's built-in random number generator.
 * This strategy generates random numbers in the range of 1 to 100.
 */
public class JavaRandomNumberStrategy implements RandomNumberStrategy {

    private Random random;

    /**
     * Constructor that initializes the Java Random object.
     */
    public JavaRandomNumberStrategy() {
        this.random = new Random();
    }

    /**
     * Generates a random number using Java's built-in random number generator.
     * 
     * @return a random integer between 1 and 100 (inclusive).
     */
    @Override
    public int generateRandomNumber() {
        return random.nextInt(100) + 1;  // Random number between 1 and 100
    }
}
