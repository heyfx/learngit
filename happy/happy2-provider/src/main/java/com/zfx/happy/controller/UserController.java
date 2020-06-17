package com.zfx.happy.controller;

import com.zfx.happy.entity.UserEntity;
import com.zfx.happy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public  List<UserEntity> getAllUser(){
        System.out.println("访问端口号："+ port);
        List<UserEntity> userAr =  userService.getAllUser();
        return userAr;
    }

}
