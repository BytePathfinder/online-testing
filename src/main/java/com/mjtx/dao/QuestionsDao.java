package com.mjtx.dao;

import com.mjtx.entity.Questions;
import com.mjtx.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 徐彪 xubiao.anxin@gmail.com
 * @version V1.0 2021/2/27 18:02
 */
public class QuestionsDao {
    JdbcUtils jdbcUtils = new JdbcUtils();

    public int add(Questions questions) {
        int add = 0;
        Connection con = null;
        PreparedStatement pds = null;
        try {
            con = jdbcUtils.connection();
            String sql = "insert into questions values (null,?,?,?,?,?,?)";
            pds = con.prepareStatement(sql);
            pds.setString(1, questions.getQuestionContent());
            pds.setString(2, questions.getOptionA());
            pds.setString(3, questions.getOptionB());
            pds.setString(4, questions.getOptionC());
            pds.setString(5, questions.getOptionD());
            pds.setString(6, questions.getAnswer());
            add = pds.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.resourceClose(null, pds, con);
        }
        return add;
    }

    public List<Questions> select() {
        Connection con = null;
        PreparedStatement pds = null;
        ResultSet rs = null;
        List<Questions> list = new ArrayList<>();
        try {
            con = jdbcUtils.connection();
            String sql = "select * from questions";
            pds = con.prepareStatement(sql);
            rs = pds.executeQuery();

            while (rs.next()) {
                int questionid = rs.getInt("questionid");
                String questionscontent = rs.getString("questionscontent");
                String optionA = rs.getString("optionA");
                String optionB = rs.getString("optionB");
                String optionC = rs.getString("optionC");
                String optionD = rs.getString("optionD");
                String answer = rs.getString("answer");
                Questions questions = new Questions(questionid, questionscontent, optionA, optionB, optionC, optionD, answer);
                list.add(questions);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.resourceClose(rs, pds, con);
        }
        return list;
    }

    public int update(Questions question) {
        Connection con = null;
        PreparedStatement ps = null;
        int update = 0;
        try {
            con = jdbcUtils.connection();
            String sql = "update questions set questionscontent=?,optionA=?,optionB=?,optionC=?,optionD=?,answer=? where questionid=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, question.getQuestionContent());
            ps.setString(2, question.getOptionA());
            ps.setString(3, question.getOptionB());
            ps.setString(4, question.getOptionC());
            ps.setString(5, question.getOptionD());
            ps.setString(6, question.getAnswer());
            ps.setInt(7, question.getQuestionId());
            update = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.resourceClose(null, ps, con);
        }
        return update;
    }

    public int delete(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        int delete = 0;
        try {
            con = jdbcUtils.connection();
            String sql = "delete from questions where questionid=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            delete = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.resourceClose(null, ps, con);
        }
        return delete;
    }

    public List<Questions> selectRand(){
        Connection con = null;
        PreparedStatement pds = null;
        ResultSet rs = null;
        List<Questions> list = new ArrayList<>();
        try {
            con = jdbcUtils.connection();
            String sql = "select * from questions order by rand() limit 0,10";
            pds = con.prepareStatement(sql);
            rs = pds.executeQuery();

            while (rs.next()) {
                int questionid = rs.getInt("questionid");
                String questionscontent = rs.getString("questionscontent");
                String optionA = rs.getString("optionA");
                String optionB = rs.getString("optionB");
                String optionC = rs.getString("optionC");
                String optionD = rs.getString("optionD");
                String answer = rs.getString("answer");
                Questions questions = new Questions(questionid, questionscontent, optionA, optionB, optionC, optionD, answer);
                list.add(questions);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            jdbcUtils.resourceClose(rs, pds, con);
        }
        return list;
    }

}
