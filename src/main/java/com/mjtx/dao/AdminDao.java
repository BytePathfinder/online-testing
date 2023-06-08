package com.mjtx.dao;

import com.mjtx.entity.Admin;
import com.mjtx.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 徐彪 xubiao.anxin@gmail.com
 * @version V1.0 2021/2/24 22:26
 */
public class AdminDao {
    public boolean login(Admin admin) {
        JdbcUtils utility = new JdbcUtils();
        Connection con = null;
        PreparedStatement pds = null;
        ResultSet rs = null;
        try {
            con = utility.connection();
            String sql = "select * from admin where username=? and password=?";
            pds = con.prepareStatement(sql);
            pds.setString(1, admin.getUsername());
            pds.setString(2, admin.getPassword());
            rs = pds.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            utility.resourceClose(rs, pds, con);
        }
        return false;
    }
}
