package com.coherentsolutions;

public class Book {
    // Declare fields for title, author, yearOfPublication, and rating (for bonus task)
    private String title;
    private String author;
    private int yearOfPublication;
    private int rating;
    // Implement a constructor

    public Book(String title, String author, int yearOfPublication, int rating) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.rating = rating;
    }

    // Implement getter methods

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getRating() {
        return rating;
    }

// Implement a toString method

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year of publication=" + yearOfPublication +
                '}';
    }
}
