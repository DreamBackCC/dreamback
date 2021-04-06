package com.course.poje.test;

import com.course.poje.User;
import com.course.poje.service.UserService;
import com.course.poje.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTestN {
    private UserService userService = new UserServiceImpl();

    @Test
    public void queryUserByname() {
        System.out.println(userService.queryUserByname("admin"));

    }

    @Test
    public void queryUser() {
        for (User queryUser:userService.queryUser()) {
            System.out.println(queryUser);
        }
    }

    @Test
    public void addUser() {
        userService.addUser(new User(null,"asdwqq","sadasd","asdas@qq.com"));
    }

    @Test
    public void deleteUserByname() {
    }

    @Test
    public void updateUser() {
    }
}