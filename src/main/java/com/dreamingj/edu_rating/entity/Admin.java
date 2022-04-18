package com.dreamingj.edu_rating.entity;

public class Admin {
    private String adminID;
    private String adminPwd;

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public Admin(String adminID, String adminPwd) {
        this.adminID = adminID;
        this.adminPwd = adminPwd;
    }
}
