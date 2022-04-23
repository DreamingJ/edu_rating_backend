package com.dreamingj.edu_rating.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TeachCourseVO implements Serializable {
    int tID;
    String userID;
    String courseID;
    boolean isSubmit;
    String courseName;
}
