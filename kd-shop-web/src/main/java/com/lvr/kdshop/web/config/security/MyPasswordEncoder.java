package com.lvr.kdshop.web.config.security;

import com.lvr.kdshop.util.MD5;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 自定义加密验证
 * @ClassName MyPasswordEncoder
 * @Author lan
 * @Date 2022/4/15 16:52
 **/
public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return MD5.md5(charSequence.toString());
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return MD5.md5(charSequence.toString()).equals(s);
    }
}
