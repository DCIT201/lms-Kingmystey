/*
 * This should be your main class where all your objects will be created
 */
package org.example;

import org.w3c.dom.ls.LSOutput;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Patron patron = new Patron("akdie" , "1101" );
        System.out.println(patron.getName());
        System.out.println(patron.getIdNumber());
        Book book = new Book("kaya girl" , "mamele wolow" , 2022);
        Book book2 = new Book("The son of Umbele" , "Ama Atta aido" , 2005);
        Book book3 = new Book("Titanic" , "Prince Henry" , 1995);
        Book book4 = new Book("Rich Dad , Poor Dad" , "Robert Kiyosaki" , 2000);


        patron.borrowbook(book);
        patron.borrowbook(book2);
        patron.borrowbook(book3);
        patron.returnBook(book4);
        patron.getBorrowedBooks();
        patron.borrowbook(book3);

        Library library  = new Library();
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.listOfBooks();

        library.searchBook("kaya girl");

    }

}
