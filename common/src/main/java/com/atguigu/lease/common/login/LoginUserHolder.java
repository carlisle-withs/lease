package com.atguigu.lease.common.login;

/**
 * Author: Carlisle Cullen
 * Date: 2025/2/20 下午11:28
 * projectName: com.atguigu.lease.common.login
 * description:
 */
public class LoginUserHolder {

    public static ThreadLocal<LoginUser> threadLocal = new ThreadLocal<LoginUser>();

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
