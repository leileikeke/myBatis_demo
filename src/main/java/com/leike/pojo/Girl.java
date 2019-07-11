package com.leike.pojo;

import java.util.Date;

/**
 * @description:
 * @author: leike
 * @date: 2019-06-28 16:48
 */
public class Girl {

    private Long    id;

    private String name;

    private String flower;

    private Date birthday;

    public Girl() {
        super();
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flower='" + flower + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Girl(Long id, String name, String flower, Date birthday) {
        this.id = id;
        this.name = name;
        this.flower = flower;
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
