package com.internation.info.model;

import java.io.Serializable;

public class User_Role implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.id
     *
     * @mbggenerated Tue Mar 27 10:23:40 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.user_Id
     *
     * @mbggenerated Tue Mar 27 10:23:40 CST 2018
     */
    private Integer user_Id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.role_Id
     *
     * @mbggenerated Tue Mar 27 10:23:40 CST 2018
     */
    private Integer role_Id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_role
     *
     * @mbggenerated Tue Mar 27 10:23:40 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.id
     *
     * @return the value of user_role.id
     *
     * @mbggenerated Tue Mar 27 10:23:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.id
     *
     * @param id the value for user_role.id
     *
     * @mbggenerated Tue Mar 27 10:23:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.user_Id
     *
     * @return the value of user_role.user_Id
     *
     * @mbggenerated Tue Mar 27 10:23:40 CST 2018
     */
    public Integer getUser_Id() {
        return user_Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.user_Id
     *
     * @param user_Id the value for user_role.user_Id
     *
     * @mbggenerated Tue Mar 27 10:23:40 CST 2018
     */
    public void setUser_Id(Integer user_Id) {
        this.user_Id = user_Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.role_Id
     *
     * @return the value of user_role.role_Id
     *
     * @mbggenerated Tue Mar 27 10:23:40 CST 2018
     */
    public Integer getRole_Id() {
        return role_Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.role_Id
     *
     * @param role_Id the value for user_role.role_Id
     *
     * @mbggenerated Tue Mar 27 10:23:40 CST 2018
     */
    public void setRole_Id(Integer role_Id) {
        this.role_Id = role_Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Tue Mar 27 10:23:40 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_Id=").append(user_Id);
        sb.append(", role_Id=").append(role_Id);
        sb.append("]");
        return sb.toString();
    }
}