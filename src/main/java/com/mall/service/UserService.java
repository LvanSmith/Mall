package com.mall.service;

import com.mall.bean.tUser;

public interface UserService {
    Integer login(tUser tuser);
    boolean register(tUser tuser);
}
