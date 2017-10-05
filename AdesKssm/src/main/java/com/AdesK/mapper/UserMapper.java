package com.AdesK.mapper;
import com.AdesK.model.User;
import org.springframework.stereotype.Repository;
@Repository
public interface UserMapper {
   User findUserById(Integer id);

}