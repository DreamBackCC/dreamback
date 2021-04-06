package com.course.poje.test;

import com.course.poje.User;
import com.course.poje.dao.UserDao;
import com.course.poje.dao.imp1.UserDaoImp1;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTestN {

    private UserDao userDao = new UserDaoImp1();


    @Test
    public void queryUserByname() {
        System.out.println(userDao.queryUserByname("admin"));
    }

    @Test
    public void queryUser() {
        for (User queryUser:userDao.queryUser()){
            System.out.println(queryUser);
        }
    }


    @Test
    public void addUser() {
        userDao.addUser(new User(null,"qweaaaaa","123123","123123@qq.com"));
    }

    @Test
    public void deleteUserByname() {
    }

    @Test
    public void updateUser() {
    }
}