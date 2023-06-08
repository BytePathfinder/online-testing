package com.mjtx.utils;

import java.sql.*;

/**
 * @author 徐彪 xubiao.anxin@gmail.com
 * @version V1.0 2021/2/22 20:14
 */
public class JdbcUtils {
    public Connection connection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/online_testing?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT", "root", "qywm123456");
    }

    public void resourceClose(ResultSet rs, PreparedStatement ps, Connection con) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
