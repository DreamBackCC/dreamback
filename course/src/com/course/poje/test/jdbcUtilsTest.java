package com.course.poje.test;


import com.course.poje.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

public class jdbcUtilsTest {
    @Test
    /**
     * 每次用完都要释放
     */
    public void testJdbcUtils(){
        for(int i = 0; i < 100; i++){
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
            JdbcUtils.close(connection);
        }

    }
}
