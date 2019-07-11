package com.leike;

import com.leike.mapper.UserDetailMapper;
import com.leike.mapper.UserMapper;
import com.leike.pojo.User;
import com.leike.pojo.UserDetail;
import com.leike.pojo.UserWithDetail;
import com.leike.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * OO
 *
 * @description:
 * @author: leike
 * @date: 2019-07-03 17:59
 */
public class Test3 {

    @Test
    public void queryUserById() {

        SqlSession sqlSession = MybatisUtil.getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.queryById(1);

        System.out.println(user);

        sqlSession.close();

    }

    @Test
    public void queryByIdAndDetail() {
        SqlSession sqlSession = MybatisUtil.getSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        UserWithDetail lists = mapper.queryByIdAndDetail(1);

        System.out.println(lists);

        sqlSession.close();
    }

}
