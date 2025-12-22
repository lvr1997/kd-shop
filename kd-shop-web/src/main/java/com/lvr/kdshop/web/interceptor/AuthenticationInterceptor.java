package com.lvr.kdshop.web.interceptor;

import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;
import com.lvr.kdshop.business.service.UserService;
import com.lvr.kdshop.constant.Constant;
import com.lvr.kdshop.constant.StatusEnum;
import com.lvr.kdshop.ex.UsernameTakenException;
import com.lvr.kdshop.pojo.SysUser;
import com.lvr.kdshop.util.UserContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Slf4j
@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Autowired
    @Lazy
    UserService userService;

    /**
     * 登录拦截方法
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String token = request.getHeader(Constant.TOKEN); //从请求头中获取token
        String token = (String) request.getSession().getAttribute(Constant.TOKEN);

        // 如果不是映射到方法直接通过
        if(!(handler instanceof HandlerMethod)){
            return true;
        }

        if(StringUtils.isEmpty(token)) {
            log.error(StatusEnum.TOKEN_IS_EXPIRED.getMsg());
            return false;
        }

        //验证，并获取token内部信息
        boolean result = JWTUtil.verify(token, Constant.LOGIN_USER_KEY.getBytes());
        if(!result) {
            log.error("token 验证失败！token is {}, uri is {}", token, request.getRequestURI());
            return false;
        }

        JWT jwt = JWTUtil.parseToken(token);
        String userId = (String) jwt.getPayload("userId");

        if(userId == null || userId == "") {
            log.info("token错误");
            return false;
        }

        UserContext.setCurrentId(userId);
        log.info("token校验成功！！！");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
