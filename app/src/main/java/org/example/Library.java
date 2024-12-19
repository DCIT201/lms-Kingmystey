package org.example;

import java.util.ArrayList;

// Class to represent a library containing books
public class Library {
    private final ArrayList<Book> books;

    // Constructor to initialize the list of books
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove a book from the library by title
    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    // Method to find a book in the library by title
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.title().equals(title)) {
                return book;
            }
        }
        return null;
    }

    // Method to list all the books in the library
    public void booksInStock() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            int counter = 1;
            for (Book book : books) {
                System.out.println(counter + ". " + book.title());
                counter++;
            }
        }
    }

    // Method to list the books with titles and years
    public void listBooksTitlesAndYears() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            int counter = 1;
            for (Book book : books) {
                System.out.println(counter + ". " + book.title() + " (" + book.yearPublished() + ")");
                counter++;
            }
        }
    }
}
