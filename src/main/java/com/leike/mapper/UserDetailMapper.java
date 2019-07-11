package com.leike.mapper;

import com.leike.pojo.UserDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: leike
 * @date: 2019-07-04 10:11
 */
public interface UserDetailMapper {

    UserDetail queryByUid(@Param("uid") Integer uid);

}
