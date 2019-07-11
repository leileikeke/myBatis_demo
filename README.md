# myBatis_demo
mybatis j笔记
#哔哩哔哩ssm视频随笔
# 缓存

- 一级缓存是会话(session)级别的,言下之意就是要在同一个会话(session)当中才有效
- 如果开启了二级缓存
- 先去二级缓存当中尝试命中
- 如果也无法命中
- 尝试去一级缓存中命中
- 还不命中,再去数据库查询

## 缓存失效的方式

  ``` xml
  1. 在一个查询会话(session)中,进行增删改操作
  ```

  ```
  2. 调用session.clearCache(); 强制清除缓存
  ```



## 开启二级缓存的步骤

  ```	xml
  mybatis配置文件:
  	<setting name="cacheEnabled" value="true"/>
  ```

# mybatis映射



## 处理多变联查

​	mybatis对于处理简单的单表查询一般使用resulttype就可以解决

​	对于多变联合查询往往都需要使用resultmap进行详细描述,

​	告诉mybatis怎么封装的问题

## 多表联查处理映射---一对一关系



```xml
三种映射方式<resultMap>
```

 - 配置文件支持继承  <父类>

   ``` xml
       <resultMap id="DatabaseTemp" type="com.leike.pojo.UserWithDetail">
           <result property="id" column="uid"/>
           <result property="password" column="password"/>
           <result property="phone" column="phone"/>
           <result property="createDate" column="createDate"/>
           <result property="status" column="status"/>
       </resultMap>
   ```

   

  - 方式一    官方推荐

  - <association property="userDetail" javaType="com.leike.pojo.UserDetail">

    ``` xml
    <resultMap id="UserWithDetailMap" extends="DatabaseTemp" type="com.leike.pojo.UserWithDetail">
            <!--已经继承了-->
            <association property="userDetail" javaType="com.leike.pojo.UserDetail">
                <id property="id" column="udId"/>
                <result property="address" column="address"/>
                <result property="cid" column="cid"/>
            </association>
        </resultMap>
    ```

    

- 方式二 连缀点法

  ``` xml
      <!--第二种方法   连缀写法-->
      <resultMap id="UserWithDetailMap1" extends="DatabaseTemp" type="com.leike.pojo.UserWithDetail">
          <result property="userDetail.id" column="udId"/>
          <result property="userDetail.address" column="address"/>
          <result property="userDetail.cid" column="cid"/>
      </resultMap>
  ```

  

- 方式三 分布查询

``` xml
    <resultMap id="UserWithDetailMap2" extends="DatabaseTemp" type="com.leike.pojo.UserWithDetail" >
        <association property="userDetail" select="com.leike.mapper.UserDetailMapper.queryByUid" column="uid"></association>
    </resultMap>
```





## 多表联查关系映射---多对多关系

- [x] 标签< collection > < ofType >

![关系映射多对多](C:\Users\leike\Documents\我的md笔记\images\关系映射多对多.png)





