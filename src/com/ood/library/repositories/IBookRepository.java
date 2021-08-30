package com.ood.library.repositories;

import com.ood.library.entities.Author;
import com.ood.library.entities.Book;
import com.ood.library.entities.BookItem;

import java.util.List;

public interface IBookRepository {
    Book searchBookById(String bookId);
    List<Book> searchBookByAuthor(Author author);
    List<BookItem> getBookItemsForBook(String bookId);
}
