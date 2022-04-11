package com.lvr.kdshop.web.security;

import com.alibaba.fastjson.JSON;
import com.lvr.kdshop.constant.StatusEnum;
import com.lvr.kdshop.util.JSONResult;
import com.lvr.kdshop.util.StringUtils;
import com.lvr.kdshop.web.utils.ServletUtils;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 * 认证失败处理类 返回未授权
 *
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = -8970718410437077606L;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e)
            throws IOException
    {
        int code = StatusEnum.UNAUTHORIZED.getCode();
        String msg = "请求访问：" + request.getRequestURI() +"，认证失败，无法访问系统资源";
        ServletUtils.renderString(response, JSON.toJSONString(JSONResult.fail(code, msg)));
    }

}
