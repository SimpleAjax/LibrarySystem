package com.ood.library.repositories.impl;

import com.ood.library.repositories.IAccountRepository;

import java.util.Map;

public class AccountRepository implements IAccountRepository {
    Map<String, String> userVsPass;

    @Override
    public void addUser(String username, String password) {
        userVsPass.put(username, password);
    }

    @Override
    public boolean verifyUser(String username, String password) {
        if(password==null || !userVsPass.containsKey(username)) return false;
        return password.equals(userVsPass.get(username));
    }

}

