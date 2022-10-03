package com.lzj.factory;

import com.lzj.dao.UserDao;
import com.lzj.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
