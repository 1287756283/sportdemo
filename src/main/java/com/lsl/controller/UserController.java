package com.lsl.controller;
import com.alibaba.fastjson.JSON;
import com.lsl.bean.QueryInfo;
import com.lsl.bean.User;
import com.lsl.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;


    @RequestMapping("/allUser")
    public String getUserList(QueryInfo queryInfo){
        System.out.println(queryInfo);
        int numbers = userDao.getUserCounts("%"+queryInfo.getQuery()+"%");// 获取数据总数
        int pageStart = (queryInfo.getPageNum()-1)*queryInfo.getPageSize();
        List<User> users = userDao.getAllUser("%"+queryInfo.getQuery()+"%",pageStart,queryInfo.getPageSize());
        HashMap<String, Object> res = new HashMap<>();
        res.put("numbers",numbers);
        res.put("data",users);
        System.out.println("总条数："+numbers);
        String res_string = JSON.toJSONString(res);

        return res_string;
    }



}
