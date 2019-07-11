package com.leike.mapper;

import com.leike.pojo.Addresses;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: leike
 * @date: 2019-07-02 8:58
 */
public interface AddrMapper {

    void insert(Addresses addresses);

    ArrayList<Addresses> queryAll();

    List<Addresses> queryByCityAndcAndCountry(@Param("country") String country, @Param("city") String city);

    void updateAddr(Addresses addresses);

    List<Addresses> queryTestChoose(@Param("country") String country,@Param("city")String city);

    List<Addresses> queryByItems(@Param("list") List<Integer> list);

    List<Addresses> queryByCity(@Param("city") String city);

    Addresses queryByAddrId(@Param("addrId")Integer addrId);
}
