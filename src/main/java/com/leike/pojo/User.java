package com.leike.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: leike
 * @date: 2019-07-03 17:54
 */
public class User implements Serializable {

    private Integer id;

    private String phone;

    private String password;

    private Date createDate;

    private Integer status;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", createDate=" + createDate +
                ", status=" + status +
                '}';
    }

    public User() {
        super();
    }

    public User(Integer id, String phone, String password, Date createDate, Integer status) {
        this.id = id;
        this.phone = phone;
        this.password = password;
        this.createDate = createDate;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
