package org.example;

import java.util.ArrayList;

// Class to represent a library patron (a person who borrows books)
public class Patron {
    private String name;
    private final String idNumber;
    private ArrayList<Book> borrowedBooks;

    // Constructor to initialize patron's name, id, and borrowedBooks list
    public Patron(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    // Method to set patron's name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get patron's name
    public String getName() {
        return name;
    }

    // Method to get patron's ID number
    public String getIdNumber() {
        return idNumber;
    }

    // Method for the patron to borrow a book
    public void borrowBook(Book book, Library library) {
        if (library.removeBook(book)) {
            borrowedBooks.add(book);
            System.out.println(this.name + " has borrowed: " + book.title());
        } else {
            System.out.println("The book is not available.");
        }
    }

    // Method for the patron to return a borrowed book
    public void returnBook(Book book, Library library) {
        if (borrowedBooks.remove(book)) {
            library.addBook(book);
            System.out.println(this.name + " has returned: " + book.title());
        } else {
            System.out.println("You don't have this book.");
        }
    }

    // Method to list all the books borrowed by the patron
    public void getBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            int counter = 1;
            for (Book book : borrowedBooks) {
                System.out.println(counter + ". " + book.title());
                counter++;
            }
        }
    }
}
