package com.mall.dao;

import com.mall.bean.tUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    @Select("select u_id from t_user where u_username = #{tuser.uusername} and u_password = #{tuser.upassword}")
    Integer login(@Param("tuser")tUser tuser);

    @Insert("insert into t_user (u_username,u_phone,u_password,u_email)values(#{tuser.uusername},#{tuser.uphone},#{tuser.upassword},#{tuser.uemail})")
    int register(@Param("tuser")tUser tuser);
}
