package com.ood.library.repositories.impl;

import com.ood.library.entities.Author;
import com.ood.library.entities.Book;
import com.ood.library.entities.BookItem;
import com.ood.library.repositories.IBookRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements IBookRepository {

    Map<String, Book> bookIdMap;
    Map<Author, List<Book>> authorMap;
    Map<String, List<BookItem>> bookItemMap;

    public BookRepository() {
        bookIdMap = new HashMap<>();
        authorMap = new HashMap<>();
        bookIdMap = new HashMap<>();
    }

    @Override
    public Book searchBookById(String bookId) {
        return bookIdMap.get(bookId);
    }

    @Override
    public List<Book> searchBookByAuthor(Author author) {
        return authorMap.get(author);
    }

    @Override
    public List<BookItem> getBookItemsForBook(String bookId) {
        return bookItemMap.get(bookId);
    }


}
