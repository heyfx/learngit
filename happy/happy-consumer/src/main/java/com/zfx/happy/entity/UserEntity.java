package com.zfx.happy.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;


@Component
public class UserEntity implements Serializable {

    private int uId;
    private String uName;
    private String uAddress;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uAddress='" + uAddress + '\'' +
                '}';
    }
}
