package com.ood.library.entities;

import java.util.Date;

public class Book {
    String bookName;
    Author author;
    Date releaseDate;
    String bookNumber;

    public Book(String bookName, Author author, Date releaseDate, String bookNumber) {
        this.bookName = bookName;
        this.author = author;
        this.releaseDate = releaseDate;
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", releaseDate=" + releaseDate +
                ", bookNumber='" + bookNumber + '\'' +
                '}';
    }
}
