package com.lzj.dao;

import com.lzj.domain.Tb_user;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMybatisDao {
    @Select("select * from tb_user")
    List<Tb_user> findAll();
}
