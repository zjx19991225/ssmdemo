package com.ssm.service.impl;


import com.github.pagehelper.PageHelper;
import com.ssm.dao.BookDao;
import com.ssm.pojo.Book;
import com.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> findAllBook(int page, int size) {
        PageHelper.startPage(page,size);
        return this.bookDao.findAllBook();
    }

    @Override
    public Book findBookByName(String bookname) {
        return this.bookDao.findBookByName(bookname);
    }

    @Override
    public void addBook(Book book) {
        this.bookDao.addBook(book);
    }

    @Override
    public void delBook(int id) {
        this.bookDao.delBook(id);
    }

    @Override
    public Book findBookById(int id) {
        return this.bookDao.findBookById(id);
    }

    @Override
    public void updBook(Book book) {
        this.bookDao.updBook(book);

    }
}
