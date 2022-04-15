package com.dreamingj.edu_rating.entity;

import org.apache.ibatis.jdbc.Null;

//数据库的实体类

public class User {
    private String userID;
    private String userPwd;
    private String userName;
    private String deptName;//领导和专家根据deptID，在课程表中查找，确定要评的课
    private String status;  //1学生，2教师，3领导，4专家

    public User(String userID, String userPwd, String userName, String deptName, String status) {
        this.userID = userID;
        this.userPwd = userPwd;
        this.userName = userName;
        this.deptName = deptName;
        this.status = status;
    }

    //重载
    public User(String userID, String userName, String userPwd) {
        this(userID, userPwd, userName,"计算机学院", "学生");
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
