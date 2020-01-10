package com.cloud.provider.controller;

import com.cloud.provider.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author beansp
 * @since 2020-01-09
 * @Note 用户控制类
 */
@Controller
@RequestMapping
public class UserController {

    @RequestMapping(value = "findById",method = RequestMethod.GET)
    @ResponseBody
    public User findById(@RequestParam(value = "id") Long id) {

        User findOne = new User();
        if (id == 1) {
            findOne.setAge(20);
            findOne.setName("zhangsan");
            findOne.setUsername("zhangsan");
            findOne.setId(1L);
            findOne.setBalance(800D);
        } else {
            findOne.setAge(18);
            findOne.setName("lisi");
            findOne.setUsername("lisi");
            findOne.setId(2L);
            findOne.setBalance(2000D);
        }
        return findOne;
    }
}

