package com.AdesK.serviceImpl;

import com.AdesK.mapper.UserMap;
import com.AdesK.mapper.UserMapper;
import com.AdesK.model.User;
import com.AdesK.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/10/5 0005.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Autowired
    private UserMap userMap;
    @Override
    public User findUserById(Integer id){
        System.out.println("你好"+ userMap.findById(1).getId());

        System.out.println(userMapper.findUserById(id).getId());
        return  userMapper.findUserById(id);
    }
}
