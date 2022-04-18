package com.dreamingj.edu_rating.mapper;

import com.dreamingj.edu_rating.entity.Admin;
import com.dreamingj.edu_rating.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {
    @Select("select * from admin where adminID=#{adminID} and adminPwd=#{adminPwd}")
    Admin findByUserIDAndPassword(String adminID, String adminPwd);
}
