package com.example.demo.model;

/**
 * 登陆账号类模型
 */
public class Account {
    private String account;
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
