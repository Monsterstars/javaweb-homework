package com.monster.javaweb.homeword_two.controller;

import com.monster.javaweb.homeword_two.bean.UserTwo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/homework-two")
public class UserControllerTwo {

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam String username, @RequestParam String password, @RequestParam String age){
        UserTwo userTwo = new UserTwo();
        userTwo.setName(username);
        userTwo.setPassword(password);
        userTwo.setAge(age);
        return userTwo.toString();
    }
}