package com.dreamingj.edu_rating.controller;

import com.dreamingj.edu_rating.entity.CourseItem;
import com.dreamingj.edu_rating.entity.TeachEval;
import com.dreamingj.edu_rating.service.TeachEvalService;
import com.dreamingj.edu_rating.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacheval")
public class TeachEvalController {

    @Autowired
    private TeachEvalService teachEvalService;

    @GetMapping("/res")
    public TeachEval getTeachRes(@RequestParam String userID,
                                 @RequestParam String courseID){
        return teachEvalService.getTeachRes(userID, courseID);
    }

    @PostMapping()
    public Result submitTeach(@RequestParam String userID,
                              @RequestParam String courseID,
                              @RequestParam int teachItem1,
                              @RequestParam int teachItem2,
                              @RequestParam int teachItem3,
                              @RequestParam int teachItem4,
                              @RequestParam int teachItem5,
                              @RequestParam String teachComment
                              ){
        teachEvalService.submitTeach(userID,courseID,teachItem1,teachItem2,teachItem3,teachItem4,teachItem5,teachComment );
        return Result.success();
    }

    //两表连接的结果是什么类型，自创一个新实体CourseItem来接收
    @GetMapping("/items")
    public List<CourseItem> getTeachCourse(@RequestParam String userID){
        return teachEvalService.getTeachCourse(userID);
    }

    @GetMapping("/num")
    public Result<Integer> getTeachEvalNum(@RequestParam String userID){
        int num = teachEvalService.getTeachEvalNum(userID);
        return Result.success(num);
    }

}
