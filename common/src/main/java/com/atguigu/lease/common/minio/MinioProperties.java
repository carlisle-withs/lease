package com.atguigu.lease.common.minio;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Author: Carlisle Cullen
 * Date: 2025/2/1 下午11:36
 * projectName: com.atguigu.lease.common.minio
 * description:
 */
@ConfigurationProperties(prefix = "minio")
@Data
public class MinioProperties {

    private String endpoint;

    private String accessKey;

    private String secretKey;

    private String bucketName;
}
