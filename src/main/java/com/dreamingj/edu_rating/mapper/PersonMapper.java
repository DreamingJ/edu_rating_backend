package com.dreamingj.edu_rating.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dreamingj.edu_rating.entity.User;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface PersonMapper extends BaseMapper<User> {
}
