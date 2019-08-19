package com.mall.service;

import com.mall.pojo.tAddress;

import java.util.List;

public interface AddressService {
    List<tAddress> findalladdressbyId(int uid);
    boolean insertaddress(tAddress tAddress);
    boolean deleteaddress(int addressId);
    boolean updateaddress(tAddress tAddress);
}
