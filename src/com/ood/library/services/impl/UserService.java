package com.ood.library.services.impl;

import com.ood.library.entities.BookItem;
import com.ood.library.entities.Librarian;
import com.ood.library.entities.Reader;
import com.ood.library.repositories.IUserRepository;
import com.ood.library.repositories.impl.UserRepository;
import com.ood.library.services.IUserService;

public class UserService implements IUserService {

    IUserRepository userRepository = new UserRepository();

    @Override
    public void blockUser(String username) {

    }

    @Override
    public void addLibrarian(Librarian librarian) {

    }

    @Override
    public void removeLibrarian(Librarian librarian) {

    }

    @Override
    public void unblockUser(String username) {

    }

    public Reader getReader(String userName) {
        return userRepository.getReaderByUserName(userName);
    }

    @Override
    public void issueBookItem(String userName, BookItem bookItem) {
        Reader reader = getReader(userName);
        reader.getCurrentUserStatus().addIssuedBook(bookItem);
    }
}
