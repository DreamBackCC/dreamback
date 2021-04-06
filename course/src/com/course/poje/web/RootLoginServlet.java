package com.course.poje.web;

import com.course.poje.RootUser;
import com.course.poje.service.RootUserService;
import com.course.poje.service.impl.RootUserServicelmpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RootLoginServlet extends HttpServlet {
    private RootUserService rootUserService = new RootUserServicelmpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数
        String rootname = req.getParameter("rootname");
        String password = req.getParameter("password");
        //调用.login()处理
        RootUser rootLogin = rootUserService.login(new RootUser(null,rootname,password));
        //如果等于null，登录失败
        if(rootLogin==null){
            req.getRequestDispatcher("rootLogin.html").forward(req,resp);
        }else{
            req.getRequestDispatcher("admin.html").forward(req, resp);
        }
    }
}
