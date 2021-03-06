package com.internation.info.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Repository;
@Repository
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.id
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.name
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.desc
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    private String desc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.avatar
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.userId
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.createdTime
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.member
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    private String member;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table group
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */

    

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.id
     *
     * @return the value of group.id
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.id
     *
     * @param id the value for group.id
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.name
     *
     * @return the value of group.name
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.name
     *
     * @param name the value for group.name
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.desc
     *
     * @return the value of group.desc
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.desc
     *
     * @param desc the value for group.desc
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.avatar
     *
     * @return the value of group.avatar
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.avatar
     *
     * @param avatar the value for group.avatar
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.userId
     *
     * @return the value of group.userId
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.userId
     *
     * @param userId the value for group.userId
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.createdTime
     *
     * @return the value of group.createdTime
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.createdTime
     *
     * @param createdTime the value for group.createdTime
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.member
     *
     * @return the value of group.member
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public String getMember() {
        return member;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.member
     *
     * @param member the value for group.member
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public void setMember(String member) {
        this.member = member;
    }

    public Group(Integer userId) {
		super();
		this.userId = userId;
	}

	/*public Group(Integer id) {
		super();
		this.id = id;
	}*/

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", desc=").append(desc);
        sb.append(", avatar=").append(avatar);
        sb.append(", userId=").append(userId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", member=").append(member);
        sb.append("]");
        return sb.toString();
    }

	public Group() {
		super();
	}
}