package com.ssm.dao;


import com.ssm.pojo.Reader;
import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    User findUserByaccount(String account);

    void addUser(@Param("username") String username, @Param("account") String account, @Param("password") String password);

    void updateUser(User user);

    List<Reader> findAllReader();

    void addReader(Reader reader);

    Reader findReaderByPhone(int phone);

    Reader findReaderById(int id);

    void updReader(Reader reader);

    void delReaderById(int id);

    void updInfomation(User user);
}
