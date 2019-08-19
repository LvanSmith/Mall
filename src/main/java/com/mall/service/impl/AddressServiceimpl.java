package com.mall.service.impl;

import com.mall.pojo.tAddress;
import com.mall.dao.AddressDao;
import com.mall.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceimpl implements AddressService {
    @Autowired
    AddressDao addressdao;
    @Override
    public List<tAddress> findalladdressbyId(int uid) {
        return addressdao.findalladdressbyId(uid);
    }

    @Override
    public boolean insertaddress(tAddress tAddress) {
        if(addressdao.insertaddress(tAddress)>0)
        return true;
        return false;
    }

    @Override
    public boolean deleteaddress(int addressId) {
        if(addressdao.deleteaddress(addressId)>0)
            return true;
        return false;
    }

    @Override
    public boolean updateaddress(tAddress tAddress) {
        if(addressdao.updateaddress(tAddress)>0)
            return true;
        return false;
    }
}
