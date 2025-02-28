package com.atguigu.lease.web.app.service.impl;

import com.atguigu.lease.web.app.service.SmsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Carlisle Cullen
 * Date: 2025/2/21 下午3:08
 * projectName: com.atguigu.lease.web.app.service.impl
 * description:
 */
@SpringBootTest
class SmsServiceImplTest {

    @Autowired
    private SmsService smsService;

    @Test
    public void sentCodeTest(){
        smsService.sendCode("19156299553","5201314");
    }

}