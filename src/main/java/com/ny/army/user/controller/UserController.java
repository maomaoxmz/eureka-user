package com.ny.army.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/userInfo")
    public String userInfo() {
        return "用户地址：联丰胡同";
    }

    @GetMapping("/buy")
    public String buy() {
        return "用户已买过";
    }

    @GetMapping("/login")
    public String login() {
        return "用户已登陆";
    }
}
