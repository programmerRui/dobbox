package com.nuesoft.service.iml;

import com.alibaba.dubbo.config.annotation.Service;
import com.nuesoft.service.UserService;

@Service
public class UserServiceIml implements UserService {
    @Override
    public int insertUser(String name) {
        System.out.println(name+"用户添加成功！");
        return 1;
    }
}
