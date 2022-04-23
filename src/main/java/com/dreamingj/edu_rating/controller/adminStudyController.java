package com.dreamingj.edu_rating.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dreamingj.edu_rating.common.RequestBodyApi;
import com.dreamingj.edu_rating.common.ResponseBodyApi;
import com.dreamingj.edu_rating.entity.StudyEval;
import com.dreamingj.edu_rating.service.IStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/adminstudy")
public class adminStudyController {
    @Autowired
    private IStudyService studyService;

    private LambdaQueryWrapper<StudyEval> getQueryWrapper(RequestBodyApi<StudyEval> requestBodyApi) {
        StudyEval person = requestBodyApi.getParams();
        //只查询相关的部分字段
        LambdaQueryWrapper<StudyEval> queryWrapper = new QueryWrapper<StudyEval>().lambda();
        if (person != null) {
            queryWrapper = queryWrapper.like(!StringUtils.isEmpty(person.getCourseID()), StudyEval::getCourseID, person.getCourseID())
                    .eq(!StringUtils.isEmpty(person.getUserID()), StudyEval::getUserID, person.getUserID()).select(StudyEval::getsID,StudyEval::getCourseID, StudyEval::getCourseName, StudyEval::getUserID, StudyEval::getSubmit);
        }
        return queryWrapper;
    }

    @PostMapping("/page")
    public ResponseBodyApi<Page<StudyEval>> page(@RequestBody RequestBodyApi<StudyEval> requestBodyApi) {
        Page<StudyEval> page = studyService.page(requestBodyApi.getPage(), getQueryWrapper(requestBodyApi));
        return new ResponseBodyApi<>(page);
    }

//    @PostMapping("/getById")
//    public ResponseBodyApi getById(@RequestBody User person) {
//        return new ResponseBodyApi<>(teachService.getById(person.getUserID()));
//    }

    @PostMapping("/saveOrUpdate")
    public ResponseBodyApi saveOrUpdate(@RequestBody StudyEval person) {
        studyService.saveOrUpdate(person);
        return new ResponseBodyApi();
    }
    @PostMapping("/removeByIds")
    public ResponseBodyApi removeByIds(@RequestBody List<Integer> idList) {
        studyService.removeByIds(idList);
        return new ResponseBodyApi();
    }
}

