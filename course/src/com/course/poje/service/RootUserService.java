package com.course.poje.service;

import com.course.poje.RootUser;

public interface RootUserService {
    /**
     * 登录
     * @param rootUser
     * @return 如果返回null，说明登录失败，返回有值，是登录成功
     */
    public RootUser login(RootUser rootUser);
}
