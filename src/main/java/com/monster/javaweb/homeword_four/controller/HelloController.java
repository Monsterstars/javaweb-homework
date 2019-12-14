package com.monster.javaweb.homeword_four.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
