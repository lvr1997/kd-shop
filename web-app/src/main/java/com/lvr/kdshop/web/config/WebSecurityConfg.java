package com.lvr.kdshop.web.config;

import com.lvr.kdshop.business.service.impl.UserServiceImpl;
import com.lvr.kdshop.web.config.security.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * SpringSecurity安全框架配置
 * @ClassName WebSecurityConfg
 * @Author lan
 * @Date 2022/4/15 10:03
 * @EnableWebSecurity 开启Spring Security的功能
 * @EnableGlobalMethodSecurity prePostEnabled 属性决定Spring Security在接口前注解是否可用  开启权限注解,默认是关闭的
 * @PreAuthorize,@PostAuthorize等注解,设置为true,会拦截加了这些注解的接口
 **/
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfg extends WebSecurityConfigurerAdapter {

    /**未登录*/
    @Autowired
    AuthenticationEnryPoint authenticationEnryPoint;
    /**登录成功*/
    @Autowired
    AuthenticationSuccess authenticationSuccess;
    /**登录失败*/
    @Autowired
    AuthenticationFailure authenticationFailure;
    /**注销*/
    @Autowired
    AuthenticationLogout authenticationLogout;
    /**无权访问*/
    @Autowired
    AccessDeny accessDeny;
    /**检测异地登录*/
    @Autowired
    SessionInformationExpiredStrategy sessionInformationExpiredStrategy;
    /**自定义认证逻辑处理*/
    @Autowired
    SelfAuthenticationProvider selfAuthenticationProvider;

    @Override
    @Bean
    public UserDetailsService userDetailsService() {
        return new UserServiceImpl();
    }

    /**
     * 加密方式
     * @return
     */
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 自定义加密方式
     * @return
     */
    @Bean
    public MyPasswordEncoder myPasswordEncoder(){
        return new MyPasswordEncoder();
    }

    /**
     * 认证
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(selfAuthenticationProvider);
        auth.userDetailsService(userDetailsService()).passwordEncoder(new MyPasswordEncoder());
    }

    /**
     * 授权
     * 配置spring security的控制逻辑
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //cors()解决跨域问题，csrf()会与restful风格冲突，默认springsecurity是开启的，所以要disable()关闭一下
        http.cors().and().csrf().disable();


        //     /index需要权限为ROLE_USER才能访问   /hello需要权限为ROLE_ADMIN才能访问
        http.authorizeRequests()
                .antMatchers("/admin").hasAnyRole("ADMIN","SUPERMANAGER")
                .and()
                .formLogin()  //开启登录
                .permitAll()  //允许所有人访问
                // 登录成功逻辑处理
                .successHandler(authenticationSuccess)
                // 登录失败逻辑处理
                .failureHandler(authenticationFailure)

                .and()
                .logout()   //开启注销
                .permitAll()    //允许所有人访问
                //注销逻辑处理
                .logoutSuccessHandler(authenticationLogout)
                //删除cookie
                .deleteCookies("JSESSIONID")

                .and().exceptionHandling()
                //权限不足的时候的逻辑处理
                .accessDeniedHandler(accessDeny)
                //未登录是的逻辑处理
                .authenticationEntryPoint(authenticationEnryPoint)

                .and()
                .sessionManagement()
                //最多只能一个用户登录一个账号
                .maximumSessions(1)
                //异地登录的逻辑处理
                .expiredSessionStrategy(sessionInformationExpiredStrategy)
        ;
    }

}
