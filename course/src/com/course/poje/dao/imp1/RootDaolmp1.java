package com.course.poje.dao.imp1;

import com.course.poje.RootUser;
import com.course.poje.dao.RootDao;

public class RootDaolmp1 extends BaseDao implements RootDao {
    //登录
    @Override
    public RootUser queryRootUserByRootnameAndPassword(String rootname, String password) {
        String sql = "select rootname,password from t_root where rootname = ? and password = ?";
        return queryForOne(RootUser.class,sql,rootname,password);
    }
}
