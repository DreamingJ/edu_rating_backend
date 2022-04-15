package com.dreamingj.edu_rating.sevice;

import com.dreamingj.edu_rating.entity.Course;
import com.dreamingj.edu_rating.entity.CourseItem;
import com.dreamingj.edu_rating.entity.TeachEval;
import com.dreamingj.edu_rating.mapper.TeachEvalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Service
public class TeachEvalService {
    @Autowired
    private TeachEvalMapper teachEvalMapper;

    public TeachEval getTeachRes(String userID,
                          String courseID){
        return teachEvalMapper.getTeachRes(userID, courseID);
    }

    public void submitTeach( String userID,
                             String courseID,
                             int teachItem1,
                             int teachItem2,
                             int teachItem3,
                             int teachItem4,
                             int teachItem5,
                             String teachComment
    ){
        teachEvalMapper.submitTeach(userID,courseID,teachItem1,teachItem2,teachItem3,teachItem4,teachItem5,teachComment);
    }

    public List<CourseItem> getTeachCourse(String userID){
        return  teachEvalMapper.getTeachCourse(userID);
    }

    public int getTeachEvalNum(String userID){
        return  teachEvalMapper.getTeachEvalNum(userID);
    }
}
