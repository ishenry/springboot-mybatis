package com.demo.service;

import com.demo.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/1/7.
 */
public interface IUserService {

    User findById(Integer id) throws SQLException;

    void insert(User user) throws SQLException;

    void insertList(List<User> userList) throws SQLException;
}
