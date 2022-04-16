package com.lvr.kdshop.web.config.security;

import cn.hutool.json.JSONUtil;
import com.lvr.kdshop.util.Msg;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 未登录时返回给前端数据
 * @ClassName AuthenticationEnryPoint
 * @Author lan
 * @Date 2022/4/15 14:30
 **/
@Component
public class AuthenticationEnryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        Msg result=Msg.fail("需要登录!!");
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(JSONUtil.toJsonStr(result));
    }
}
