package com.course.poje.test;

import com.course.poje.RootUser;
import com.course.poje.service.RootUserService;
import com.course.poje.service.impl.RootUserServicelmpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class RootUserServiceTest {

    RootUserService rootUserService = new RootUserServicelmpl();

    @Test
    public void login() {

        System.out.println(rootUserService.login(new RootUser(null,"root","123")));
    }



}