package com.zfx.demo.service;

import com.zfx.demo.entity.DemoEntity;
import org.springframework.stereotype.Service;

@Service
public class DemoConsumer1Service implements  DemoService{

    @Override
    public Object getDemo() {
        DemoEntity demo = new DemoEntity();
        demo.setDemoId(1);
        demo.setDemoName("demo1");
        return demo;
    }
}
