package com.dreamingj.edu_rating.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dreamingj.edu_rating.common.RequestBodyApi;
import com.dreamingj.edu_rating.common.ResponseBodyApi;
import com.dreamingj.edu_rating.entity.TeachEval;
import com.dreamingj.edu_rating.service.ITeachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/adminteach")
public class adminTeachController {
    @Autowired
    private ITeachService teachService;
//    @PostMapping("/list")
//    public ResponseBodyApi<List<TeachCourseVO>> list(@RequestBody RequestBodyApi<TeachCourseVO> requestBodyApi) {
//        return new ResponseBodyApi<>(teachService.list(getQueryWrapper(requestBodyApi)));
//    }

    private LambdaQueryWrapper<TeachEval> getQueryWrapper(RequestBodyApi<TeachEval> requestBodyApi) {
        TeachEval person = requestBodyApi.getParams();
        //只查询相关的部分字段
        LambdaQueryWrapper<TeachEval> queryWrapper = new QueryWrapper<TeachEval>().lambda();
        if (person != null) {
            queryWrapper = queryWrapper.like(!StringUtils.isEmpty(person.getCourseID()), TeachEval::getCourseID, person.getCourseID())
                    .eq(!StringUtils.isEmpty(person.getUserID()), TeachEval::getUserID, person.getUserID()).select(TeachEval::gettID,TeachEval::getCourseID, TeachEval::getCourseName, TeachEval::getUserID, TeachEval::getSubmit);
        }
        return queryWrapper;
    }

    @PostMapping("/page")
    public ResponseBodyApi<Page<TeachEval>> page(@RequestBody RequestBodyApi<TeachEval> requestBodyApi) {
        Page<TeachEval> page = teachService.page(requestBodyApi.getPage(), getQueryWrapper(requestBodyApi));
        return new ResponseBodyApi<>(page);
    }

//    @PostMapping("/getById")
//    public ResponseBodyApi getById(@RequestBody User person) {
//        return new ResponseBodyApi<>(teachService.getById(person.getUserID()));
//    }

    @PostMapping("/saveOrUpdate")
    public ResponseBodyApi saveOrUpdate(@RequestBody TeachEval person) {
        teachService.saveOrUpdate(person);
        return new ResponseBodyApi();
    }
    @PostMapping("/removeByIds")
    public ResponseBodyApi removeByIds(@RequestBody List<Integer> idList) {
        teachService.removeByIds(idList);
        return new ResponseBodyApi();
    }
}
