package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * Driver class to test the MapUtilities class.
 */
public class MapUtilitiesDriver {

    /**
     * Main method to test the commonKeyValuePairs method in MapUtilities.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create first HashMap
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Alice", "Healthy");
        map1.put("Mary", "Ecstatic");
        map1.put("Bob", "Happy");
        map1.put("Chuck", "Fine");
        map1.put("Felix", "Sick");

        // Create second HashMap
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Mary", "Ecstatic");
        map2.put("Felix", "Healthy");
        map2.put("Ricardo", "Superb");
        map2.put("Tam", "Fine");
        map2.put("Bob", "Happy");

        // Output the number of common key-value pairs
        int commonPairs = MapUtilities.commonKeyValuePairs(map1, map2);
        System.out.println("Number of common key/value pairs is: " + commonPairs);  // Expected output: 2
    }
}
