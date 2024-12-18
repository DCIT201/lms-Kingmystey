package org.example;

import java.util.ArrayList;

public class Patron {
    private String name;
    private final String idNumber;
    private ArrayList<Book> borrowedBooks;

    Patron(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void borrowbook(Book book) {
        if (borrowedBooks.contains(book)) {
            System.out.println("Book is already borrowed");
        } else {
            borrowedBooks.add(book);
            System.out.println(this.name + " has borrowed " + book.title());
        }
    }

    public void returnBook(Book book) {
        if (!borrowedBooks.contains(book)) {
            System.out.println("Book cannot be found");
        } else {
            borrowedBooks.remove(book);
            System.out.println(this.name + " has returned " + book.title());
        }
    }

    public void getBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No book has been borrowed please");
        } else {
            int counter = 1;
            for (Book book : borrowedBooks) {
                System.out.println(counter + ". " + book.title());
                counter++;
            }
        }
    }
}
