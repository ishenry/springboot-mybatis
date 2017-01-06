package com.henry.controller;

import org.apache.log4j.Logger;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by Administrator on 2017/1/6 0006.
 */

@RestController
@EnableAutoConfiguration
public class IndexController {
    private static Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(){
        return "Hello World";
    }
}
