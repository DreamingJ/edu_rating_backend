package com.dreamingj.edu_rating.mapper;

import com.dreamingj.edu_rating.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//方法一：直接加注解实现select等
//方法二：在resource中使用同名mapper，具体sql逻辑在mapper.xml文件中配置
//方法三： 继承mybatis-plus不用自己写sql

@Mapper
public interface UserMapper {
    @Select("select * from user where userID=#{userID} and userPwd=#{userPwd}")
    User findByUserIDAndPassword(String userID, String userPwd);

    @Select("select * from user where userID=#{userID}")
    User selectById(String userID);

    @Select("select * from user")
    List<User> findAll();

    //admin负责注册用户， user只负责激活
    @Insert("insert into user values (#{userID}, #{userPwd}, #{userName}, #{status}, #{deptName})")
    void addUser(User user);
}
