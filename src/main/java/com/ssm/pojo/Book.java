package com.ssm.pojo;

import java.util.List;

public class Book {
    private int bookId;
    private String bookName;
    private int number;
    private int price;
    private String author;
    private List<Reader> readers;

    public Book(int bookId, String bookName, int number, int price,String author ,List<Reader>readers) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.number = number;
        this.price = price;
        this.author=author;
        this.readers=readers;

    }

    public List<Reader> getBooks() {
        return readers;
    }

    public void setBooks(List<Reader> readers) {
        this.readers = readers;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", number=" + number +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", readers=" + readers +
                '}';
    }
}
