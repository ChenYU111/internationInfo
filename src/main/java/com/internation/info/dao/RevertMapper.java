package com.internation.info.dao;

import com.internation.info.model.Revert;
import com.internation.info.model.RevertExample;
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

public interface RevertMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table revert
     *
     * @mbggenerated Mon Apr 23 15:33:04 CST 2018
     */
    @SelectProvider(type=RevertSqlProvider.class, method="countByExample")
    int countByExample(RevertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table revert
     *
     * @mbggenerated Mon Apr 23 15:33:04 CST 2018
     */
    @DeleteProvider(type=RevertSqlProvider.class, method="deleteByExample")
    int deleteByExample(RevertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table revert
     *
     * @mbggenerated Mon Apr 23 15:33:04 CST 2018
     */
    @Delete({
        "delete from revert",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table revert
     *
     * @mbggenerated Mon Apr 23 15:33:04 CST 2018
     */
    @Insert({
        "insert into revert (id, isRevert, ",
        "revert, uId, ArticleId, ",
        "reviewFloor, revertFloor, ",
        "reviewId, revertCreateTime)",
        "values (#{id,jdbcType=INTEGER}, #{isRevert,jdbcType=INTEGER}, ",
        "#{revert,jdbcType=VARCHAR}, #{uId,jdbcType=INTEGER}, #{articleId,jdbcType=INTEGER}, ",
        "#{reviewFloor,jdbcType=INTEGER}, #{revertFloor,jdbcType=INTEGER}, ",
        "#{reviewId,jdbcType=INTEGER}, #{revertCreateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Revert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table revert
     *
     * @mbggenerated Mon Apr 23 15:33:04 CST 2018
     */
    @InsertProvider(type=RevertSqlProvider.class, method="insertSelective")
    int insertSelective(Revert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table revert
     *
     * @mbggenerated Mon Apr 23 15:33:04 CST 2018
     */
    @SelectProvider(type=RevertSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="isRevert", property="isRevert", jdbcType=JdbcType.INTEGER),
        @Result(column="revert", property="revert", jdbcType=JdbcType.VARCHAR),
        @Result(column="uId", property="uId", jdbcType=JdbcType.INTEGER),
        @Result(column="ArticleId", property="articleId", jdbcType=JdbcType.INTEGER),
        @Result(column="reviewFloor", property="reviewFloor", jdbcType=JdbcType.INTEGER),
        @Result(column="revertFloor", property="revertFloor", jdbcType=JdbcType.INTEGER),
        @Result(column="reviewId", property="reviewId", jdbcType=JdbcType.INTEGER),
        @Result(column="revertCreateTime", property="revertCreateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Revert> selectByExample(RevertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table revert
     *
     * @mbggenerated Mon Apr 23 15:33:04 CST 2018
     */
    @Select({
        "select",
        "id, isRevert, revert, uId, ArticleId, reviewFloor, revertFloor, reviewId, revertCreateTime",
        "from revert",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="isRevert", property="isRevert", jdbcType=JdbcType.INTEGER),
        @Result(column="revert", property="revert", jdbcType=JdbcType.VARCHAR),
        @Result(column="uId", property="uId", jdbcType=JdbcType.INTEGER),
        @Result(column="ArticleId", property="articleId", jdbcType=JdbcType.INTEGER),
        @Result(column="reviewFloor", property="reviewFloor", jdbcType=JdbcType.INTEGER),
        @Result(column="revertFloor", property="revertFloor", jdbcType=JdbcType.INTEGER),
        @Result(column="reviewId", property="reviewId", jdbcType=JdbcType.INTEGER),
        @Result(column="revertCreateTime", property="revertCreateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    Revert selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table revert
     *
     * @mbggenerated Mon Apr 23 15:33:04 CST 2018
     */
    @UpdateProvider(type=RevertSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Revert record, @Param("example") RevertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table revert
     *
     * @mbggenerated Mon Apr 23 15:33:04 CST 2018
     */
    @UpdateProvider(type=RevertSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Revert record, @Param("example") RevertExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table revert
     *
     * @mbggenerated Mon Apr 23 15:33:04 CST 2018
     */
    @UpdateProvider(type=RevertSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Revert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table revert
     *
     * @mbggenerated Mon Apr 23 15:33:04 CST 2018
     */
    @Update({
        "update revert",
        "set isRevert = #{isRevert,jdbcType=INTEGER},",
          "revert = #{revert,jdbcType=VARCHAR},",
          "uId = #{uId,jdbcType=INTEGER},",
          "ArticleId = #{articleId,jdbcType=INTEGER},",
          "reviewFloor = #{reviewFloor,jdbcType=INTEGER},",
          "revertFloor = #{revertFloor,jdbcType=INTEGER},",
          "reviewId = #{reviewId,jdbcType=INTEGER},",
          "revertCreateTime = #{revertCreateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Revert record);
}