package com.zfx.demo.service;

import com.zfx.demo.entity.DemoEntity;
import org.springframework.stereotype.Service;

@Service
public class DemoProvider1Service implements  DemoService{

    @Override
    public Object getDemo() {
        DemoEntity demo = new DemoEntity();
        demo.setDemoId(1);
        demo.setDemoName("demo1");
        return demo;
    }

    @Override
    public Object addDemo() {
        return null;
    }

    @Override
    public Object update() {
        return null;
    }

    @Override
    public Object selectOneDemo() {
        return null;
    }

    @Override
    public Object delDemo() {
        return null;
    }
}
