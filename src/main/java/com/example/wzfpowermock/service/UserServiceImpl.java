package com.example.wzfpowermock.service;

import com.example.wzfpowermock.entity.User;

public class UserServiceImpl {

    private UserDao userDao;

    public int query(User user){
       return userDao.select(user);
    }

    public void save(User user){
        userDao.insert(user);
    }

}
