package com.lzj.service.impl;

import com.lzj.dao.BookDao;

import com.lzj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bookService")
public class BookServiceImpl implements BookService {
    @Autowired //开启自动装配模式，也就是可以不要构造方法
//    删除业务层中使用new的方式创建dao对象
    private BookDao bookDao;
//        private BookDao bookDao = new BookDaoImpl();

    public void save() {
        System.out.println("book service save....");
        bookDao.save();
    }
    //提供set方法

//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
}
