package com.course.poje.service.impl;

import com.course.poje.RootUser;
import com.course.poje.dao.RootDao;
import com.course.poje.dao.imp1.RootDaolmp1;
import com.course.poje.service.RootUserService;

public class RootUserServicelmpl implements RootUserService{
    private RootDao rootDao = new RootDaolmp1();

    @Override
    public RootUser login(RootUser rootUser) {
        return rootDao.queryRootUserByRootnameAndPassword(rootUser.getRootname(),rootUser.getPassword());
    }
}
