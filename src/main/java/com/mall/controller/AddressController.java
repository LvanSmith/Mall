package com.mall.controller;

import com.mall.pojo.tAddress;
import com.mall.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @GetMapping("/findalladdressbyId")
    @ResponseBody
    public List<tAddress> findalladdressbyId(@RequestParam("uid") int uid){
        List<tAddress> tAddresses = addressService.findalladdressbyId(uid);
        if(tAddresses.size()>0)
        return tAddresses;
        return null;
    }
    @PostMapping("/insertaddress")
    @ResponseBody
    public boolean insertaddress(@RequestBody tAddress tAddress){

            return addressService.insertaddress(tAddress);

    }
    @GetMapping("/deleteaddress")
    @ResponseBody
    public boolean deleteaddress(@RequestParam("addressId") int addressId){
        System.out.println(addressId);
        return addressService.deleteaddress(addressId);

    }
    @PostMapping("/updateaddress")
    @ResponseBody
    public boolean updateaddress(@RequestBody tAddress tAddress){

        return addressService.updateaddress(tAddress);

    }
}
