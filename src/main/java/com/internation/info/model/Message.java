package com.internation.info.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Repository;
@Repository
public class Message implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.id
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.sender
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    private String sender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.receiver
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    private String receiver;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.content
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message.sendTime
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    private Date sendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.id
     *
     * @return the value of message.id
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.id
     *
     * @param id the value for message.id
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.sender
     *
     * @return the value of message.sender
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public String getSender() {
        return sender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.sender
     *
     * @param sender the value for message.sender
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.receiver
     *
     * @return the value of message.receiver
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.receiver
     *
     * @param receiver the value for message.receiver
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.content
     *
     * @return the value of message.content
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.content
     *
     * @param content the value for message.content
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message.sendTime
     *
     * @return the value of message.sendTime
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message.sendTime
     *
     * @param sendTime the value for message.sendTime
     *
     * @mbggenerated Sat Apr 28 22:20:51 CST 2018
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
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
        sb.append(", sender=").append(sender);
        sb.append(", receiver=").append(receiver);
        sb.append(", content=").append(content);
        sb.append(", sendTime=").append(sendTime);
        sb.append("]");
        return sb.toString();
    }
}