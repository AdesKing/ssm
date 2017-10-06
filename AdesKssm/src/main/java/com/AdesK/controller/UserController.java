package com.AdesK.controller;

import com.AdesK.service.UserService;
import com.AdesK.model.User;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import untilTool.JsonUntil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 * Created by Administrator on 2017/10/5 0005.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/index")
    public String findUserById(HttpServletRequest httpServletRequest){
        System.out.println("xsacksac's");
        User user= userService.findUserById(1);
        String jsonToString= JSON.toJSONString(user);

        JsonUntil.toJson(jsonToString, httpServletRequest);

        System.out.println(jsonToString);

        return "index";
    }

}
