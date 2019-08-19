package com.mall.dao;

import com.mall.pojo.tAddress;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface AddressDao {
    @Select("select * from t_address where u_id=#{uid}")
    List<tAddress> findalladdressbyId(int uid);
    @Insert("insert into t_address(name,province,city,area,address,phone,postalcode,u_id)values(#{tAddress.name}," +
            "#{tAddress.province},#{tAddress.city},#{tAddress.area},#{tAddress.address},#{tAddress.phone},#{tAddress.postalcode},#{tAddress.uid})")
    int insertaddress(@Param("tAddress")tAddress tAddress);

    @Delete("delete from t_address where addressId=#{addressId}")
    int deleteaddress(@Param("addressId")int addressId);

    @Update("update t_address set name=#{tAddress.name},province=#{tAddress.province},city=#{tAddress.city},area=#{tAddress.area}," +
            "address=#{tAddress.address},phone=#{tAddress.phone},postalcode=#{tAddress.postalcode} where addressId=#{tAddress.addressId}")
    int updateaddress(@Param("tAddress")tAddress tAddress);

}
