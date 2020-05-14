package com.lvr.kdshop.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.lvr.kdshop.entity.User;

import java.util.Date;

/**
 * token工具类
 * @author lvr
 * @version 1.0 2020/5/14
 */
public class TokenUtil {

    private static final long EXPIRE_TIME= 30*60*1000;//token到期时间30分钟
    private static final String TOKEN_SECRET="ljdyaishijin**3nkjnj??";  //密钥盐

    /**
     * 生成token
     * @param user
     * @return
     */
    public static String sign(User user) {
        String token = null;
        try {
            Date expireAt=new Date(System.currentTimeMillis()+EXPIRE_TIME);
            token = JWT.create()
                    .withIssuer("auth0")//发行人
                    .withClaim("username",user.getUsername())//存放数据
                    .withExpiresAt(expireAt)//过期时间
                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
        } catch (IllegalArgumentException | JWTCreationException je) {

        }
        return token;
    }

    /**
     * 验证token
     * @param token
     * @return
     */
    public static Boolean verify(String token){

        try {
            JWTVerifier jwtVerifier=JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("auth0").build();//创建token验证器
            DecodedJWT decodedJWT=jwtVerifier.verify(token);
            System.out.println("认证通过：");
            System.out.println("username: " + decodedJWT.getClaim("username").asString());
            System.out.println("过期时间：      " + decodedJWT.getExpiresAt());
        } catch (IllegalArgumentException | JWTVerificationException e) {
            //抛出错误即为验证不通过
            return false;
        }
        return true;
    }

}
