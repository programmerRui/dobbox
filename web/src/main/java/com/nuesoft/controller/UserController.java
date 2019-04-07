package com.nuesoft.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.nuesoft.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping("add.do")
    @ResponseBody
    public String addUser(){
        int rows = userService.insertUser("西门吹雪");
        return "添加了"+rows+"条数据";
    }
}
