package com.ssm.service;


import com.ssm.pojo.Reader;
import com.ssm.pojo.User;

import java.util.List;

public interface UserService {


    User findUserByaccount(String account);

    void addUser(String username, String account, String password);

    void updateUser(User user);

    List<Reader> findAllReader(Integer page, Integer size);

    void addReader(Reader reader);

    Reader findReaderByPhone(int phone);

    Reader findReaderById(int id);

    void updReader(Reader reader);

    void delReaderById(int id);

    void updInfomation(User user);
}
