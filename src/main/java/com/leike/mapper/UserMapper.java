package com.leike.mapper;

import com.leike.pojo.User;
import com.leike.pojo.UserWithDetail;
import org.apache.ibatis.annotations.Param;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: leike
 * @date: 2019-07-03 18:00
 */
public interface UserMapper {

    User queryById(@Param("id") Integer id);

    UserWithDetail queryByIdAndDetail(@Param("id") Integer id);


}
