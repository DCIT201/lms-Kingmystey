package org.example;

import java.util.ArrayList;

public class Patron {
    private String name;
    private final String idNumber;
    private ArrayList<Book> borrowedBooks;

    // Constructor to initialize Patron with name and idNumber
    public Patron(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter and Setter for Patron's name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Getter for Patron's idNumber
    public String getIdNumber() {
        return idNumber;
    }

    // Method for Patron to borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(this.name + " has borrowed  " + book.title());
    }

    // Method for Patron to return a borrowed book
    public void returnBorrowedBook(Book book) {
        borrowedBooks.remove(book);
    }

    // Method to list all borrowed books
    public void listBorrowedBooks() {
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

    // Changed method name from 'findBookByTitle' to 'searchBook'
    public Book searchBook(String title) {
        for (Book book : borrowedBooks) {
            if (book.title().equals(title)) {
                return book;
            }
        }
        return null;  // If book not found
    }
}
