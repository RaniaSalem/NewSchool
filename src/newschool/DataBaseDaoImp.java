
package newschool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseDaoImp implements DataBaseDao {

    DataBasePojo mypojo;
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;

//    public DataBaseDaoImp() {
//
////        this.con = mypojo.getCon();
////        this.stmt = mypojo.getStmt();
//        this.rs = mypojo.getRs();
//    }

    private void openConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost/ School?user=root&password=123";
            con= mypojo.getCon();
            con = DriverManager.getConnection(connectionUrl);
//            PreparedStatement prst =this.con.prepareStatement(""); 
//            ResultSet rs = prst.executeQuery();
//            while (rs.next() ) {
//                rs.getInt(0);
//                rs.getInt(1);
//            }
        } catch (SQLException e) {
            //System.out.println("SQL Exception: " + e.toString());
            e.printStackTrace();
        } catch (ClassNotFoundException cE) {
            //System.out.println("Class Not Found Exception: " + cE.toString());
            cE.printStackTrace();
        }

    }

    private void closeConnection() {
        try {
            pstmt = mypojo.getPstmt();
            pstmt.close();
        } catch (SQLException e) {
            //System.out.println("SQL Exception: " + e.toString());
            e.printStackTrace();
        }
    }

    @Override
    public void updateQuery(String sql) {
        openConnection();
        if (sql == null) {
            return;
        }
        try {
            pstmt = mypojo.getPstmt();
            pstmt.executeUpdate(sql);
        } catch (SQLException e) {
            //System.out.println("SQL Exception: " + e.toString());
            e.printStackTrace();
        }
        closeConnection();
    }

    @Override
    public ResultSet excuteQuery(String sql) {
        openConnection();
        if (sql == null) {
            return null;
        }
        try {
            pstmt = mypojo.getPstmt();
            rs=mypojo.getRs();
            rs = pstmt.executeQuery(sql);
        } catch (SQLException e) {
            //System.out.println("SQL Exception: " + e.toString());
            e.printStackTrace();
        }
        closeConnection();
        return this.rs;
    }
}
