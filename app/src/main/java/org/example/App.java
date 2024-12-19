package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("Kaya Girl", "Mamale Wolo", 2016));
        library.addBook(new Book("Titanic: The Long Night", "John P. Eaton", 1999));
        library.addBook(new Book("The Psychology of Money", "Morgan Housel", 2020));
        library.addBook(new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki", 1997));
        library.addBook(new Book("The Son of Umbele", "Michele Obi", 2018));


        // Displaying the list of books in the library
        System.out.println("---------------------");
        System.out.println("       Books in Stock at the  Library");
        System.out.println("---------------------");
        library.listBooks();
        System.out.println();

        // Creating an instance of the Patron who would borrow t
        Patron patron = new Patron("Adjei Caleb", "1001");

        Book bookToBorrow = library.findBookByTitle("Rich Dad Poor Dad");
        patron.borrowBook(bookToBorrow);
        System.out.println();

        // Displaying the list of borrowed books
        System.out.println("---------------------");
        System.out.println("   Borrowed Books");
        System.out.println("---------------------");
        patron.listBorrowedBooks();
        System.out.println();

        // Returning the borrowed book
        patron.returnBorrowedBook(bookToBorrow);
        System.out.println();

        // Displaying the list of books in the library after operations
        System.out.println("---------------------");
        System.out.println("Books in the Library After Operations");
        System.out.println("---------------------");
        library.listBooks();
        System.out.println();

        // Displaying the detailed list of books with titles and years
        System.out.println("---------------------");
        System.out.println("   Detailed List of Books");
        System.out.println("---------------------");
        library.listBooksTitlesAndYears();
    }
}
