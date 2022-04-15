package com.dreamingj.edu_rating.controller;

import com.dreamingj.edu_rating.entity.User;
import com.dreamingj.edu_rating.sevice.UserService;
import com.dreamingj.edu_rating.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //具体业务逻辑丢给Service层

    @PostMapping("/login")
    public Result<User> loginController(@RequestParam String userID, @RequestParam String userPwd){
        User user = userService.loginService(userID, userPwd);
        if(user!=null){
            return Result.success(user,"登录成功！");
        }else{
            return Result.error("001","账号或密码错误！");
        }
    }

    @PostMapping("/register")
    public Result<String> registerController(@RequestParam String userID, @RequestParam String userPwd){
        User user = userService.registerService(userID, userPwd);
        if(user!=null){
            return Result.success(user.getUserID(),"激活成功！");
        }else{
            return Result.error("001","账号或密码错误！");
        }
    }

    @GetMapping("/all")
    public List<User> getAllUser(){
        return userService.findAll();
    }
}
