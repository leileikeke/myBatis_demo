package com.leike.pojo;

import java.io.Serializable;

/**
 * @description:
 * @author: leike
 * @date: 2019-07-03 17:55
 */
public class UserDetail implements Serializable {

    private Integer id;

    private Integer uid;

    private String address;

    private String cid;

    @Override
    public String toString() {
        return "UserDetail{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", cid='" + cid + '\'' +
                '}';
    }

    public UserDetail() {
        super();
    }

    public UserDetail(Integer id, Integer uid, String address, String cid) {
        this.id = id;
        this.uid = uid;
        this.address = address;
        this.cid = cid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}
