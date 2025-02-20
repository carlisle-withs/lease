package com.atguigu.lease;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Author: Carlisle Cullen
 * Date: 2025/1/2 上午12:05
 * projectName: com.atguigu.lease
 * description: web-admin的启动类
 */

@SpringBootApplication
@EnableScheduling
public class AdminWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminWebApplication.class, args);
    }
}
