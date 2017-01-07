package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.model.User;
import com.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/1/7.
 */
@Service  //需要加上这个标签，这样main的ComponentScan才能扫描到对应的实现
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Integer id) throws SQLException {
        return userDao.findById(id);
    }

    @Override
    public void insert(User user) throws SQLException {
        userDao.insert(user);
    }

    /**
     * 测试事务
     * @param userList
     * @throws SQLException
     */
    @Transactional
    public void insertList(List<User> userList) throws SQLException {
        insert(userList.get(0));
        int i = 1/0;
        insert(userList.get(1));
    }
}
