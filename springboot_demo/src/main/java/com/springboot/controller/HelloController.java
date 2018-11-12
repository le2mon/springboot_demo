package com.springboot.controller;

import com.springboot.domain.Person;
import com.springboot.domain.User;
import com.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "welcome to the world of springboot!!!";
    }


    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }


}
