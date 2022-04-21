package com.dreamingj.edu_rating.controller;

import com.dreamingj.edu_rating.entity.Admin;
import com.dreamingj.edu_rating.service.AdminService;
import com.dreamingj.edu_rating.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/admin")
public class adminController {
    @Autowired
    private AdminService adminService;
    //具体业务逻辑丢给Service层

    @PostMapping("/login")
    public Result loginController(@RequestParam String adminID, @RequestParam String adminPwd){
        Admin admin = adminService.loginService(adminID, adminPwd);
        if(admin!=null){
            return Result.success();
        }else{
            return Result.error("001","账号或密码错误！");
        }
    }
}
