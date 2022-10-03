package com.lzj.service.impl;

import com.lzj.dao.UserMybatisDao;

import com.lzj.domain.Tb_user;
import com.lzj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMybatisDao userMybatisDao;


    public List<Tb_user> findAll() {
        return userMybatisDao.findAll();
    }
}
