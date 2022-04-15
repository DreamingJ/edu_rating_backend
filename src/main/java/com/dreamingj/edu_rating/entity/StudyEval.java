package com.dreamingj.edu_rating.entity;

public class StudyEval {
     int sID;
     String userID;
     String courseID;
    boolean isSubmit;
    int studyItem1;
    int studyItem2;
    int studyItem3;
    int studyItem4;
    int studyItem5;
    String studyComment;

    public StudyEval(int sID, String userID, String courseID, boolean isSubmit, int studyItem1, int studyItem2, int studyItem3, int studyItem4, int studyItem5, String studyComment) {
        this.sID = sID;
        this.userID = userID;
        this.courseID = courseID;
        this.isSubmit = isSubmit;
        this.studyItem1 = studyItem1;
        this.studyItem2 = studyItem2;
        this.studyItem3 = studyItem3;
        this.studyItem4 = studyItem4;
        this.studyItem5 = studyItem5;
        this.studyComment = studyComment;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
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

    public boolean isSubmit() {
        return isSubmit;
    }

    public void setSubmit(boolean submit) {
        isSubmit = submit;
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
