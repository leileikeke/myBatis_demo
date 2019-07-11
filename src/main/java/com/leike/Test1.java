package com.leike;


import com.leike.mapper.GirlMapper;
import com.leike.pojo.Girl;
import com.leike.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @description:
 * @author: leike
 * @date: 2019-06-28 17:00
 */
public class Test1 {

    @Test
    public void insert(){

        SqlSession sqlSession = MybatisUtil.getSession();

        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);

        Girl girl = new Girl();
        girl.setName("lin");
        girl.setFlower("hua");
        girl.setBirthday(new Date());

        mapper.insert(girl);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void queryId(){

        SqlSession sqlSession = MybatisUtil.getSession();

        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);

        Girl girl = mapper.queryByid(1L);
        System.out.println("名字："+girl.getName()+"   喜欢的flower："+girl.getFlower());
        sqlSession.close();

    }

    @Test
    public void queryName(){
        SqlSession session = MybatisUtil.getSession();

        GirlMapper mapper = session.getMapper(GirlMapper.class);

        Girl girl = mapper.queryByname("leike1");
        System.out.println("名字："+girl.getName()+"   喜欢的flower："+girl.getFlower());

        session.close();
    }

    @Test
    public void queryBynameAndByFlower(){
        SqlSession session = MybatisUtil.getSession();

        GirlMapper mapper = session.getMapper(GirlMapper.class);

        Girl girl = mapper.queryBynameaAndFlower("leike1", "leike2");
        System.out.println(girl.getBirthday());
        session.close();
    }

    @Test
    public void queryAll(){
        SqlSession session = MybatisUtil.getSession();

        GirlMapper mapper = session.getMapper(GirlMapper.class);

        ArrayList<Girl> girls = mapper.queryAll();

        for(Girl girl:girls){
            System.out.println(girl.toString());
        }
        session.close();
    }


    @Test
    public void queryGirl(){
        SqlSession session = MybatisUtil.getSession();

        GirlMapper mapper = session.getMapper(GirlMapper.class);

        Girl girl = new Girl();
        girl.setName("lin");
        girl.setFlower("hua");
        Girl girl1 = mapper.queryAllByNameAndFlower(girl);
        System.out.println(girl1.toString());
        session.close();
    }

    @Test
    public void queryGir2(){
        SqlSession session = MybatisUtil.getSession();

        GirlMapper mapper = session.getMapper(GirlMapper.class);

        Map<String, Object> girlMap = new HashMap<>();
        girlMap.put("name","lin");
        girlMap.put("flower","hua");
        Girl girl1 = mapper.queryAllByNameAndFlower2(girlMap);
        System.out.println(girl1.toString());
        session.close();
    }

    @Test
    public void queryByAB(){
        SqlSession session = MybatisUtil.getSession();

        GirlMapper mapper = session.getMapper(GirlMapper.class);

//        A a = new A();
//        a.setName("lin");
//        B b = new B();
//        b.setFlower("hua");

//        Girl girl1 = mapper.queryByAB(a,b);
//        System.out.println(girl1.toString());
        session.close();
    }

    @Test
    public void delete(){

        SqlSession sqlSession = MybatisUtil.getSession();

        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);
        mapper.delete(8L);

        sqlSession.commit();
        sqlSession.close();

    }
}
