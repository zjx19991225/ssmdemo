package com.ssm.pojo;


public class User {
    private  int userid;
    private String user;
    private int account;
    private String password;

    public User() {
    }

    public User(int id, String user, int account, String password) {
        this.userid = id;
        this.user = user;
        this.account = account;
        this.password = password;
    }

    public int getId() {
        return userid;
    }

    public void setId(int id) {
        this.userid = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
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
        return "User{" +
                "id=" + userid +
                ", user='" + user + '\'' +
                ", account=" + account +
                ", password='" + password + '\'' +
                '}';
    }
}
