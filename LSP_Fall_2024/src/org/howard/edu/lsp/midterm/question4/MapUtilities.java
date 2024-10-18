package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * Utility class for operations on HashMaps.
 * reference: https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
 */
public class MapUtilities {

    /**
     * Finds the number of common key-value pairs between two HashMaps.
     * 
     * @param map1 the first HashMap containing String keys and values
     * @param map2 the second HashMap containing String keys and values
     * @return the number of common key-value pairs
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Return 0 if either of the maps is empty
        if (map1 == null || map2 == null || map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonPairsCount = 0;

        // Loop through each key in map1 and check if the same key exists in map2
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonPairsCount++;  // Increment count if both key and value match
            }
        }

        return commonPairsCount;
    }
}