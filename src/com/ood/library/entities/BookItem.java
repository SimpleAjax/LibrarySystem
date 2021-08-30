package com.ood.library.entities;

import java.util.Date;

public class BookItem extends Book{
    BookItemStatus bookItemStatus;
    public BookItem(String bookName, Author author, Date releaseDate, String bookNumber) {
        super(bookName, author, releaseDate, bookNumber);
        bookItemStatus = BookItemStatus.AVAILABLE;
    }

    public BookItemStatus getBookItemStatus() {
        return bookItemStatus;
    }

    public void setBookItemStatus(BookItemStatus bookItemStatus) {
        this.bookItemStatus = bookItemStatus;
    }
}
