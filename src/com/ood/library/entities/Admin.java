package com.ood.library.entities;

public class Admin {
    Account account;

    public Admin(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
