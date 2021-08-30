package com.ood.library.repositories;

import com.ood.library.entities.Librarian;
import com.ood.library.entities.Reader;

public interface IUserRepository {
    Librarian getLibrarianByUserName(String username);
    Reader getReaderByUserName(String username);
    void upsertLibrarian(Librarian librarian);
    void upsertReader(Reader reader);
}
