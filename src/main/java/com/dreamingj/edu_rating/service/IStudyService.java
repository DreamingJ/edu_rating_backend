package com.dreamingj.edu_rating.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dreamingj.edu_rating.common.RequestBodyApi;
import com.dreamingj.edu_rating.entity.StudyEval;

public interface IStudyService extends IService<StudyEval> {
    Page<StudyEval> page(RequestBodyApi<StudyEval> RequestBodyApi);
}
