package com.zfx.happy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                // 扫描路径
                .apis(RequestHandlerSelectors.basePackage("com.zfx.happy.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        // 标题
                        .title("Swagger项目管理")
                        // 描述
                        .description("Swagger项目管理接口测试文档")
                        // 版本号
                        .version("1.0.0")
                        // 联系人信息
                        .contact(new Contact("zfx","http://127.0.0.1:8080/swagger-ui.html","248399578@qq.com"))
                // 使用协议
                .license("The Apache License")
                .licenseUrl("https://swagger.io/")
                .build());
    }
}
