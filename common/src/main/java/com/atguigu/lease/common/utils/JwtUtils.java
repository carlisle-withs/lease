package com.atguigu.lease.common.utils;

import com.atguigu.lease.common.exception.LeaseException;
import com.atguigu.lease.common.result.ResultCodeEnum;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.Date;

/**
 * Author: Carlisle Cullen
 * Date: 2025/2/20 下午5:01
 * projectName: com.atguigu.lease.common.utils
 * description: 关于Java中的Token令牌类，用于登录方面
 */
public class JwtUtils {

    private static final SecretKey secretKey = Keys.hmacShaKeyFor("abcdef2342x45df4342342x3423424t5g".getBytes());

    // 创造token的方法
    public static String createToken(Long userId, String username) {

        return Jwts.builder()
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .setSubject("LOGIN_USER")
                .claim("userId", userId)
                .claim("username", username)
                .signWith(secretKey, SignatureAlgorithm.HS256)
                .compact();
    }

    public static Claims parseToken(String token) {
        if (token == null) {
            throw new LeaseException(ResultCodeEnum.ADMIN_LOGIN_AUTH);
        }
        try {
            JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(secretKey).build();
            Jws<Claims> claimsJws = jwtParser.parseClaimsJws(token);
            return claimsJws.getBody();
        } catch (ExpiredJwtException e) { // 捕获Token过期的异常
            throw new LeaseException(ResultCodeEnum.TOKEN_EXPIRED);
        } catch (JwtException e) { // 捕获Token不合法的异常
            throw new LeaseException(ResultCodeEnum.TOKEN_INVALID);
        }
    }

}
