package com.springboot;

import com.springboot.domain.User;
import com.springboot.mapper.UserMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class Test {

    @Autowired
    private UserMapper userMapper;

    @org.junit.Test
    public void findAll(){
        List<User> all = userMapper.findAll();
        System.out.println(all);
    }

}
