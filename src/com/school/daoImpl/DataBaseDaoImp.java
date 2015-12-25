package com.school.daoImpl;

import com.school.dao.DataBaseDao;
import com.school.pojo.DataBasePojo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseDaoImp implements DataBaseDao {

    DataBasePojo mypojo;
    PreparedStatement pstmt;
    ResultSet rs;

    /**
     *
     * @return
     */
    public Connection openConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost/schoolmanagmentsystem";
            conn = DriverManager.getConnection(connectionUrl, "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void closeConnection(Connection conn) {
        if (conn == null) {
            return;
        }
        try {
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateQuery(String sql, Connection conn) {
        if (conn == null) {
            return;
        }

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Duplicate Key please try new Key ");
            e.printStackTrace();
        }
    }

    public ResultSet excuteQuery(String sql, Connection conn) {
        if (conn == null) {
            return null;
        }
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rs;
    }


}
