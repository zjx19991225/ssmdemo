package com.ssm.pojo;



import java.util.List;


public class Reader {


    private int readerId;

    private String username;

    private String password;

    private int phone;

    private int booknumber;

    private List<Book> books;

    public Reader(int readerId, String username, String password, int phone, int booknumber,List<Book>books) {
        this.readerId = readerId;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.booknumber = booknumber;
        this.books=books;
    }

    public Reader() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getBooknumber() {
        return booknumber;
    }

    public void setBooknumber(int booknumber) {
        this.booknumber = booknumber;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }



    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", booknumber=" + booknumber +
                '}';
    }
}
