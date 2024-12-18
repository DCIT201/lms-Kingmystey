package org.example;

import java.util.ArrayList;

    public class Patron {
        private String name;
        private final String idNumber;
        private ArrayList<Book> borrowedBooks;


        Patron(String name , String idNumber) {
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
            }else{
                borrowedBooks.add(book);
                System.out.println(this.name + " has borrowed  " + book.title());
            }
        }

        public void returnBook(Book book) {
            if (!borrowedBooks.contains(book)) {
                System.out.println("Book cannot be found");
            }else {
                borrowedBooks.remove(book);
                System.out.println(this.name + " has returned  " + book.title());            }
        }


        public void getBorrowedBooks() {

            if (borrowedBooks.isEmpty()) {
                // indicate that no book has been borrowed
                System.out.println("No book has been borrowed please");
            } else {
                // Initialize to count the books in the arraylist
                int counter = 1;
                // Loop through the borrowedBooks list and print each book's title with numbering
                for (Book book : borrowedBooks) {
                    System.out.println(counter + ". " + book.title());
                    counter++;
                }
            }
        }

    }


