package com.course.poje.web;

import com.course.poje.User;
import com.course.poje.service.UserService;
import com.course.poje.service.impl.UserServiceImpl;
import com.course.poje.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SelectUserServlet extends BaseServlet {

    private UserService userService = new UserServiceImpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = WebUtils.copyParamToBean(req.getParameterMap(),new User());

        userService.addUser(user);

///manager/selectUser?action=list
        req.getRequestDispatcher("/manager/selectUser?action=list").forward(req,resp);


    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
    protected void uodate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过service查询全部图书
        List<User> users = userService.queryUser();
        //把全部数据保存到request中
        req.setAttribute("users",users);
        //请求转发到页面
        req.getRequestDispatcher("/page/manager/user_manager.jsp").forward(req,resp);
    }
}
