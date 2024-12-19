package org.example;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;

    // Constructor to initialize a list of books
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove a book from the library
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Method to find a book by title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.title().equals(title)) {
                return book;
            }
        }
        return null;
    }

    // Method to list all books in the library
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            int counter = 1;
            for (Book book : books) {
                System.out.println(counter + "." + book.title());
                counter++;
            }
        }
    }

    // Method to list books with titles and years
    public void listBooksTitlesAndYears() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            int counter = 1;
            for (Book book : books) {
                System.out.println(counter + "." + book.title() + " (" + book.yearPublished() + ")");
                counter++;
            }
        }
    }
}
