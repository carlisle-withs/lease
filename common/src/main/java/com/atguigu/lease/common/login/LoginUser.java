package com.atguigu.lease.common.login;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Author: Carlisle Cullen
 * Date: 2025/2/20 下午11:31
 * projectName: com.atguigu.lease.common.login
 * description:
 */
@Data
@AllArgsConstructor
public class LoginUser {

    private Long userId;

    private String userName;
}
