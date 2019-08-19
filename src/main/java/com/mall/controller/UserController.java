package com.mall.controller;

import com.mall.bean.ResponseWrapper;
import com.mall.bean.tUser;
import com.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/login")
    @ResponseBody
    public ResponseWrapper login(@RequestBody tUser tuser)
    {
        System.out.println(tuser);
        if(userService.login(tuser))
        return new ResponseWrapper<String>(
            200, "SUCCESS",
            "login_success");

        return new ResponseWrapper<String>(
                400, "ERROR",
                "login_fail");

    }
    @PostMapping("/register")
    @ResponseBody
    public boolean register(@RequestBody tUser tuser)
    {
        System.out.println(tuser);
        return userService.register(tuser);
    }
    @GetMapping("/test")
    public void test()
    {
        System.out.println("test successful");
    }
}
