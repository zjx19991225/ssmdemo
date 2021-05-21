package com.ssm.service;

import com.ssm.pojo.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllBook(int page, int size);

    Book findBookByName(String bookname);

    void addBook(Book book);

    void delBook(int id);

    Book findBookById(int id);

    void updBook(Book book);
}
