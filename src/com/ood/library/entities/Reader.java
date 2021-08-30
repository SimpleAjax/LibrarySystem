package com.ood.library.entities;

public class Reader {
    Account account;
    boolean isBlocked;
    CurrentUserStatus userStatus;

    public Reader(Account account) {
        this.account = account;
        isBlocked = false;
        userStatus = new CurrentUserStatus();
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public CurrentUserStatus getCurrentUserStatus() {
        return userStatus;
    }
}
