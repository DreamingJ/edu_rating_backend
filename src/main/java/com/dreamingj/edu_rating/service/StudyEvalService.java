package com.dreamingj.edu_rating.service;

import com.dreamingj.edu_rating.entity.CourseItem;
import com.dreamingj.edu_rating.entity.StudyEval;
import com.dreamingj.edu_rating.mapper.StudyEvalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyEvalService {
    @Autowired
    private StudyEvalMapper studyEvalMapper;

    public int getStudyEvalNum(String userID){
        return  studyEvalMapper.getStudyEvalNum(userID);
    }

    public StudyEval getStudyRes(String userID,
                                 String courseID){
        return studyEvalMapper.getStudyRes(userID, courseID);
    }

    public void submitStudy( String userID,
                             String courseID,
                             int studyItem1,
                             int studyItem2,
                             int studyItem3,
                             int studyItem4,
                             int studyItem5,
                             String studyComment
    ){
        studyEvalMapper.submitStudy(userID,courseID,studyItem1,studyItem2,studyItem3,studyItem4,studyItem5,studyComment);
    }

    public List<CourseItem> getStudyCourse(String userID){
        return  studyEvalMapper.getStudyCourse(userID);
    }

}
