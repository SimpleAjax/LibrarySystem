package com.ood.library.entities;

import java.util.ArrayList;
import java.util.List;

public class CurrentUserStatus {
    List<BookItem> issuedBooks;

    public CurrentUserStatus() {
        this.issuedBooks = new ArrayList<>();
    }

    public List<BookItem> getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(List<BookItem> issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    public void addIssuedBook(BookItem bookItem) {
        issuedBooks.add(bookItem);
    }
}


