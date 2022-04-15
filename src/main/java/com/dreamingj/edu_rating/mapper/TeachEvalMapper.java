package com.dreamingj.edu_rating.mapper;

import com.dreamingj.edu_rating.entity.Course;
import com.dreamingj.edu_rating.entity.CourseItem;
import com.dreamingj.edu_rating.entity.TeachEval;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Mapper
public interface TeachEvalMapper {
    @Select("select c.*,t.isSubmit from course c inner join teacheval t on c.courseID = t.courseID where t.userID=#{userID}")
    List<CourseItem> getTeachCourse(String userID);

    @Select("select count(*) from teacheval where userID=#{userID} and isSubmit=0")
    int getTeachEvalNum(String userID);

    @Update("update teacheval set isSubmit=1, teachItem1=#{teachItem1}, teachItem2=#{teachItem2},teachItem3=#{teachItem3},teachItem4=#{teachItem4},teachItem5=#{teachItem5},teachComment=#{teachComment} where userID=#{userID} and courseID=#{courseID}")
    void submitTeach( String userID,
                      String courseID,
                      int teachItem1,
                      int teachItem2,
                      int teachItem3,
                      int teachItem4,
                      int teachItem5,
                      String teachComment
    );

    @Select("select * from teacheval where userID=#{userID} and courseID=#{courseID}")
    TeachEval getTeachRes( String userID,
                           String courseID);
}
