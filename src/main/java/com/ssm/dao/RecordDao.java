package com.ssm.dao;

import com.ssm.pojo.Book;
import com.ssm.pojo.Record;

import java.util.List;

public interface RecordDao {

    List<Record> findAllRecord();

    List<Record> findByReader(String keyword);

    List<Book> findByBook(String keyword);
}
