package org.howard.edu.lsp.midterm.question1;

/**
 * BookDriver class to test the Book class by creating instances and comparing them.
 */
public class BookDriver {

    /**
     * Main method to test the Book class functionalities.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // Testing equality between books
        System.out.println(book1.equals(book2)); // true
        System.out.println(book1.equals(book3)); // false

        // Printing the string representation of book1
        System.out.println(book1); // Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
    }
}