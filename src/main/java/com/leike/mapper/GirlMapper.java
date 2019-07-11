package com.leike.mapper;

import com.leike.pojo.Girl;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.Map;

/**
 * @description:
 * @author: leike
 * @date: 2019-06-28 16:50
 */
public interface GirlMapper {

    int insert(Girl girl);

    Girl queryByid(Long id);

    Girl queryByname(String name);

    /**
     * @param使用注解绑定sql
     * @param name
     * @param flower
     * @return
     */
    Girl queryBynameaAndFlower(@Param("name") String name, @Param("flower") String flower);

    ArrayList<Girl> queryAll();

    Girl queryAllByNameAndFlower(Girl girl);

    Girl queryAllByNameAndFlower2(Map<String,Object> map);

//    Girl queryByAB(@Param("a") A a, @Param("b") B b);

    void delete(@Param("id") Long id);


}
