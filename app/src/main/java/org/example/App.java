package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("Kaya Girl", "Mamale Wolo", 2016));
        library.addBook(new Book("The Son of Umbele", "Michele Obi", 2018));
        library.addBook(new Book("Things Fall Apart", "Chinua Achebe", 1958));
        library.addBook(new Book("Half of a Yellow Sun", "Chimamanda Ngozi Adichie", 2006));
        library.addBook(new Book("Americanah", "Chimamanda Ngozi Adichie", 2013));
        library.addBook(new Book("Titanic: The Long Night", "John P. Eaton", 1999));
        library.addBook(new Book("The Psychology of Money", "Morgan Housel", 2020));
        library.addBook(new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki", 1997));
        library.addBook(new Book("Towards Colonial Freedom: Africa in the Struggle Against World Imperialism", "Kwame Nkrumah", 1969));

        String star = "******************************";

        // Displaying the list of books in the library
        System.out.println(star);
        System.out.println("       Books in the Library");
        System.out.println(star);
        library.booksInStock();
        System.out.println();

        // Creating a patron and borrowing a book
        Patron patron = new Patron("Kwaku Oware", "1001");

        Book bookToBorrow = library.searchBook("Things Fall Apart");
        patron.borrowBook(bookToBorrow, library);
        System.out.println();

        // Displaying the list of borrowed books
        System.out.println(star);
        System.out.println("   Borrowed Books");
        System.out.println(star);
        patron.getBorrowedBooks();
        System.out.println();

        // Returning the borrowed book
        patron.returnBook(bookToBorrow, library);
        System.out.println();

        // Displaying the list of books in the library after operations
        System.out.println(star);
        System.out.println("Books in the Library After Operations");
        System.out.println(star);
        library.booksInStock();
        System.out.println();

        // Displaying the detailed list of books with titles and years
        System.out.println(star);
        System.out.println("   Detailed List of Books");
        System.out.println(star);
        library.listBooksTitlesAndYears();
    }
}
