package com.internation.info.dao;

import com.internation.info.model.Question;
import com.internation.info.model.QuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface QuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Wed May 02 17:28:48 CST 2018
     */
    @SelectProvider(type=QuestionSqlProvider.class, method="countByExample")
    int countByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Wed May 02 17:28:48 CST 2018
     */
    @DeleteProvider(type=QuestionSqlProvider.class, method="deleteByExample")
    int deleteByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Wed May 02 17:28:48 CST 2018
     */
    @Delete({
        "delete from question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Wed May 02 17:28:48 CST 2018
     */
    @Insert({
        "insert into question (id, title, ",
        "content, questioner, ",
        "questionTime, isresolve, ",
        "professorId, professorName, ",
        "adoptTheContent, seeCount, ",
        "status, isdelete)",
        "values (#{id,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=VARCHAR}, #{questioner,jdbcType=INTEGER}, ",
        "#{questionTime,jdbcType=TIMESTAMP}, #{isresolve,jdbcType=INTEGER}, ",
        "#{professorId,jdbcType=INTEGER}, #{professorName,jdbcType=VARCHAR}, ",
        "#{adoptTheContent,jdbcType=VARCHAR}, #{seeCount,jdbcType=INTEGER}, ",
        "#{status,jdbcType=INTEGER}, #{isdelete,jdbcType=INTEGER})"
    })
    int insert(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Wed May 02 17:28:48 CST 2018
     */
    @InsertProvider(type=QuestionSqlProvider.class, method="insertSelective")
    int insertSelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Wed May 02 17:28:48 CST 2018
     */
    @SelectProvider(type=QuestionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="questioner", property="questioner", jdbcType=JdbcType.INTEGER),
        @Result(column="questionTime", property="questionTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="isresolve", property="isresolve", jdbcType=JdbcType.INTEGER),
        @Result(column="professorId", property="professorId", jdbcType=JdbcType.INTEGER),
        @Result(column="professorName", property="professorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="adoptTheContent", property="adoptTheContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="seeCount", property="seeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="isdelete", property="isdelete", jdbcType=JdbcType.INTEGER)
    })
    List<Question> selectByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Wed May 02 17:28:48 CST 2018
     */
    @Select({
        "select",
        "id, title, content, questioner, questionTime, isresolve, professorId, professorName, ",
        "adoptTheContent, seeCount, status, isdelete",
        "from question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="questioner", property="questioner", jdbcType=JdbcType.INTEGER),
        @Result(column="questionTime", property="questionTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="isresolve", property="isresolve", jdbcType=JdbcType.INTEGER),
        @Result(column="professorId", property="professorId", jdbcType=JdbcType.INTEGER),
        @Result(column="professorName", property="professorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="adoptTheContent", property="adoptTheContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="seeCount", property="seeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="isdelete", property="isdelete", jdbcType=JdbcType.INTEGER)
    })
    Question selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Wed May 02 17:28:48 CST 2018
     */
    @UpdateProvider(type=QuestionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Wed May 02 17:28:48 CST 2018
     */
    @UpdateProvider(type=QuestionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Wed May 02 17:28:48 CST 2018
     */
    @UpdateProvider(type=QuestionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Wed May 02 17:28:48 CST 2018
     */
    @Update({
        "update question",
        "set title = #{title,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "questioner = #{questioner,jdbcType=INTEGER},",
          "questionTime = #{questionTime,jdbcType=TIMESTAMP},",
          "isresolve = #{isresolve,jdbcType=INTEGER},",
          "professorId = #{professorId,jdbcType=INTEGER},",
          "professorName = #{professorName,jdbcType=VARCHAR},",
          "adoptTheContent = #{adoptTheContent,jdbcType=VARCHAR},",
          "seeCount = #{seeCount,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "isdelete = #{isdelete,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Question record);
}