package com.course.poje.dao;

import com.course.poje.RootUser;

public interface RootDao {

    /**
     * 根据用户名和密码
     * @param rootname
     * @param password
     * @return
     */
    public RootUser queryRootUserByRootnameAndPassword(String rootname, String password);

}
