package com.dreamingj.edu_rating.sevice;

import com.dreamingj.edu_rating.entity.User;
import com.dreamingj.edu_rating.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    //使用Autowired注解，自动装配  没有new对象却可以返回，用到了【依赖注入】

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录业务逻辑
     * @param userID 账户名
     * @param userPwd 密码
     * @return
     */
    public User loginService(String userID, String userPwd){
        // 如果账号密码都对则返回登录的用户对象，若有一个错误则返回null
        User user = userMapper.findByUserIDAndPassword(userID, userPwd);
        if(user != null) {
            user.setUserPwd("");
            return user;
        }
        else{
            return null;
        }
    }

    /**
     * 账号激活业务逻辑
     */
    public User registerService(String userID, String userPwd){
        //当用户名存在时
        //返回创建好的用户对象
        // 无法激活就返回null
        User user = userMapper.findByUserIDAndPassword(userID, userPwd);
        return user;
    }



    public List<User> findAll(){
        return userMapper.findAll();
    }
}
