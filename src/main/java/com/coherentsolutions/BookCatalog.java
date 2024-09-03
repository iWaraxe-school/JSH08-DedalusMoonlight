package com.coherentsolutions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookCatalog {
    // Declare a List to hold Book objects
    private List<Book> books = new ArrayList<>();
    // Implement a constructor

    public BookCatalog() {
    }

    public BookCatalog(List<Book> books) {
        this.books = books;
    }

    // Method for adding a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method for removing a book by title
    public void removeBookByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    public void removeBookByAuthor(String author) {
        books.removeIf(book -> book.getAuthor().equals(author));
    }

    public void removeBookByYearOfPublication(int y) {
        books.removeIf(book -> book.getYearOfPublication() == y);
    }

    // Method for finding books by author
    public List<Book> findBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .toList();
    }

    public List<Book> findBooksByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .toList();
    }

    public List<Book> findBooksByYearOfPublication(int y) {
        return books.stream()
                .filter(book -> book.getYearOfPublication() == y)
                .toList();
    }

    // Method for sorting books by title
    public void sortBooksByTitle() {
        books.sort(Comparator.comparing(Book::getTitle));
    }

    public void sortBooksByAuthor() {
        books.sort(Comparator.comparing(Book::getAuthor));
    }

    public void sortBooksByYearOfPublication() {
        books.sort(Comparator.comparing(Book::getYearOfPublication));
    }

    // Bonus Method 1: Calculate the average rating for books by a particular author
    public double averageRatingByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .mapToInt(Book::getRating)
                .average()
                .orElse(0);
    }

    // Bonus Method 2: Flatten a list of all tags across all books
    public List<String> allTags() {
        return books.stream()
                .map(Book::getTitle)
                .collect(Collectors.toSet())
                .stream()
                .toList();
    }

    // Getter method to return the List of books
    public List<Book> getBooks() {
        return books;
    }
}
