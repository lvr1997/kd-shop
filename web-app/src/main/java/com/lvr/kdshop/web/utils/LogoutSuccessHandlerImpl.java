package com.lvr.kdshop.web.utils;

import com.alibaba.fastjson.JSON;
import com.lvr.kdshop.constant.StatusEnum;
import com.lvr.kdshop.util.JSONResult;
import com.lvr.kdshop.util.StringUtils;
import com.lvr.kdshop.web.domain.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
public class LogoutSuccessHandlerImpl implements LogoutSuccessHandler {

    @Autowired
    private TokenUtil tokenUtil;

    /**
     * 退出处理
     *
     * @return
     */
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException
    {
        LoginUser loginUser = tokenUtil.getLoginUser(request);
        if (StringUtils.isNotNull(loginUser))
        {
            String userName = loginUser.getUsername();
            // 删除用户缓存记录
            tokenUtil.delLoginUser(loginUser.getToken());
            // 记录用户退出日志
//            AsyncManager.me().execute(AsyncFactory.recordLogininfor(userName, Constant.LOGOUT, "退出成功"));
        }
        ServletUtils.renderString(response, JSON.toJSONString(JSONResult.fail(StatusEnum.SUCCESS.getCode(), "退出成功")));
    }
}
