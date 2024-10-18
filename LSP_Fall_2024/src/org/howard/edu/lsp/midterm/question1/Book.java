package org.howard.edu.lsp.midterm.question1;

/**
 * Represents a book with title, author, ISBN, and year of publication.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * Constructs a new Book with the specified details.
     * 
     * @param title          the title of the book
     * @param author         the author of the book
     * @param ISBN           the unique ISBN of the book
     * @param yearPublished  the year the book was published
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getters and setters

    /**
     * Gets the title of the book.
     * 
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     * 
     * @param title the new title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    // More getters and setters for author, ISBN, yearPublished

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.ISBN.equals(other.ISBN) && this.author.equals(other.author);
    }

    @Override
    public String toString() {
        return "Title: " + title + " Author: " + author + " ISBN: " + ISBN + " Year Published: " + yearPublished;
    }
}