package com.zfx.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/getTest")
    public Object getTest(){
        return "test";
    }
}
