package com.atguigu.lease.web.admin.schedule;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Carlisle Cullen
 * Date: 2025/2/19 下午5:26
 * projectName: com.atguigu.lease.web.admin.schedule
 * description:
 */
@SpringBootTest
class ScheduleTasksTest {

    @Autowired
    private ScheduleTasks scheduleTasks;

    @Test
    public void test(){
        scheduleTasks.checkLeaseStatus();
    }

}