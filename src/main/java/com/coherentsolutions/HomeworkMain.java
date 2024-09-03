package com.coherentsolutions;

public class HomeworkMain {
    public static void main(String[] args) {
        // Create a new book catalog
        BookCatalog catalog = new BookCatalog();

        // Add some books to the catalog
        catalog.addBook(new Book("Narnia", "Alex", 1999, 87));
        catalog.addBook(new Book("London", "Harry", 1896, 46));
        catalog.addBook(new Book("Hogwarts", "Rowling", 2003, 90));
        catalog.addBook(new Book("Archmage", "Rudazov", 2010, 96));
        catalog.addBook(new Book("Spider man", "Marvel", 2000, 81));
        catalog.addBook(new Book("Narnia2", "Alex", 2001, 71));

        // Sort books by title
        catalog.sortBooksByTitle();

        // Display sorted books
        System.out.println(catalog.getBooks());

        // Find books by author
        System.out.println(catalog.findBooksByAuthor("Alex"));

        // Remove a book by title
        catalog.removeBookByTitle("London");

        // Display remaining books
        System.out.println(catalog.getBooks());

        // Bonus: Calculate the average rating for books by a particular author
        System.out.println(catalog.averageRatingByAuthor("Alex"));

        // Bonus: Get a list of all tags across all books
        System.out.println(catalog.allTags());
    }
}

