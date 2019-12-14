package com.monster.javaweb.homeword_three.controller;

import com.monster.javaweb.homeword_three.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/homework-three")
public class UserController {


    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/getuser")
    public String getUser(@RequestParam(value = "id", defaultValue = "0")String id)throws Exception{
        return userService.getUser(id);
    }
}