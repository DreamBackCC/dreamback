package com.course.poje.test;

import com.course.poje.User;
import com.course.poje.service.UserService;
import com.course.poje.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void registUser() {
        userService.registUser(new User(null, "abc", "123", "abc@qq.com"));
    }

    @Test
    public void login() {
        System.out.println( userService.login(new User(null, "admin", "admin", null)) );
    }

    @Test
    public void existsUsername() {
        if (userService.existsUsername("admin")) {
            System.out.println("用户名已存在！");
        } else {
            System.out.println("用户名可用！");
        }
    }



}