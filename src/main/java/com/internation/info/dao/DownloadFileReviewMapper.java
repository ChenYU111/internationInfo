package com.internation.info.dao;

import com.internation.info.model.DownloadFileReview;
import com.internation.info.model.DownloadFileReviewExample;
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

public interface DownloadFileReviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table downloadfilereview
     *
     * @mbggenerated Sat Apr 14 19:23:48 CST 2018
     */
    @SelectProvider(type=DownloadFileReviewSqlProvider.class, method="countByExample")
    int countByExample(DownloadFileReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table downloadfilereview
     *
     * @mbggenerated Sat Apr 14 19:23:48 CST 2018
     */
    @DeleteProvider(type=DownloadFileReviewSqlProvider.class, method="deleteByExample")
    int deleteByExample(DownloadFileReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table downloadfilereview
     *
     * @mbggenerated Sat Apr 14 19:23:48 CST 2018
     */
    @Delete({
        "delete from downloadfilereview",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table downloadfilereview
     *
     * @mbggenerated Sat Apr 14 19:23:48 CST 2018
     */
    @Insert({
        "insert into downloadfilereview (id, reviewContent, ",
        "uId, reviewTime, ",
        "flooer)",
        "values (#{id,jdbcType=INTEGER}, #{reviewContent,jdbcType=VARCHAR}, ",
        "#{uId,jdbcType=INTEGER}, #{reviewTime,jdbcType=TIMESTAMP}, ",
        "#{flooer,jdbcType=INTEGER})"
    })
    int insert(DownloadFileReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table downloadfilereview
     *
     * @mbggenerated Sat Apr 14 19:23:48 CST 2018
     */
    @InsertProvider(type=DownloadFileReviewSqlProvider.class, method="insertSelective")
    int insertSelective(DownloadFileReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table downloadfilereview
     *
     * @mbggenerated Sat Apr 14 19:23:48 CST 2018
     */
    @SelectProvider(type=DownloadFileReviewSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="reviewContent", property="reviewContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="uId", property="uId", jdbcType=JdbcType.INTEGER),
        @Result(column="reviewTime", property="reviewTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="flooer", property="flooer", jdbcType=JdbcType.INTEGER)
    })
    List<DownloadFileReview> selectByExample(DownloadFileReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table downloadfilereview
     *
     * @mbggenerated Sat Apr 14 19:23:48 CST 2018
     */
    @Select({
        "select",
        "id, reviewContent, uId, reviewTime, flooer",
        "from downloadfilereview",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="reviewContent", property="reviewContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="uId", property="uId", jdbcType=JdbcType.INTEGER),
        @Result(column="reviewTime", property="reviewTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="flooer", property="flooer", jdbcType=JdbcType.INTEGER)
    })
    DownloadFileReview selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table downloadfilereview
     *
     * @mbggenerated Sat Apr 14 19:23:48 CST 2018
     */
    @UpdateProvider(type=DownloadFileReviewSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DownloadFileReview record, @Param("example") DownloadFileReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table downloadfilereview
     *
     * @mbggenerated Sat Apr 14 19:23:48 CST 2018
     */
    @UpdateProvider(type=DownloadFileReviewSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") DownloadFileReview record, @Param("example") DownloadFileReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table downloadfilereview
     *
     * @mbggenerated Sat Apr 14 19:23:48 CST 2018
     */
    @UpdateProvider(type=DownloadFileReviewSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DownloadFileReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table downloadfilereview
     *
     * @mbggenerated Sat Apr 14 19:23:48 CST 2018
     */
    @Update({
        "update downloadfilereview",
        "set reviewContent = #{reviewContent,jdbcType=VARCHAR},",
          "uId = #{uId,jdbcType=INTEGER},",
          "reviewTime = #{reviewTime,jdbcType=TIMESTAMP},",
          "flooer = #{flooer,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DownloadFileReview record);
}