package com.ood.library.services.impl;


import com.ood.library.entities.BookItem;
import com.ood.library.entities.BookItemStatus;
import com.ood.library.repositories.IBookRepository;
import com.ood.library.services.IBookService;

import java.util.List;

public class BookService implements IBookService {

    IBookRepository bookRepository;

    @Override
    public boolean isBookItemAvailable(String bookId) {
        List<BookItem> bookItemList = bookRepository.getBookItemsForBook(bookId);
        for(BookItem bookItem : bookItemList) {
            if(bookItem.getBookItemStatus().equals(BookItemStatus.AVAILABLE)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public BookItem getBookItem(String bookId) {
        List<BookItem> bookItemList = bookRepository.getBookItemsForBook(bookId);
        for(BookItem bookItem : bookItemList) {
            if(bookItem.getBookItemStatus().equals(BookItemStatus.AVAILABLE)) {
                return bookItem;
            }
        }
        return null;
    }
}
