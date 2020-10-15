package com.lvr.kdshop.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.Date;

/**
 * jwt工具类
 *
 * @author lvr
 * @version 1.0 2020/5/30
 */
@Slf4j
@Data
@Component
public class JwtUtils {

    private String secret = "f4e2e52034348f86b67cde581c0f9eb5"; // 加密秘钥
    private long expire = 30*60*1000; // token有效时长，30分钟
    private String header = "Authorization"; //请求头信息

    /**
     * 生成token
     * @param userId
     * @return
     */
    public String generateToken(long userId) {
        Date nowDate = new Date();
        Date expireDate = new Date(nowDate.getTime() + expire);

        return Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setSubject(userId + "")
                .setIssuedAt(nowDate)
                .setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    /**
     * 获取jwt的信息
     * @param token
     * @return
     */
    public Claims getClaimByToken(String token) {
        try {
            return Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        }catch (Exception e){
            log.debug("validate is token error ", e);
            return null;
        }
    }

    /**
     * token是否过期
     * @param expiration
     * @return true:过期
     */
    public boolean isTokenExpired(Date expiration) {
        return expiration.before(new Date());
    }

}
