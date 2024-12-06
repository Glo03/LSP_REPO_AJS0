package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Reference:
 * referred back to Assignment 6
 * Reference class math from Oracle Doc 
 * "https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html"
 */
class MathUtilsTest {
    
    /**
     * Test factorial(0) to ensure that the method returns 1 for n=0.
     */
    @Test
    public void testFactorial_ofZero() {
        MathUtils utils = new MathUtils();
        int result = utils.factorial(0);
        assertEquals(1, result, "factorial(0) should return 1");
    }

    /**
     * Test factorial(1) to ensure that the method returns 1 for n=1.
     */
    @Test
    public void testFactorial_ofOne() {
        MathUtils utils = new MathUtils();
        int result = utils.factorial(1);
        assertEquals(1, result, "factorial(1) should return 1");
    }

    /**
     * Test factorial with a positive integer (e.g., 5) to ensure correctness.
     */
    @Test
    public void testFactorial_ofPositiveNumber() {
        MathUtils utils = new MathUtils();
        int result = utils.factorial(5);
        assertEquals(120, result, "factorial(5) should return 120");
    }

    /**
     * Test factorial with a larger positive integer (e.g., 10) to ensure correctness.
     */
    @Test
    public void testFactorial_ofLargerNumber() {
        MathUtils utils = new MathUtils();
        int result = utils.factorial(10);
        assertEquals(3628800, result, "factorial(10) should return 3,628,800");
    }

    /**
     * Test factorial with a negative number to ensure IllegalArgumentException is thrown.
     */
    @Test
    public void testFactorial_ofNegativeNumber_throwsException() {
        MathUtils utils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> {
            utils.factorial(-1);
        }, "factorial(-1) should throw IllegalArgumentException");
    }

    /**
     * Test isPrime with a known prime number (7) to ensure it returns true.
     */
    @Test
    public void testIsPrime_withPrimeNumber() {
        MathUtils utils = new MathUtils();
        assertTrue(utils.isPrime(7), "7 is a prime number");
    }

    /**
     * Test isPrime with a known non-prime number (10) to ensure it returns false.
     */
    @Test
    public void testIsPrime_withNonPrimeNumber() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(10), "10 is not a prime number");
    }

    /**
     * Test isPrime with 1 and 0 to verify these return false since they are not prime.
     */
    @Test
    public void testIsPrime_withOneAndZero() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(1), "1 is not a prime number");
        assertFalse(utils.isPrime(0), "0 is not a prime number");
    }

    /**
     * Test isPrime with a negative number to ensure it returns false for negatives.
     */
    @Test
    public void testIsPrime_withNegativeNumber() {
        MathUtils utils = new MathUtils();
        assertFalse(utils.isPrime(-5), "Negative numbers are not prime");
    }

    /**
     * Test isPrime with 2, the smallest prime number, to ensure it returns true.
     */
    @Test
    public void testIsPrime_withTwo() {
        MathUtils utils = new MathUtils();
        assertTrue(utils.isPrime(2), "2 is the smallest prime number");
    }

    /**
     * Test gcd with two non-zero integers (e.g., 54 and 24) to ensure correctness.
     */
    @Test
    public void testGcd_withTwoNonZeroNumbers() {
        MathUtils utils = new MathUtils();
        int result = utils.gcd(54, 24);
        assertEquals(6, result, "gcd(54,24) should return 6");
    }

    /**
     * Test gcd with one value as zero to ensure it returns the absolute value of the non-zero number.
     */
    @Test
    public void testGcd_withOneZeroValue() {
        MathUtils utils = new MathUtils();
        int result = utils.gcd(0, 15);
        assertEquals(15, result, "gcd(0,15) should return 15");
        
        result = utils.gcd(-20, 0);
        assertEquals(20, result, "gcd(-20,0) should return 20");
    }

    /**
     * Test gcd with both inputs as zero to ensure IllegalArgumentException is thrown.
     */
    @Test
    public void testGcd_withBothZero_throwsException() {
        MathUtils utils = new MathUtils();
        assertThrows(IllegalArgumentException.class, () -> {
            utils.gcd(0, 0);
        }, "gcd(0,0) should throw IllegalArgumentException");
    }

    /**
     * Test gcd with negative numbers to ensure it properly returns the positive GCD.
     */
    @Test
    public void testGcd_withNegativeNumbers() {
        MathUtils utils = new MathUtils();
        int result = utils.gcd(-8, -12);
        assertEquals(4, result, "gcd(-8,-12) should return 4");
    }

    /**
     * Test gcd with coprime numbers (e.g., 17 and 13) to ensure it returns 1.
     */
    @Test
    public void testGcd_withCoprimeNumbers() {
        MathUtils utils = new MathUtils();
        int result = utils.gcd(17, 13);
        assertEquals(1, result, "gcd(17,13) should return 1 since these numbers are coprime");
    }
}
