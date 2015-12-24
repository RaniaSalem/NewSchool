package newschool;

import java.sql.ResultSet;

public interface DataBaseDao {
    
//    public void openConnection(); 
//    public void closeConnection();
    public void updateQuery(String sql);
    public ResultSet excuteQuery(String sql);
}
