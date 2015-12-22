/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschool;

/**
 *
 * @author Noura
 */
import java.sql.ResultSet;
import java.util.ArrayList;

public interface DataBaseDao {

    public void openConnection(); 

    public void closeConnection();

    public void updateQuery(String sql);

    public ResultSet excuteeQuery(String sql);
}
