package com.mall.service.impl;

import com.mall.bean.tUser;
import com.mall.dao.UserDao;
import com.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceimpl implements UserService {
   @Autowired
   private UserDao userDao;
    @Override
    public boolean login(tUser tuser) {
        List<tUser> list=userDao.login(tuser);
        if(list.size()>0)
        return true;
        return false;
    }

    @Override
    public boolean register(tUser tuser) {
        int count=userDao.register(tuser);
        if(count>0)
            return true;
        return false;
    }
}
