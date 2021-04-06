package com.course.poje.test;

import com.course.poje.User;
import com.course.poje.dao.UserDao;
import com.course.poje.dao.imp1.UserDaoImp1;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {
    UserDao userDao = new UserDaoImp1();
    @Test
    public void queryUserByUsername() {

        if(userDao.queryUserByUsername("admin1")==null){
            System.out.println("用户名可用");
        }else{
            System.out.println("用户名已存在");
        }
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        if (userDao.queryUserByUsernameAndPassword("admin","admin") == null) {
            System.out.println("用户名或密码错误，登录失败");
        } else {
            System.out.println("查询成功");
        }
    }

    @Test
    public void saveUser() {

        System.out.println( userDao.saveUser(new User(null,"admin", "123456", "wzg168@qq.com")) );
    }
}