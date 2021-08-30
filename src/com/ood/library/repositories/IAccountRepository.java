package com.ood.library.repositories;

public interface IAccountRepository {
    void addUser(String username, String password);
    boolean verifyUser(String username, String password);
}
