package com.atguigu.lease.web.admin.schedule;

import com.atguigu.lease.model.entity.LeaseAgreement;
import com.atguigu.lease.model.enums.LeaseStatus;
import com.atguigu.lease.web.admin.service.LeaseAgreementService;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Author: Carlisle Cullen
 * Date: 2025/2/19 下午5:13
 * projectName: com.atguigu.lease.web.admin.schedule
 * description: 设置定时任务
 */
@Component
public class ScheduleTasks {

    @Autowired
    private LeaseAgreementService service;

    @Scheduled(cron = "0 0 0 * * *")
    public void checkLeaseStatus(){
        LambdaUpdateWrapper<LeaseAgreement> wrapper = new LambdaUpdateWrapper<>();
        wrapper.in(LeaseAgreement::getStatus, LeaseStatus.SIGNED, LeaseStatus.WITHDRAWING);
        wrapper.le(LeaseAgreement::getLeaseEndDate, new Date());
        wrapper.set(LeaseAgreement::getStatus, LeaseStatus.EXPIRED);
        service.update(wrapper);
    }

}
