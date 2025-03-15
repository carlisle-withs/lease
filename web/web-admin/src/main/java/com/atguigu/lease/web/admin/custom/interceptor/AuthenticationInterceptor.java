package com.atguigu.lease.web.admin.custom.interceptor;

import com.atguigu.lease.common.exception.LeaseException;
import com.atguigu.lease.common.login.LoginUser;
import com.atguigu.lease.common.login.LoginUserHolder;
import com.atguigu.lease.common.result.ResultCodeEnum;
import com.atguigu.lease.common.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * Author: Carlisle Cullen
 * Date: 2025/2/20 下午10:43
 * projectName: com.atguigu.lease.web.admin.custom.interceptor
 * description: 构建用户认证的拦截器，每次执行关键函数时，确保用户处于登录状态
 */
@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 通过request的请求中获取到access-token值，即令牌
        String token = request.getHeader("access-token");

        // 使用JwtUtils类的方法来解析获取的令牌
        Claims claims = JwtUtils.parseToken(token);
        Long userId = claims.get("userId", Long.class);
        String username = claims.get("username", String.class);

        LoginUserHolder.setLoginUser(new LoginUser(userId, username));
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LoginUserHolder.clear();
    }
}
