package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service that provides random number generation with different algorithms.
 * The service ensures that only one instance is created and provides methods
 * for selecting and using different random number generation strategies.
 */
public class RandomNumberService {
    private static RandomNumberService instance = null;
    private RandomNumberStrategy strategy;

    /**
     * Private constructor to ensure that only one instance of RandomNumberService
     * is created. The default strategy is Java's built-in random number generator.
     */
    private RandomNumberService() {
        // Default to Java's built-in random number generator
        this.strategy = new JavaRandomNumberStrategy();
    }

    /**
     * Returns the singleton instance of RandomNumberService. If the instance does
     * not already exist, it creates one.
     * 
     * @return the single instance of RandomNumberService.
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy for generating random numbers.
     * 
     * @param strategy the strategy to set.
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Returns a random number based on the selected strategy. If the strategy is
     * not set (i.e., null), it initializes to the default strategy (Java's random).
     * 
     * @return a positive random number.
     */
    public int getRandomNumber() {
        // If strategy is null, use the default strategy
        if (strategy == null) {
            strategy = new JavaRandomNumberStrategy();  // Default to Java's random generator
        }
        return strategy.generateRandomNumber();
    }
}
