package com.lvr.kdshop.web.config.security;

import com.lvr.kdshop.business.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * 自定义认证逻辑处理
 * @ClassName SelfAuthenticationProvider
 * @Author lan
 * @Date 2022/4/15 14:48
 **/
@Component
public class SelfAuthenticationProvider  implements AuthenticationProvider {

    @Autowired
    UserServiceImpl userServiceImpl;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        //获取用户名
        String account= authentication.getName();
        //获取密码
        String password= (String) authentication.getCredentials();
        UserDetails userDetails= userServiceImpl.loadUserByUsername(account);
        System.out.println(userDetails.getAuthorities());
        boolean checkPassword= bCryptPasswordEncoder.matches(password,userDetails.getPassword());
        if(!checkPassword){
            throw new BadCredentialsException("密码不正确，请重新登录!");
        }
        return new UsernamePasswordAuthenticationToken(account,password,userDetails.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }

}
