package com.dreamingj.edu_rating.entity;


import java.util.List;

public class CourseItem {

    String courseID;
    String courseName;
    String teacherName;
    String deptName;
    String semester;
    boolean isSubmit;

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

    public boolean isSubmit() {
        return isSubmit;
    }

    public void setSubmit(boolean isSubmit) {
        this.isSubmit =isSubmit;
    }

    public CourseItem(String courseID, String courseName, String teacherName, String deptName, String semester, boolean isSubmit) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.deptName = deptName;
        this.semester = semester;
        this.isSubmit = isSubmit;
    }
}
