package com.atguigu.lease;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Author: Carlisle Cullen
 * Date: 2025/2/21 下午1:51
 * projectName: com.atguigu.lease
 * description:
 */
@SpringBootApplication
@EnableAsync
public class AppWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppWebApplication.class);
    }

}
