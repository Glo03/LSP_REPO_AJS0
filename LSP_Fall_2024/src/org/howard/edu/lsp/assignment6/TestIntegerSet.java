package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestIntegerSet {

    private IntegerSet set;

    @BeforeEach
    public void setUp() {
        set = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear method")
    public void testClear() {
        set.add(1);
        set.clear();
        assertTrue(set.isEmpty(), "The set should be empty after clear is called.");
    }

    @Test
    @DisplayName("Test case for length method")
    public void testLength() {
        set.add(1);
        set.add(2);
        assertEquals(2, set.length(), "The set should have a length of 2 after adding two elements.");
    }

    @Test
    @DisplayName("Test case for equals method")
    public void testEquals() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set.equals(set2), "Sets with the same elements should be equal, regardless of order.");
    }

    @Test
    @DisplayName("Test case for contains method")
    public void testContains() {
        set.add(3);
        assertTrue(set.contains(3), "The set should contain the value 3.");
        assertFalse(set.contains(4), "The set should not contain the value 4.");
    }

    @Test
    @DisplayName("Test case for largest method")
    public void testLargest() throws IntegerSetException {
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(3, set.largest(), "The largest element should be 3.");
    }

    @Test
    @DisplayName("Test case for largest method exception")
    public void testLargestException() {
        assertThrows(IntegerSetException.class, set::largest, "Calling largest on an empty set should throw an exception.");
    }

    @Test
    @DisplayName("Test case for smallest method")
    public void testSmallest() throws IntegerSetException {
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(1, set.smallest(), "The smallest element should be 1.");
    }

    @Test
    @DisplayName("Test case for smallest method exception")
    public void testSmallestException() {
        assertThrows(IntegerSetException.class, set::smallest, "Calling smallest on an empty set should throw an exception.");
    }

    @Test
    @DisplayName("Test case for add method")
    public void testAdd() {
        set.add(1);
        set.add(1);  // Adding the same element should not increase length
        assertEquals(1, set.length(), "Adding a duplicate element should not increase the set size.");
    }

    @Test
    @DisplayName("Test case for remove method")
    public void testRemove() {
        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1), "After removal, the element should no longer be in the set.");
    }

    @Test
    @DisplayName("Test case for union method")
    public void testUnion() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set2.add(2);
        set.union(set2);
        assertTrue(set.contains(1) && set.contains(2), "Union should contain elements from both sets.");
    }

    @Test
    @DisplayName("Test case for intersect method")
    public void testIntersect() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set2.add(2);
        set2.add(3);
        set.intersect(set2);
        assertTrue(set.contains(2), "Intersection should contain common elements.");
        assertFalse(set.contains(1), "Intersection should not contain elements unique to one set.");
    }

    @Test
    @DisplayName("Test case for diff method")
    public void testDiff() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set2.add(2);
        set.diff(set2);
        assertTrue(set.contains(1), "Difference should contain elements unique to the first set.");
        assertFalse(set.contains(2), "Difference should not contain elements present in both sets.");
    }

    @Test
    @DisplayName("Test case for isEmpty method")
    public void testIsEmpty() {
        assertTrue(set.isEmpty(), "A new set should be empty.");
        set.add(1);
        assertFalse(set.isEmpty(), "Set should not be empty after adding elements.");
    }

    @Test
    @DisplayName("Test case for toString method")
    public void testToString() {
        set.add(1);
        set.add(2);
        String expected = "[1, 2]";
        assertEquals(expected, set.toString(), "String representation should match the expected format.");
    }
}

