package com.course.poje.service.impl;

import com.course.poje.User;
import com.course.poje.dao.UserDao;
import com.course.poje.dao.imp1.UserDaoImp1;
import com.course.poje.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImp1();
    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        if (userDao.queryUserByUsername(username) == null) {
            // 等于null,说明没查到，没查到表示可用
            return false;
        }
        return true;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUserByname(String username) {
        userDao.deleteUserByname(username);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User queryUserByname(String username) {
        return userDao.queryUserByname(username);
    }

    @Override
    public List<User> queryUser() {
        return userDao.queryUser();
    }
}
