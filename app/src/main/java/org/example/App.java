package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Patron patron = new Patron("akdie", "1101");
        System.out.println(patron.getName());
        System.out.println(patron.getIdNumber());
        Book book = new Book("Kaya Girl", "Mamale Wolo", 2022);
        Book book2 = new Book("The Son of Umbele", "Ama Atta Aido", 2005);
        Book book3 = new Book("Titanic", "Prince Henry", 1995);
        Book book4 = new Book("Rich Dad, Poor Dad", "Robert Kiyosaki", 2000);

        patron.borrowbook(book);
        patron.borrowbook(book2);
        patron.borrowbook(book3);
        patron.returnBook(book4); // This should indicate the book isn't found
        patron.getBorrowedBooks();
        patron.borrowbook(book3); // Borrowing the same book again

        Library library = new Library();
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.listOfBooks();

        library.searchBook("Kaya Girl");
    }
}
