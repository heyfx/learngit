package com.zfx.happy.service;

import com.zfx.happy.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "happy-provider")
public interface  UserService {
    @GetMapping("/user/getAllUser")
    List<UserEntity> getAllUser();
}
