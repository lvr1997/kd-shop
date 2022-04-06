package com.lvr.kdshop.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.lvr.kdshop.web.config","com.lvr.kdshop.web.interceptor",
                                "com.lvr.kdshop.business.service", "com.lvr.kdshop.web.controller",
                                "com.lvr.kdshop.web.utils"})
@MapperScan("com.lvr.kdshop.business.mapper")
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
