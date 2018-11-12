package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class FreemarkerController {

    @RequestMapping("/index")
    public String web(Map<String,Object> model){
        model.put("time",new Date());
        model.put("message","hello world");
        return "index";
    }
}
