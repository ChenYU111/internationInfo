package com.internation.info.dao;

import com.internation.info.model.Role;
import com.internation.info.model.RoleExample;
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

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Feb 27 13:53:48 CST 2018
     */
    @SelectProvider(type=RoleSqlProvider.class, method="countByExample")
    int countByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Feb 27 13:53:48 CST 2018
     */
    @DeleteProvider(type=RoleSqlProvider.class, method="deleteByExample")
    int deleteByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Feb 27 13:53:48 CST 2018
     */
    @Delete({
        "delete from role",
        "where roleId = #{roleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Feb 27 13:53:48 CST 2018
     */
    @Insert({
        "insert into role (roleId, roleName, ",
        "roleDescription)",
        "values (#{roleId,jdbcType=INTEGER}, #{roleName,jdbcType=VARCHAR}, ",
        "#{roleDescription,jdbcType=VARCHAR})"
    })
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Feb 27 13:53:48 CST 2018
     */
    @InsertProvider(type=RoleSqlProvider.class, method="insertSelective")
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Feb 27 13:53:48 CST 2018
     */
    @SelectProvider(type=RoleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="roleId", property="roleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleName", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleDescription", property="roleDescription", jdbcType=JdbcType.VARCHAR)
    })
    List<Role> selectByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Feb 27 13:53:48 CST 2018
     */
    @Select({
        "select",
        "roleId, roleName, roleDescription",
        "from role",
        "where roleId = #{roleId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="roleId", property="roleId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roleName", property="roleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleDescription", property="roleDescription", jdbcType=JdbcType.VARCHAR)
    })
    Role selectByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Feb 27 13:53:48 CST 2018
     */
    @UpdateProvider(type=RoleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Feb 27 13:53:48 CST 2018
     */
    @UpdateProvider(type=RoleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Feb 27 13:53:48 CST 2018
     */
    @UpdateProvider(type=RoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Tue Feb 27 13:53:48 CST 2018
     */
    @Update({
        "update role",
        "set roleName = #{roleName,jdbcType=VARCHAR},",
          "roleDescription = #{roleDescription,jdbcType=VARCHAR}",
        "where roleId = #{roleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Role record);
}