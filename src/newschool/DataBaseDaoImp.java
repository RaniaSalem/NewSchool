/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Noura
 */
public class DataBaseDaoImp implements DataBaseDao {
    DataBasePojo mypojo;
 Connection con;
 Statement stmt;
 ResultSet rs;
  public DataBaseDaoImp(){
  
  this.con=mypojo.getCon();
  this.stmt=mypojo.getStmt();
  this.rs=mypojo.getRs();
  }
public void openConnection(){

 try {  
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost/ School?" + 
                                   "user=root&password=123";
   
       this.con=DriverManager.getConnection(connectionUrl);
} catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());
        } catch (ClassNotFoundException cE) {
            System.out.println("Class Not Found Exception: "+ cE.toString());
        }

}

public void closeConnection(){
try{
this.stmt.close();
}catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());
        } 
}

public void updateQuery( String sql){
    try{
 this.stmt.executeUpdate(sql);
    }catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());
        } 
}

public  ResultSet excuteeQuery(String sql){
 try{
this.rs=this.stmt.executeQuery(sql);
  
 }catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());
        } 
    return this.rs;   
}
}
