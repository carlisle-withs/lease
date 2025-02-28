package com.atguigu.lease.common.utils;

import java.util.Random;

/**
 * Author: Carlisle Cullen
 * Date: 2025/2/21 下午3:20
 * projectName: com.atguigu.lease.common.utils
 * description:
 */
public class CodeUtils {

    public static String getRandomCode(Integer length){
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < length; ++i){
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }
}
