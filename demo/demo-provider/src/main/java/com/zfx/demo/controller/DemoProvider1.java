package com.zfx.demo.controller;


import com.zfx.demo.service.DemoProvider1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoProvider1 {

    @Autowired
    private DemoProvider1Service demoProvider1Service;

    @GetMapping("/getDemoProvider1Test")
    public String getDemoProvider1Test(Integer id){

        return "";

    }

}
