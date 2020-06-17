package com.zfx.happy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Happy2ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Happy2ProviderApplication.class, args);
    }

}
