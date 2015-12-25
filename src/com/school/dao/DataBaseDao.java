package com.school.dao;

import java.sql.Connection;
import java.sql.ResultSet;

public interface DataBaseDao {
    
    public Connection openConnection(); 
    public void closeConnection(Connection conn);
    public void updateQuery(String sql,Connection conn);
    public ResultSet excuteQuery(String sql,Connection conn);
}
