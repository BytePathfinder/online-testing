package com.mjtx.dao;

import com.mjtx.entity.User;
import com.mjtx.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 徐彪 xubiao.anxin@gmail.com
 * @version V1.0 2021/2/22 19:58
 */
public class UserDao {
    JdbcUtils util = new JdbcUtils();

    public int add(User user) {
        String sql = "insert into user (userid,username,password,sex,email) values (null,?,?,?,?)";
        Connection con = null;
        PreparedStatement ps = null;
        int result = 0;
        try {
            con = util.connection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getSex());
            ps.setString(4, user.getEmail());
            result = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            util.resourceClose(null, ps, con);
        }
        return result;
    }

    public int delete(User user) {
        String sql = "delete from user where userid=?";
        Connection con = null;
        PreparedStatement ps = null;
        int result = 0;
        try {
            con = util.connection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, user.getUserid());
            result = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            util.resourceClose(null, ps, con);
        }
        return result;
    }

    public int update(User user) {
        String sql = "update user set username=?,password=?,sex=?,email=? where userid=?";
        Connection con = null;
        PreparedStatement ps = null;
        int result = 0;
        try {
            con = util.connection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getSex());
            ps.setString(4, user.getEmail());
            ps.setInt(5, user.getUserid());
            result = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            util.resourceClose(null, ps, con);
        }
        return result;
    }

    public List<User> select() {
        List<User> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pds = null;
        ResultSet rs = null;
        try {
            con = util.connection();
            String sql = "select *from user";
            pds = con.prepareStatement(sql);
            rs = pds.executeQuery();
            while (rs.next()) {
                String userid = rs.getString("userid");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String sex = rs.getString("sex");
                String email = rs.getString("email");
                User user = new User(Integer.valueOf(userid), username, password, sex, email);
                list.add(user);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            util.resourceClose(rs, pds, con);
        }
        return list;
    }
}
