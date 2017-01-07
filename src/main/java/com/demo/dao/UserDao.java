package com.demo.dao;

import com.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;

/**
 * Created by Administrator on 2017/1/7.
 */
@Mapper
public interface UserDao {
    User findById(Integer id) throws SQLException;

    void insert(User user) throws SQLException;
}
