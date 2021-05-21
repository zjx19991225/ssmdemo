package com.ssm.service;

import com.ssm.pojo.Book;
import com.ssm.pojo.Record;

import java.util.List;

public interface RecordService {
    List<Record> findAllRecord(int page, int size);

    List<Record> findByReader(String keyword);

    List<Book> findByBook(String keyword);
}
