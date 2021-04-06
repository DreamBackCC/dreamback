package com.course.poje.dao.imp1;

import com.course.poje.User;
import com.course.poje.dao.UserDao;

import java.util.List;

public class UserDaoImp1 extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) {
        String sql = "select id ,username,password,email from t_user where username = ?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select id ,username,password,email from t_user where username = ? and password = ?";
        return queryForOne(User.class,sql,username,password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into t_user(username,password,email) value(?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public int addUser(User user) {

        String sql = "insert into t_user(username,password,email) value(?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public int deleteUserByname(String username) {

        String sql = "delete from t_user where username = ?";
        return update(sql,username);
    }

    @Override
    public int updateUser(User user) {
        String sql = "update t_user set username=?,password=? where username = ?";
        return update(sql,user.getUsername(),user.getPassword(),user.getUsername());
    }

    @Override
    public User queryUserByname(String username) {
        String sql = "select id ,username ,password ,email from t_user where username = ?";
        return queryForOne(User.class,sql,username);
    }


    @Override
    public List<User> queryUser() {
        String sql = "select id ,username ,password from t_user";
        return queryForList(User.class,sql);
    }


}
