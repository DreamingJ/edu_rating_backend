package com.dreamingj.edu_rating.controller;

import com.dreamingj.edu_rating.entity.CourseItem;
import com.dreamingj.edu_rating.entity.StudyEval;
import com.dreamingj.edu_rating.sevice.StudyEvalService;
import com.dreamingj.edu_rating.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/studyeval")
public class StudyEvalController {

    @Autowired
    private StudyEvalService studyEvalService;

    @GetMapping("/res")
    public StudyEval getStudyRes(@RequestParam String userID,
                                 @RequestParam String courseID){
        return studyEvalService.getStudyRes(userID, courseID);
    }

    @PostMapping()
    public Result submitStudy(@RequestParam String userID,
                              @RequestParam String courseID,
                              @RequestParam int studyItem1,
                              @RequestParam int studyItem2,
                              @RequestParam int studyItem3,
                              @RequestParam int studyItem4,
                              @RequestParam int studyItem5,
                              @RequestParam String studyComment
    ){
        studyEvalService.submitStudy(userID,courseID,studyItem1,studyItem2,studyItem3,studyItem4,studyItem5,studyComment);
        return Result.success();
    }

    //两表连接的结果是什么类型，自创一个新实体CourseItem来接收
    @GetMapping("/items")
    public List<CourseItem> getStudyCourse(@RequestParam String userID){
        return studyEvalService.getStudyCourse(userID);
    }

    @GetMapping("/num")
    public Result<Integer> getStudyEvalNum(@RequestParam String userID){
        int num = studyEvalService.getStudyEvalNum(userID);
        return Result.success(num);
    }

}
