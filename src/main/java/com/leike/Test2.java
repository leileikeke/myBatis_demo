package com.leike;

import com.leike.mapper.AddrMapper;
import com.leike.pojo.Addresses;
import com.leike.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: leike
 * @date: 2019-07-02 9:03
 */
public class Test2 {

    @Test
    public void insert() {
        SqlSession sqlSession = MybatisUtil.getSession();
        AddrMapper mapper = sqlSession.getMapper(AddrMapper.class);
        Addresses addresses = new Addresses();
        for (int i=0;i<2;i++){
        addresses.setCity("city2");
        addresses.setCountry("country2");
        addresses.setState("state12");
        addresses.setStreet("street2");
        addresses.setZip("zip2");
        mapper.insert(addresses);

        sqlSession.commit();

        }
        sqlSession.close();
    }

    @Test
    public void queryAll() {

        SqlSession sqlsession = MybatisUtil.getSession();
        AddrMapper mapper = sqlsession.getMapper(AddrMapper.class);

        ArrayList<Addresses> addresses = mapper.queryAll();

        for (Addresses a : addresses) {
            System.out.println(a.toString());
        }

        sqlsession.commit();
        sqlsession.close();
    }

    @Test
    public void queryByCityAndcAndCountry(){

        SqlSession sqlSession = MybatisUtil.getSession();

        AddrMapper mapper = sqlSession.getMapper(AddrMapper.class);

        List<Addresses> addressesList = mapper.queryByCityAndcAndCountry("country1", null);

        for (Addresses a:addressesList){
            System.out.println(a.toString());
        }

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updata(){

        SqlSession sqlSession = MybatisUtil.getSession();

        AddrMapper mapper = sqlSession.getMapper(AddrMapper.class);

        Addresses addresses = new Addresses();
        addresses.setAddrId(1);
        addresses.setZip("432709");
        addresses.setStreet("广水");
        addresses.setCountry("武汉");
        addresses.setState("湖北");
        addresses.setCity("中国");

        mapper.updateAddr(addresses);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryTestChoose(){

        SqlSession sqlSession = MybatisUtil.getSession();

        AddrMapper mapper = sqlSession.getMapper(AddrMapper.class);

        List<Addresses> addressesList = mapper.queryTestChoose("", "");
        for (Addresses a:addressesList){
            System.out.println(a.toString());
        }

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void queryByItems(){

        SqlSession sqlSession = MybatisUtil.getSession();

        AddrMapper mapper = sqlSession.getMapper(AddrMapper.class);

        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);

        List<Addresses> addressesList = mapper.queryByItems(lists);

        for (Addresses a:addressesList){
            System.out.println(a.toString());
        }

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void queryByCity(){

        /**
         * [模糊查询解决方案一] 在应用程序层面加入%_%;
         *
         * [模糊查询解决方案二]  通过mysql函数concat("%",#{city},"%")
         *
         * [模糊查询解决方案三]  通过<bind/>标签,对变量重新绑定
         */

        SqlSession sqlSession = MybatisUtil.getSession();
        AddrMapper mapper = sqlSession.getMapper(AddrMapper.class);

        List<Addresses> addressesList = mapper.queryByCity("中");

        for (Addresses a:addressesList){
            System.out.println(a.toString());
        }

        sqlSession.close();
    }

    @Test
    public void queryByAddrId(){
        SqlSession sqlSession = MybatisUtil.getSession();
        AddrMapper mapper = sqlSession.getMapper(AddrMapper.class);

        Addresses addresses = mapper.queryByAddrId(10);

        System.out.println(addresses.toString());
        sqlSession.close();
    }



    @Test
    public void test2Cache(){
        SqlSession sqlsession = MybatisUtil.getSession();
        SqlSession sqlsession2 = MybatisUtil.getSession();
        AddrMapper mapper = sqlsession.getMapper(AddrMapper.class);
        AddrMapper mapper2 = sqlsession2.getMapper(AddrMapper.class);

        mapper.queryByAddrId(1);
        sqlsession.close();
        mapper2.queryByAddrId(1);
        sqlsession2.close();



    }
}
