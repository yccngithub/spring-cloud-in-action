package com.learn.cloud.feign;

import com.learn.cloud.config.FeignConfiguration;
import com.learn.cloud.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "microservice-provider-user", configuration = FeignConfiguration.class)
public interface UserFeignClient {
    @RequestLine("GET /{id}")
    public User findById(@Param("id") Long id);
}
