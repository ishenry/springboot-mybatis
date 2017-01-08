package com.demo.controller;


import com.demo.model.User;
import com.demo.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * Created by Administrator on 2017/1/7.
 */
@RestController
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id") int id){
        User user =null;
        try {
            user = userService.findById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(user == null) {
            logger.info("user is null");
        }else{
            logger.info(user.toString());
        }
        return user;
    }

    @RequestMapping("/user/insert/{name}")
    public void insertUser(@PathVariable("name") String name) {
        logger.info(name);
        User user = new User(name);
        try {
            userService.insert(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
