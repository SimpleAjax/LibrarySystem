package com.ood.library.services;

public interface IAuthorizationService {
    void login(String username, String password) ;
    void signUp(String username, String password);
}
