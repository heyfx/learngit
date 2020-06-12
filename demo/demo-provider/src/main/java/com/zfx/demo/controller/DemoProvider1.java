package com.zfx.demo.controller;


import com.zfx.demo.service.DemoProvider1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoProvider1 {//服务提供接口

    @Autowired
    private DemoProvider1Service demoProvider1Service;

    @GetMapping("/getDemoProvider1Test")
    public Object getDemoProvider1Test(){
        Object demo =  demoProvider1Service.getDemo();
        return demo;
    }

}
