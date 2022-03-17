package com.lvr.kdshop.web.config;

import com.lvr.kdshop.web.interceptor.UserLoginInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class KdShopWebConfig implements WebMvcConfigurer {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${imagesPath}")
    private String mImagesPath;

    /**
     * 添加jwt拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        logger.info("=========================进入拦截器============================");
        registry.addInterceptor(jwtInterceptor())
                // 拦截所有请求，通过判断是否有 @UserLoginToken 注解 决定是否需要登录
                .addPathPatterns("/**");
    }

    /**
     * jwt拦截器
     * @return
     */
    @Bean
    public UserLoginInterceptor jwtInterceptor() {
        return new UserLoginInterceptor();
    }

}
