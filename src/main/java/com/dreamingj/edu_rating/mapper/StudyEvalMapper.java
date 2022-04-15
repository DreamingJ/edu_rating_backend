package com.dreamingj.edu_rating.mapper;

import com.dreamingj.edu_rating.entity.CourseItem;
import com.dreamingj.edu_rating.entity.StudyEval;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface StudyEvalMapper {
    @Select("select count(*) from studyeval where userID=#{userID} and isSubmit=0")
    int getStudyEvalNum(String userID);

    @Select("select c.*,t.isSubmit from course c inner join studyeval t on c.courseID = t.courseID where t.userID=#{userID}")
    List<CourseItem> getStudyCourse(String userID);

    @Update("update studyeval set isSubmit=1, studyItem1=#{studyItem1}, studyItem2=#{studyItem2},studyItem3=#{studyItem3},studyItem4=#{studyItem4},studyItem5=#{studyItem5},studyComment=#{studyComment} where userID=#{userID} and courseID=#{courseID}")
    void submitStudy( String userID,
                      String courseID,
                      int studyItem1,
                      int studyItem2,
                      int studyItem3,
                      int studyItem4,
                      int studyItem5,
                      String studyComment
    );

    @Select("select * from studyeval where userID=#{userID} and courseID=#{courseID}")
    StudyEval getStudyRes(String userID,
                          String courseID);
}
