package com.dreamingj.edu_rating.entity;


import java.util.List;

public class Course {

    String courseID;
    String courseName;
    String teacherName;
    String deptName;
    String semester;
    //course和选课项一对多
    List<TeachEval> teachList;
    List<StudyEval> studyList;

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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public List<TeachEval> getTeachList() {
        return teachList;
    }

    public void setTeachList(List<TeachEval> teachList) {
        this.teachList = teachList;
    }

    public List<StudyEval> getStudyList() {
        return studyList;
    }

    public void setStudyList(List<StudyEval> studyList) {
        this.studyList = studyList;
    }

    public Course(String courseID, String courseName, String teacherName, String deptName, String semester, List<TeachEval> teachList, List<StudyEval> studyList) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.deptName = deptName;
        this.semester = semester;
        this.teachList = teachList;
        this.studyList = studyList;
    }
}
