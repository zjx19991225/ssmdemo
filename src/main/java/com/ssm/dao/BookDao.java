package com.ssm.dao;


import com.ssm.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    List<Book> findAllBook();

    Book findBookByName(@Param("bookName") String bookname);

    void addBook( Book book);

    void delBook(int id);

    Book findBookById(int id);

    void updBook(Book book);
}
