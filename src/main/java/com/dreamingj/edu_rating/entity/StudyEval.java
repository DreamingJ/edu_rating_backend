package com.dreamingj.edu_rating.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("studyeval")
public class StudyEval {
    @TableId
     Integer sID;
     String userID;
     String courseID;
    String courseName;
    @TableField("isSubmit")
    boolean submit;
    int studyItem1;
    int studyItem2;
    int studyItem3;
    int studyItem4;
    int studyItem5;
    String studyComment;

    public StudyEval(){

    }

    public StudyEval(Integer sID, String userID, String courseID, String courseName, boolean submit) {
        this.sID = sID;
        this.userID = userID;
        this.courseID = courseID;
        this.courseName = courseName;
        this.submit = submit;
    }

    public StudyEval(Integer sID, String userID, String courseID, String courseName, boolean isSubmit, int studyItem1, int studyItem2, int studyItem3, int studyItem4, int studyItem5, String studyComment) {
        this.sID = sID;
        this.userID = userID;
        this.courseID = courseID;
        this.courseName = courseName;
        this.submit = isSubmit;
        this.studyItem1 = studyItem1;
        this.studyItem2 = studyItem2;
        this.studyItem3 = studyItem3;
        this.studyItem4 = studyItem4;
        this.studyItem5 = studyItem5;
        this.studyComment = studyComment;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getsID() {
        return sID;
    }

    public void setsID(Integer sID) {
        this.sID = sID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public boolean getSubmit() {
        return submit;
    }

    public void setSubmit(boolean submit) {
        this.submit = submit;
    }

    public int getStudyItem1() {
        return studyItem1;
    }

    public void setStudyItem1(int studyItem1) {
        this.studyItem1 = studyItem1;
    }

    public int getStudyItem2() {
        return studyItem2;
    }

    public void setStudyItem2(int studyItem2) {
        this.studyItem2 = studyItem2;
    }

    public int getStudyItem3() {
        return studyItem3;
    }

    public void setStudyItem3(int studyItem3) {
        this.studyItem3 = studyItem3;
    }

    public int getStudyItem4() {
        return studyItem4;
    }

    public void setStudyItem4(int studyItem4) {
        this.studyItem4 = studyItem4;
    }

    public int getStudyItem5() {
        return studyItem5;
    }

    public void setStudyItem5(int studyItem5) {
        this.studyItem5 = studyItem5;
    }

    public String getStudyComment() {
        return studyComment;
    }

    public void setStudyComment(String studyComment) {
        this.studyComment = studyComment;
    }
}
