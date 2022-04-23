package com.dreamingj.edu_rating.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dreamingj.edu_rating.common.RequestBodyApi;
import com.dreamingj.edu_rating.entity.TeachCourseVO;
import com.dreamingj.edu_rating.entity.TeachEval;
import com.dreamingj.edu_rating.mapper.TeachEvalMapper;
import com.dreamingj.edu_rating.service.ITeachService;
import org.springframework.stereotype.Service;

@Service
public class TeachServiceImpl extends ServiceImpl<TeachEvalMapper, TeachEval> implements ITeachService {
    @Override
    public Page<TeachEval> page(RequestBodyApi<TeachEval> requestBodyApi){
        return null;
    }


}
