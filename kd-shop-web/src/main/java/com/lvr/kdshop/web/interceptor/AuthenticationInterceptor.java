package com.lvr.kdshop.web.interceptor;

import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;
import com.lvr.kdshop.business.service.UserService;
import com.lvr.kdshop.constant.Constant;
import com.lvr.kdshop.constant.StatusEnum;
import com.lvr.kdshop.ex.UsernameTakenException;
import io.jsonwebtoken.Claims;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationInterceptor implements HandlerInterceptor {

    @Autowired
    UserService userService;

    /**
     * 登录拦截方法
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String token = request.getHeader(Constant.TOKEN); //从请求头中获取token
        //先获取session，看看有没有用户相关的session
        String adminToken = (String) request.getSession().getAttribute(Constant.TOKEN);

        // 如果不是映射到方法直接通过
        if(!(handler instanceof HandlerMethod)){
            return true;
        }
        //如果是方法探测，直接通过
        if (HttpMethod.OPTIONS.equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }

        if(StringUtils.isEmpty(adminToken)) {
            throw new UsernameTakenException(StatusEnum.UNAUTHORIZED.getMsg());
        }

        //验证，并获取token内部信息
        JWT claims = JWTUtil.parseToken(adminToken);
//        String userInfo = claims.get

//        if(username != null){
//            return true;
//        }else{
//            request.setAttribute("msg","未登录！");
////            response.sendRedirect("/index.html");
//            request.getRequestDispatcher("/index.html").forward(request,response);
//            return false;
//        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
