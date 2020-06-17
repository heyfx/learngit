package com.zfx.happy.service;

import com.zfx.happy.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<UserEntity> getAllUser(){
        List<UserEntity> userAr = new ArrayList<UserEntity>();
        for (int i = 1;i<=10;i++){
            UserEntity user = new UserEntity();
            user.setuId(i);
            user.setuName("xiaoming"+i);
            user.setuAddress("guangzhou"+i);
            userAr.add(user);
        }
      return userAr;
    }
}
