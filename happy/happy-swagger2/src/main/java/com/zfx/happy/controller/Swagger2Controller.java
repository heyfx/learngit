package com.zfx.happy.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/swagger2")
@Api(tags = "swagger2测试接口")
public class Swagger2Controller {

    @RequestMapping("/getSwagger2")
    @ResponseBody
    @ApiOperation("第一个测试swagger2的接口")
    public Object getSwagger2(){
        return "第一个测试swagger2的接口";
    }


    @RequestMapping("/getSwagger2Info")
    @ResponseBody
    @ApiOperation("第二个测试swagger2的接口，带参数")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四"),
            @ApiImplicitParam(name = "address", value = "用户地址", defaultValue = "深圳", required = true)
    }
    )
    public Object getSwagger2Info(String username, @RequestParam(required = true) String address){
        return "第二个测试swagger2的接口";
    }


}
