package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a set of integers with various set operations.
 */
public class IntegerSet {
    // Store the set elements in an ArrayList
    private List<Integer> set = new ArrayList<Integer>();

    // Default Constructor
    public IntegerSet() {}

    // Constructor to initialize with a pre-defined set
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the length of the set.
     * @return the number of elements in the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Returns true if the two sets are equal, false otherwise.
     * Two sets are equal if they contain all of the same values in any order.
     * @param o the other set to compare to.
     * @return true if sets are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof IntegerSet)) {
            return false;
        }
        IntegerSet otherSet = (IntegerSet) o;
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
    }

    /**
     * Returns true if the set contains the value.
     * @param value the value to check.
     * @return true if the value is in the set, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest item in the set.
     * @return the largest integer in the set.
     * @throws IllegalStateException if the set is empty.
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Set is empty");
        }
        return set.stream().max(Integer::compareTo).get();
    }

    /**
     * Returns the smallest item in the set.
     * @return the smallest integer in the set.
     * @throws IllegalStateException if the set is empty.
     */
    public int smallest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Set is empty");
        }
        return set.stream().min(Integer::compareTo).get();
    }

    /**
     * Adds an item to the set or does nothing if it's already there.
     * @param item the integer to add.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set or does nothing if it isn't there.
     * @param item the integer to remove.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs a union of the current set with another set.
     * @param intSetb the other set to union with.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Performs an intersection of the current set with another set.
     * @param intSetb the other set to intersect with.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Returns the difference between the current set and another set.
     * @param intSetb the other set to find the difference with.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Returns the complement of the current set with another set (elements not in the first set).
     * @param intSetb the other set.
     */
    public void complement(IntegerSet intSetb) {
        ArrayList<Integer> universalSet = new ArrayList<>(intSetb.set);
        universalSet.removeAll(set);
        set = universalSet;
    }

    /**
     * Returns true if the set is empty, false otherwise.
     * @return true if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * @return the string representation of the set.
     */
    @Override
    public String toString() {
        return set.toString();
    }
}
