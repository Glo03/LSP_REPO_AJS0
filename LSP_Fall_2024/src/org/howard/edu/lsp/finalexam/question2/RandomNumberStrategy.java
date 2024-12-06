package org.howard.edu.lsp.finalexam.question2;

/**
 * Interface for random number generation strategies. Any class implementing this
 * interface must provide a method for generating random numbers.
 */
public interface RandomNumberStrategy {
    
    /**
     * Generates a random number. The specific implementation of this method depends
     * on the strategy used.
     * 
     * @return a randomly generated positive integer.
     */
    int generateRandomNumber();
}
