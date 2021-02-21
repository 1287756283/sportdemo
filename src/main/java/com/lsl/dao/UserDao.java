package com.lsl.dao;

import com.lsl.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public User getUserByMassage(@Param("username") String username, @Param("password") String password);

    public List<User> getAllUser(@Param("username")String username,@Param("pageStart")int PageStart,@Param("pageSize")int pageSize);

    public int getUserCounts(@Param("username")String username);
}
