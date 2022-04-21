package com.dreamingj.edu_rating.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dreamingj.edu_rating.entity.User;
import com.dreamingj.edu_rating.mapper.PersonMapper;
import com.dreamingj.edu_rating.common.RequestBodyApi;
import com.dreamingj.edu_rating.service.IPersonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service("personService")
@Transactional
public class PersonServiceImpl extends ServiceImpl<PersonMapper, User> implements IPersonService {
    @Override
    public Page<User> page(RequestBodyApi<User> requestBodyApi) {

        return null;
    }
}
