package org.howard.edu.lsp.finalexam.question2;

/**
 * Implementation of RandomNumberStrategy using a custom random number algorithm.
 * This strategy generates random numbers in the range of 1 to 100 using a simple
 * linear congruential generator.
 */

//Used ChatGPT to help me fix my code: https://chatgpt.com/c/67525486-24b4-8003-8541-40ce0e8e4e2b
public class CustomRandomNumberStrategy implements RandomNumberStrategy {

    private long seed;

    /**
     * Constructor to initialize the custom random number generator with a specific seed.
     * 
     * @param seed the seed value used for random number generation.
     */
    public CustomRandomNumberStrategy(long seed) {
        this.seed = seed;
    }

    /**
     * Generates a random number using a custom algorithm (linear congruential generator).
     * 
     * @return a random integer between 1 and 100 (inclusive).
     */
    @Override
    public int generateRandomNumber() {
        // Custom algorithm (e.g., a simple linear congruential generator)
        seed = (seed * 6364136223846793005L + 1) % 100;
    	return (int)(seed % 100) + 1;  // Random number between 1 and 100
    }
}
