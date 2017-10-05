package com.AdesK.mapper;

import com.AdesK.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/10/4 0004.
 */
@Repository
public interface UserMap {
    @Select("select * from user where id=#{id}")
    User findById(int id);
}
