package com.atguigu.lease.common.login;

/**
 * Author: Carlisle Cullen
 * Date: 2025/2/20 下午11:28
 * projectName: com.atguigu.lease.common.login
 * description: 构建一个登录用户的本地线程类，用于本线程能够获取登录用户的信息
 */
public class LoginUserHolder {

    // 实例化一个登录用户的ThreadLocal
    public static ThreadLocal<LoginUser> threadLocal = new ThreadLocal<>();

    public static void setLoginUser(LoginUser loginUser){
        threadLocal.set(loginUser);
    }

    public static LoginUser getLoginUser(){
        return threadLocal.get();
    }

    public static void clear(){
        threadLocal.remove();
    }
}
