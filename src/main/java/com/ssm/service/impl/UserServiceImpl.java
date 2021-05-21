package com.ssm.service.impl;



import com.github.pagehelper.PageHelper;
import com.ssm.dao.UserDao;
import com.ssm.pojo.Reader;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;


    @Override
    public User findUserByaccount(String account) {
        return this.userDao.findUserByaccount(account);
    }

    @Override
    public void addUser(String username, String account, String password) {
        this.userDao.addUser(username,account,password);
    }

    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Override
    public List<Reader> findAllReader(Integer page, Integer size) {
        PageHelper.startPage(page,5);
      return   this.userDao.findAllReader();
    }

    @Override
    public void addReader(Reader reader) {
        this.userDao.addReader(reader);

    }

    @Override
    public Reader findReaderByPhone(int phone) {
        return this.userDao.findReaderByPhone(phone);
    }

    @Override
    public Reader findReaderById(int id) {
        return this.userDao.findReaderById(id);
    }

    @Override
    public void updReader(Reader reader) {
         this.userDao.updReader(reader);
    }

    @Override
    public void delReaderById(int id) {
        this.userDao.delReaderById(id);
    }

    @Override
    public void updInfomation(User user) {
        this.userDao.updInfomation(user);
    }
}
