package com.lvr.kdshop.web.config.security;

import cn.hutool.json.JSONUtil;
import com.lvr.kdshop.util.Msg;
import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义异地登录、账号下线时的逻辑处理
 * @ClassName SessionInformationExpiredStrategy
 * @Author lan
 * @Date 2022/4/15 14:48
 **/
@Component
public class SessionInformationExpiredStrategy  implements org.springframework.security.web.session.SessionInformationExpiredStrategy {
    @Override
    public void onExpiredSessionDetected(SessionInformationExpiredEvent event) throws IOException, ServletException {
        Msg result= Msg.fail("您的账号在异地登录，建议修改密码");
        HttpServletResponse response=event.getResponse();
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(JSONUtil.toJsonStr(result));
    }
}
