package com.ood.library.services;

import com.ood.library.entities.BookItem;

public interface IBookService {

    boolean isBookItemAvailable(String bookId);

    BookItem getBookItem(String bookId);
}
