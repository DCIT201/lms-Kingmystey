package org.example;

import java.util.ArrayList;

public class Library {

    private final ArrayList<Book> books;

    // Constructor to initialize a list of books
    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void listOfBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books in stock");
            int counter = 1;
            for (Book book : books) {
                System.out.println(counter + "." + book.title() + "  Author: " + book.author() + "  Year Published:" + book.yearPublished());
                counter++;
            }
        }
    }

    public void searchBook(String title) {
        if (!books.isEmpty()) {
            for (Book book : books) {
                if (book.title().equals(title)) {
                    System.out.println(book.title() + " is found");
                    return;
                }
            }
            System.out.println("Book is not available.");
        } else {
            System.out.println("Book list is empty.");
        }
    }
}
