package com.zfx.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope//这个注解很重要（可以实时获取，不过接口总是刷新 需要找更好的方法）
public class NacosConfig {//获取nacos配置数据

    @Value("${demo.name}")
    private String demoName;

    @RequestMapping("/getConfig")
    public String getConfig(){
        return demoName;
    }

}
