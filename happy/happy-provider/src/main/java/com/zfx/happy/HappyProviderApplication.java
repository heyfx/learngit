package com.zfx.happy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HappyProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HappyProviderApplication.class, args);
    }

}
