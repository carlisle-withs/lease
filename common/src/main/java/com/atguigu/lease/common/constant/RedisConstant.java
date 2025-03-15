package com.atguigu.lease.common.constant;

/**
 * Author: Carlisle Cullen
 * Date: 2025/2/20 下午3:44
 * projectName: com.atguigu.lease.common.constant
 * description: 设置了一些Redis的常量，用于登录时的一些参数配置
 */

// 因为都是些常量，故而不需要@Component注解来修饰类
public class RedisConstant {

    public static final String ADMIN_LOGIN_PREFIX = "admin:login:";

    public static final Integer ADMIN_LOGIN_CAPTCHA_TTL_SEC = 60;

    public static final String APP_LOGIN_PREFIX = "app:login:";

    public static final Integer APP_LOGIN_CODE_RESEND_TIME_SEC = 60;

    public static final Integer APP_LOGIN_CODE_TTL_SEC = 60 * 10;

}
