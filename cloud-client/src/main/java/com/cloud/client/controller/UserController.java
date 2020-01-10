package com.cloud.client.controller;

import com.cloud.client.entity.User;
import com.cloud.client.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author beansp
 * @Note 用户控制类
 * @since 2020-01-09
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("test")
    @ResponseBody
    public User findById() {
        Long id = 1L;
        User user = userFeignClient.findById(id);
        return user;
    }

}
