package com.internation.info.dao;

import com.internation.info.model.MyCollection;
import com.internation.info.model.MyCollectionExample;
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

public interface MyCollectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_collection
     *
     * @mbggenerated Tue Apr 10 15:11:12 CST 2018
     */
    @SelectProvider(type=MyCollectionSqlProvider.class, method="countByExample")
    int countByExample(MyCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_collection
     *
     * @mbggenerated Tue Apr 10 15:11:12 CST 2018
     */
    @DeleteProvider(type=MyCollectionSqlProvider.class, method="deleteByExample")
    int deleteByExample(MyCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_collection
     *
     * @mbggenerated Tue Apr 10 15:11:12 CST 2018
     */
    @Delete({
        "delete from my_collection",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_collection
     *
     * @mbggenerated Tue Apr 10 15:11:12 CST 2018
     */
    @Insert({
        "insert into my_collection (id, uId, ",
        "isUser, myAttentionUserId, ",
        "isQuestion, myCollectionOnArticleId, ",
        "myCollectionOnQuestionId, isArticle)",
        "values (#{id,jdbcType=INTEGER}, #{uId,jdbcType=INTEGER}, ",
        "#{isUser,jdbcType=INTEGER}, #{myAttentionUserId,jdbcType=INTEGER}, ",
        "#{isQuestion,jdbcType=INTEGER}, #{myCollectionOnArticleId,jdbcType=INTEGER}, ",
        "#{myCollectionOnQuestionId,jdbcType=INTEGER}, #{isArticle,jdbcType=INTEGER})"
    })
    int insert(MyCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_collection
     *
     * @mbggenerated Tue Apr 10 15:11:12 CST 2018
     */
    @InsertProvider(type=MyCollectionSqlProvider.class, method="insertSelective")
    int insertSelective(MyCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_collection
     *
     * @mbggenerated Tue Apr 10 15:11:12 CST 2018
     */
    @SelectProvider(type=MyCollectionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="uId", property="uId", jdbcType=JdbcType.INTEGER),
        @Result(column="isUser", property="isUser", jdbcType=JdbcType.INTEGER),
        @Result(column="myAttentionUserId", property="myAttentionUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="isQuestion", property="isQuestion", jdbcType=JdbcType.INTEGER),
        @Result(column="myCollectionOnArticleId", property="myCollectionOnArticleId", jdbcType=JdbcType.INTEGER),
        @Result(column="myCollectionOnQuestionId", property="myCollectionOnQuestionId", jdbcType=JdbcType.INTEGER),
        @Result(column="isArticle", property="isArticle", jdbcType=JdbcType.INTEGER)
    })
    List<MyCollection> selectByExample(MyCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_collection
     *
     * @mbggenerated Tue Apr 10 15:11:12 CST 2018
     */
    @Select({
        "select",
        "id, uId, isUser, myAttentionUserId, isQuestion, myCollectionOnArticleId, myCollectionOnQuestionId, ",
        "isArticle",
        "from my_collection",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="uId", property="uId", jdbcType=JdbcType.INTEGER),
        @Result(column="isUser", property="isUser", jdbcType=JdbcType.INTEGER),
        @Result(column="myAttentionUserId", property="myAttentionUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="isQuestion", property="isQuestion", jdbcType=JdbcType.INTEGER),
        @Result(column="myCollectionOnArticleId", property="myCollectionOnArticleId", jdbcType=JdbcType.INTEGER),
        @Result(column="myCollectionOnQuestionId", property="myCollectionOnQuestionId", jdbcType=JdbcType.INTEGER),
        @Result(column="isArticle", property="isArticle", jdbcType=JdbcType.INTEGER)
    })
    MyCollection selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_collection
     *
     * @mbggenerated Tue Apr 10 15:11:12 CST 2018
     */
    @UpdateProvider(type=MyCollectionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MyCollection record, @Param("example") MyCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_collection
     *
     * @mbggenerated Tue Apr 10 15:11:12 CST 2018
     */
    @UpdateProvider(type=MyCollectionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MyCollection record, @Param("example") MyCollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_collection
     *
     * @mbggenerated Tue Apr 10 15:11:12 CST 2018
     */
    @UpdateProvider(type=MyCollectionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MyCollection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_collection
     *
     * @mbggenerated Tue Apr 10 15:11:12 CST 2018
     */
    @Update({
        "update my_collection",
        "set uId = #{uId,jdbcType=INTEGER},",
          "isUser = #{isUser,jdbcType=INTEGER},",
          "myAttentionUserId = #{myAttentionUserId,jdbcType=INTEGER},",
          "isQuestion = #{isQuestion,jdbcType=INTEGER},",
          "myCollectionOnArticleId = #{myCollectionOnArticleId,jdbcType=INTEGER},",
          "myCollectionOnQuestionId = #{myCollectionOnQuestionId,jdbcType=INTEGER},",
          "isArticle = #{isArticle,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MyCollection record);
}