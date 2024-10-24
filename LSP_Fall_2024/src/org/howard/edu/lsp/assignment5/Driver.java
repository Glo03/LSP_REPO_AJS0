package org.howard.edu.lsp.assignment5;

public class Driver {
    public static void main(String[] args) {
        // Create two sets for testing
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // Add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1.toString());
        
        // Test largest and smallest
        System.out.println("Smallest value in Set1: " + set1.smallest());
        System.out.println("Largest value in Set1: " + set1.largest());

        // Add elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set2: " + set2.toString());

        // Test union
        System.out.println("Union of Set1 and Set2:");
        set1.union(set2);
        System.out.println("Resulting Set1 after union: " + set1.toString());

        // Test intersection
        set1 = new IntegerSet();  // Reset set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1.toString());
        set1.intersect(set2);
        System.out.println("Resulting Set1 after intersection: " + set1.toString());

        // Test difference
        set1 = new IntegerSet();  // Reset set1 again
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.diff(set2);
        System.out.println("Resulting Set1 after difference (Set1 - Set2): " + set1.toString());

        // Test complement
        set1.add(1);
        set1.add(2);
        set1.complement(set2);
        System.out.println("Resulting Set1 after complement: " + set1.toString());

        // Test if set is empty
        System.out.println("Is Set1 empty? " + set1.isEmpty());

        // Test equality
        IntegerSet set3 = new IntegerSet();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        System.out.println("Set1 equals Set3? " + set1.equals(set3));
    }
}
