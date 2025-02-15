package com.atguigu.lease.common.exception;

import com.atguigu.lease.common.result.ResultCodeEnum;
import lombok.Data;

/**
 * Author: Carlisle Cullen
 * Date: 2025/2/15 下午1:04
 * projectName: com.atguigu.lease.common.exception
 * description:
 */
@Data
public class LeaseException extends RuntimeException{

    private Integer code;

    public LeaseException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public LeaseException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }
}
