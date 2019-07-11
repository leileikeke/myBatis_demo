package com.leike.pojo;

import java.io.Serializable;

/**
 * @description:
 * @author: leike
 * @date: 2019-07-02 8:56
 */
public class Addresses implements Serializable{

    private Integer addrId;

    private String country;

    private String city;

    private String state;

    private String street;

    public Addresses(Integer addrId, String country, String city, String state, String street, String zip) {
        this.addrId = addrId;
        this.country = country;
        this.city = city;
        this.state = state;
        this.street = street;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Addresses{" +
                "addrId=" + addrId +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

    public Addresses() {
        super();
    }

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    private String zip;
}
