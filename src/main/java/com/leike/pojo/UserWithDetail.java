package com.leike.pojo;

import java.io.Serializable;

/**
 * @description:
 * @author: leike
 * @date: 2019-07-03 18:11
 */
public class UserWithDetail extends User implements Serializable {

    private UserDetail userDetail;

    public UserWithDetail() {

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", phone='" + getPhone()+ '\'' +
                ", password='" + getPassword() + '\'' +
                ", createDate=" + getCreateDate() +
                ", status=" + getStatus() +
                '}'+"UserDetail{" +
                "id=" + userDetail.getId() +
                ", address='" + userDetail.getAddress() + '\'' +
                ", cid='" + userDetail.getCid() + '\'' +
                '}';
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }
}
