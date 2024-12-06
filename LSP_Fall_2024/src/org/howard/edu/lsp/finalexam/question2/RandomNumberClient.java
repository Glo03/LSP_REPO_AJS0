package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program that demonstrates the usage of RandomNumberService. This program
 * invokes the service for different random number generation algorithms and displays
 * the results to the screen.
 */

//Got ChatGPT to help me solve this question 2: https://chatgpt.com/c/67525537-8788-8003-9186-9cd9679ae14f
//use https://www.geeksforgeeks.org/generating-random-numbers-in-java/
public class RandomNumberClient {

    /**
     * Main method that demonstrates how to use the RandomNumberService with different
     * random number generation strategies.
     * 
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Get the singleton instance of RandomNumberService
        RandomNumberService service = RandomNumberService.getInstance();

        // Display random numbers using Java built-in random number generator
        System.out.println("Java Random Number: " + service.getRandomNumber());

        // Set the strategy to the custom random number generator
        service.setStrategy(new CustomRandomNumberStrategy(12345));

        // Display random numbers using custom random number generator
        System.out.println("Custom Random Number: " + service.getRandomNumber());
    }
}
