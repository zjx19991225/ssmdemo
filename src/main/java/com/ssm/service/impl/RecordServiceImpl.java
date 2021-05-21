package com.ssm.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.dao.RecordDao;
import com.ssm.pojo.Book;
import com.ssm.pojo.Record;
import com.ssm.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
@Transactional
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordDao recordDao;


    @Override
    public List<Record> findAllRecord(int page, int size) {
        PageHelper.startPage(page,size);
        return this.recordDao.findAllRecord();
    }

    @Override
    public List<Record> findByReader(String keyword) {
        PageHelper.startPage(1,5);
        return this.recordDao.findByReader(keyword);
    }

    @Override
    public List<Book> findByBook(String keyword) {
        PageHelper.startPage(1,5);
        return this.recordDao.findByBook(keyword);
    }
}

