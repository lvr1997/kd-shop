package com.lvr.kdshop.web.config.security;

import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lvr.kdshop.pojo.SysUser;
import com.lvr.kdshop.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 处理登录验证成功的类
 * @ClassName FuryAuthSuccessHandler
 * @Author lan
 * @Date 2022/4/15 11:31
 **/
@Component
public class AuthenticationSuccess implements AuthenticationSuccessHandler {

    /**Json转化工具*/
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        //登录成功时返回给前端的数据
        Msg result=Msg.success("登录成功！！！！！");
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(JSONUtil.toJsonStr(result));
    }


}
