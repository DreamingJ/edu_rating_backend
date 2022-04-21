package com.dreamingj.edu_rating.service;

import com.dreamingj.edu_rating.entity.Admin;
import com.dreamingj.edu_rating.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public Admin loginService(String adminID, String adminPwd){
        // 如果账号密码都对则返回登录的用户对象，若有一个错误则返回null
        //不用返回账号
        Admin admin = adminMapper.findByUserIDAndPassword(adminID, adminPwd);
        if(admin != null) {
            return admin;
        }
        else{
            return null;
        }
    }
}
