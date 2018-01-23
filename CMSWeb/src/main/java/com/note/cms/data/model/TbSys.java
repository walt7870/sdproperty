package com.note.cms.data.model;

import java.io.Serializable;
import java.util.Date;

public class TbSys implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys.id
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys.keyname
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    private String keyname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys.value
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys.comment
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys.name
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys.update_time
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_sys.update_user_id
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    private String updateUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public TbSys(Integer id, String keyname, String value, String comment, String name, Date updateTime, String updateUserId) {
        this.id = id;
        this.keyname = keyname;
        this.value = value;
        this.comment = comment;
        this.name = name;
        this.updateTime = updateTime;
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_sys
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public TbSys() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys.id
     *
     * @return the value of tb_sys.id
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys.id
     *
     * @param id the value for tb_sys.id
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys.keyname
     *
     * @return the value of tb_sys.keyname
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public String getKeyname() {
        return keyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys.keyname
     *
     * @param keyname the value for tb_sys.keyname
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public void setKeyname(String keyname) {
        this.keyname = keyname == null ? null : keyname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys.value
     *
     * @return the value of tb_sys.value
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys.value
     *
     * @param value the value for tb_sys.value
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys.comment
     *
     * @return the value of tb_sys.comment
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys.comment
     *
     * @param comment the value for tb_sys.comment
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys.name
     *
     * @return the value of tb_sys.name
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys.name
     *
     * @param name the value for tb_sys.name
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys.update_time
     *
     * @return the value of tb_sys.update_time
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys.update_time
     *
     * @param updateTime the value for tb_sys.update_time
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_sys.update_user_id
     *
     * @return the value of tb_sys.update_user_id
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_sys.update_user_id
     *
     * @param updateUserId the value for tb_sys.update_user_id
     *
     * @mbg.generated Wed Jul 19 18:07:04 CST 2017
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }
}