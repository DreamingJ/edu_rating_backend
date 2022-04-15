package com.dreamingj.edu_rating.entity;

public class TeachEval {
    int tID;
    String userID;
    String courseID;
    boolean isSubmit;
    int teachItem1;
    int teachItem2;
    int teachItem3;
    int teachItem4;
    int teachItem5;
    String teachComment;

    public TeachEval(int tID, String userID, String courseID, boolean isSubmit, int teachItem1, int teachItem2, int teachItem3, int teachItem4, int teachItem5, String teachComment) {
        this.tID = tID;
        this.userID = userID;
        this.courseID = courseID;
        this.isSubmit = isSubmit;
        this.teachItem1 = teachItem1;
        this.teachItem2 = teachItem2;
        this.teachItem3 = teachItem3;
        this.teachItem4 = teachItem4;
        this.teachItem5 = teachItem5;
        this.teachComment = teachComment;
    }

    public int gettID() {
        return tID;
    }

    public void settID(int tID) {
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

    public boolean isSubmit() {
        return isSubmit;
    }

    public void setSubmit(boolean submit) {
        isSubmit = submit;
    }

    public int getTeachItem1() {
        return teachItem1;
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
}


