package com.ood.library.repositories.impl;

import com.ood.library.entities.Librarian;
import com.ood.library.entities.Reader;
import com.ood.library.repositories.IUserRepository;

import java.util.HashMap;
import java.util.Map;

public class UserRepository implements IUserRepository {

    Map<String, Librarian> librarianMap;
    Map<String , Reader> readerMap;

    public UserRepository() {
        this.librarianMap = new HashMap<>();
        this.readerMap = new HashMap<>();
    }

    @Override
    public Librarian getLibrarianByUserName(String username) {
        return librarianMap.get(username);
    }

    @Override
    public Reader getReaderByUserName(String username) {
        return readerMap.get(username);
    }

    @Override
    public void upsertLibrarian(Librarian librarian) {
        librarianMap.put(librarian.getAccount().getUserName(), librarian);
    }

    @Override
    public void upsertReader(Reader reader) {
        readerMap.put(reader.getAccount().getUserName(), reader);
    }

}
