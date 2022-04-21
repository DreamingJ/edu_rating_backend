package com.dreamingj.edu_rating.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dreamingj.edu_rating.common.RequestBodyApi;
import com.dreamingj.edu_rating.entity.User;



public interface IPersonService extends IService<User> {
    Page<User> page(RequestBodyApi<User> requestBodyApi);
}
