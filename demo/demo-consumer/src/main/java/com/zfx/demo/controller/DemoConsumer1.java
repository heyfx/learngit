package com.zfx.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoConsumer1 {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getDemoConsumer1Test")
    public Object getDemoConsumer1Test(){
       return restTemplate.getForObject("http://demo-provider/getDemoProvider1Test", String.class);
    }
}
