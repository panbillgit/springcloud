package com.cloud.client.feign;

import com.cloud.client.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @author beansp
 * @since 2020-01-09
 * @Note 消费者接口
 */
@Component
@FeignClient(value = "server-user")
public interface UserFeignClient {
    /**
     * 根据ID查询用户信息
     *
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    User findById(@RequestParam Long id);
}




