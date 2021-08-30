package com.ood.library.controller;

import com.ood.library.entities.BookItem;
import com.ood.library.services.IBookService;
import com.ood.library.services.IFineService;
import com.ood.library.services.IUserService;

public class UserController {

    IFineService fineService;
    IBookService bookService;
    IUserService userService;

    public void issueBook(String userName, String bookId) {
       // check if the user has any fine pending
        // see if the CurrentUserState has any booking with fine pending
        // services: FineService (checking in FineTable if anything ispending for user)
        // Repository: FineRepository : userId vs Fine

        if(fineService.isFinePending(userName)){
            System.out.println("As Fine Pending no book issue allwed");
            return;
        }

        // check if book item is available.
        // see if the status of bookItem is AVAILABLE
        // Service : BookService : getAvailableBookItem
        // Repository : BookRepository : bookId vs BookItem table
        BookItem bookItem;
        synchronized (bookId) {
            if (!bookService.isBookItemAvailable(bookId)) {
                System.out.println("As BookItem not available, book can't be issued");
                return;
            }
            bookItem = bookService.getBookItem(bookId);
        }
        // issue the book to user :
        // change the bookItem from AVAILABLE to ISSUED
        // create a new booking for the Reader
        // add that booking into the CurrentUserStatus
        userService.issueBookItem(userName, bookItem);
    }
}
