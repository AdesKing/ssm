package com.AdesK.controller;

import com.AdesK.service.UserService;
import com.AdesK.model.User;
import com.alibaba.fastjson.JSON;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/10/5 0005.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/index")
    public String findUserById(){
        System.out.println("xsacksac's");
        User user= userService.findUserById(1);
        String jsonToString= JSON.toJSONString(user);

        System.out.println(jsonToString);

        return "index";
    }

}
