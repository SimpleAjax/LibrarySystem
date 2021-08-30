package com.ood.library.services;

import com.ood.library.entities.BookItem;
import com.ood.library.entities.Librarian;
import com.ood.library.entities.Reader;

public interface IUserService {
    void blockUser(String username);
    void addLibrarian(Librarian librarian);
    void removeLibrarian(Librarian librarian);
    void unblockUser(String username);
    Reader getReader(String userName);

    void issueBookItem(String userName, BookItem bookItem);
}
