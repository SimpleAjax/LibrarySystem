package com.ood.library.entities;

import java.time.LocalDateTime;

public class Account {

    String userName;
    String password;
    LocalDateTime createTime;

    public Account(String userName, String passwrod, LocalDateTime createTime) {
        this.userName = userName;
        this.password = passwrod;
        this.createTime = createTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

}
