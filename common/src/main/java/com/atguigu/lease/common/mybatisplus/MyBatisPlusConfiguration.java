package com.atguigu.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Carlisle Cullen
 * Date: 2025/1/2 上午10:28
 * projectName: com.atguigu.lease
 * description:
 */
@Configuration
@MapperScan("com.atguigu.lease.web.*.mapper")
public class MyBatisPlusConfiguration {

}
