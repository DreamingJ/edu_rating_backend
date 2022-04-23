package com.dreamingj.edu_rating.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dreamingj.edu_rating.common.RequestBodyApi;
import com.dreamingj.edu_rating.entity.StudyEval;
import com.dreamingj.edu_rating.mapper.StudyEvalMapper;
import com.dreamingj.edu_rating.service.IStudyService;
import org.springframework.stereotype.Service;

@Service
public class StudyServiceImpl extends ServiceImpl<StudyEvalMapper, StudyEval> implements IStudyService {
    @Override
    public Page<StudyEval> page(RequestBodyApi<StudyEval> requestBodyApi){
        return null;
    }


}
