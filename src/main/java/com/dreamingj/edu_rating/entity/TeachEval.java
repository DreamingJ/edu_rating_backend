package com.dreamingj.edu_rating.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("teacheval")
public class TeachEval {
    @TableId
    Integer tID;
    String userID;
    String courseID;
    String courseName;
    @TableField("isSubmit")
    boolean submit;
    int teachItem1;
    int teachItem2;
    int teachItem3;
    int teachItem4;
    int teachItem5;
    String teachComment;

    public Integer gettID() {
        return tID;
    }

    public void settID(Integer tID) {
        this.tID = tID;
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

//    public boolean isSubmit() {
//        return isSubmit;
//    }

    public boolean getSubmit() {
        return submit;
    }

    public void setSubmit(boolean submit) {
        this.submit = submit;
    }

    public int getTeachItem1() {
        return teachItem1;
    }

    public TeachEval(){

    }

    public TeachEval(Integer tID, String userID, String courseID, String courseName, boolean submit) {
        this.tID = tID;
        this.userID = userID;
        this.courseID = courseID;
        this.courseName = courseName;
        this.submit = submit;
    }

    public void setTeachItem1(int teachItem1) {
        this.teachItem1 = teachItem1;
    }

    public int getTeachItem2() {
        return teachItem2;
    }

    public void setTeachItem2(int teachItem2) {
        this.teachItem2 = teachItem2;
    }

    public int getTeachItem3() {
        return teachItem3;
    }

    public void setTeachItem3(int teachItem3) {
        this.teachItem3 = teachItem3;
    }

    public int getTeachItem4() {
        return teachItem4;
    }

    public void setTeachItem4(int teachItem4) {
        this.teachItem4 = teachItem4;
    }

    public int getTeachItem5() {
        return teachItem5;
    }

    public void setTeachItem5(int teachItem5) {
        this.teachItem5 = teachItem5;
    }

    public String getTeachComment() {
        return teachComment;
    }

    public void setTeachComment(String teachComment) {
        this.teachComment = teachComment;
    }

    public TeachEval(Integer tID, String userID, String courseID, String courseName, boolean isSubmit, int teachItem1, int teachItem2, int teachItem3, int teachItem4, int teachItem5, String teachComment) {
        this.tID = tID;
        this.userID = userID;
        this.courseID = courseID;
        this.courseName = courseName;
        this.submit = isSubmit;
        this.teachItem1 = teachItem1;
        this.teachItem2 = teachItem2;
        this.teachItem3 = teachItem3;
        this.teachItem4 = teachItem4;
        this.teachItem5 = teachItem5;
        this.teachComment = teachComment;
    }
}


