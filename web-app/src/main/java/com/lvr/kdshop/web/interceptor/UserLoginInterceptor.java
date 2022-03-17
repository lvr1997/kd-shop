package com.lvr.kdshop.web.interceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.lvr.kdshop.annotation.PassToken;
import com.lvr.kdshop.annotation.UserLoginToken;
import com.lvr.kdshop.business.service.UserService;
import com.lvr.kdshop.constant.Constant;
import com.lvr.kdshop.constant.StatusEnum;
import com.lvr.kdshop.ex.UsernameTakenException;
import com.lvr.kdshop.pojo.User;
import com.lvr.kdshop.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;


/**
 * jwt拦截器
 * @author lvr1997
 */
@Component
public class UserLoginInterceptor implements HandlerInterceptor {

	@Autowired
	UserService userService;

	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) {
		// 从 http 请求头中取出 token
		String token = httpServletRequest.getHeader("user-token");
		// 如果不是映射到方法直接通过
		if(!(object instanceof HandlerMethod)){
			return true;
		}
		HandlerMethod handlerMethod=(HandlerMethod)object;
		Method method=handlerMethod.getMethod();
		//检查是否有passtoken注释，有则跳过认证
		if (method.isAnnotationPresent(PassToken.class)) {
			PassToken passToken = method.getAnnotation(PassToken.class);
			if (passToken.required()) {
				return true;
			}
		}
		//检查有没有需要用户登录的注解
		if(method.isAnnotationPresent(UserLoginToken.class)) {
			UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);
			if (userLoginToken.required()) {
				// 执行认证
				if (token == null) {
					throw new UsernameTakenException(StatusEnum.TOKEN_IS_EXPIRED.getMsg());
				}
				// 获取 token 中的 userId
				String userId;
				try {
					userId = JWT.decode(token).getAudience().get(0);
				} catch (JWTDecodeException j) {
					throw new RuntimeException("401");
				}

				User user = userService.selectByPrimaryKey(userId);
				if (user == null) {
					throw new RuntimeException("用户不存在，请重新登录");
				}

				// 验证 token
				try {
					JwtUtil.checkSign(token);
				} catch (JWTVerificationException e) {
					throw new RuntimeException("401");
				}

				return true;
			}
		}
		return true;
	}

	@Override
	public void postHandle(
			HttpServletRequest request,
			HttpServletResponse response,
			Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
