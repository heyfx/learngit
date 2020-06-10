package com.zfx.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

    @GetMapping("/getTest1")
    public Object getTest(){
        return "test1";
    }
}
