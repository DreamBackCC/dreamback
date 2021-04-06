package com.course.poje.web;

import com.course.poje.User;
import com.course.poje.dao.imp1.UserDaoImp1;
import com.course.poje.service.UserService;
import com.course.poje.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {


    /**
     * 处理登录的功能
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // 调用 userService.login()登录处理业务
        User loginUser = userService.login(new User(null, username, password, null));
        // 如果等于null,说明登录 失败!
        if (loginUser == null) {

            //把错误信息回显,保存到request域中
            req.setAttribute("msg","用户名或密码错误");
            req.setAttribute("username",username);
            //   跳回登录页面
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } else {
            // 登录 成功
            //跳到成功页面login_success.html
            req.getRequestDispatcher("/page/user/login_success.jsp").forward(req, resp);
        }

    }

    /**
     * 处理注册的功能
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
//        String code = req.getParameter("code");

//        2、检查 验证码是否正确  === 写死,要求验证码为:abcde
//        if ("abcde".equalsIgnoreCase(code)) {
//        3、检查 用户名是否可用
        if (userService.existsUsername(username)) {
            System.out.println("用户名[" + username + "]已存在!");

            //把回显信息存到requset中
            req.setAttribute("msg","用户名已存在");
            req.setAttribute("username",username);
            req.setAttribute("email",email);
//        跳回注册页面
            req.getRequestDispatcher("regist.jsp").forward(req, resp);
        } else {
            //      可用
//                调用Sservice保存到数据库
            userService.registUser(new User(null, username, password, email));

            //
//        跳到注册成功页面 regist_uccess.jsp
            req.getRequestDispatcher("/page/user/regist_success.jsp").forward(req, resp);
        }
//        }
//        else {
//            System.out.println("验证码[" + code + "]错误");
//            req.getRequestDispatcher("/course/pages/user/regist.jsp").forward(req, resp);
//        }

    }

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if("login".equals(action)){
            login(req,resp);
        }else if("regist".equals(action)){
            regist(req,resp);
        }
    }
}
