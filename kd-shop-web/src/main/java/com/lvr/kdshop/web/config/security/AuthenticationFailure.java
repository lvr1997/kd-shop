package com.lvr.kdshop.web.config.security;

import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lvr.kdshop.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * 处理登录验证失败的类
 * @ClassName FuryAuthFailureHandler
 * @Author lan
 * @Date 2022/4/15 11:37
 **/
@Component
public class AuthenticationFailure implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        Msg msg=null;
        if(e instanceof UsernameNotFoundException){
            msg=Msg.fail(e.getMessage());
        }else if(e instanceof BadCredentialsException){
            msg=Msg.fail("密码错误!!");
        }else {
            msg=Msg.fail(e.getMessage());
        }
        //处理编码方式，防止中文乱码的情况
        response.setContentType("text/json;charset=utf-8");
        //返回给前台
        response.getWriter().write(JSONUtil.toJsonStr(msg));
    }
}
