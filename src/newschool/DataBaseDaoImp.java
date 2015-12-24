
package newschool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 

public class DataBaseDaoImp implements DataBaseDao {

    DataBasePojo mypojo; 
    PreparedStatement pstmt;
    ResultSet rs;

//    public DataBaseDaoImp() {
//
////        this.con = mypojo.getCon();
////        this.stmt = mypojo.getStmt();
//        this.rs = mypojo.getRs();
//    }

    private Connection openConnection() {
        Connection con = null;    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost/ School?user=root&password=123";
            con= mypojo.getCon();
            con = DriverManager.getConnection(connectionUrl);
            PreparedStatement prst =con.prepareStatement(""); 
            ResultSet rs = prst.executeQuery();
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
        return con;
    }

    private void closeConnection(PreparedStatement ps) {
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
        Connection conn = openConnection();
        PreparedStatement ps = null;
        if (sql == null) {
            return;
        }
        try {
            ps=conn.prepareStatement(sql);        
//            pstmt = mypojo.getPstmt();
            ps.executeUpdate(sql);
        } catch (SQLException e) {
            //System.out.println("SQL Exception: " + e.toString());
            e.printStackTrace();
        }
        closeConnection(ps);
    }

    @Override
    public ResultSet excuteQuery(String sql) {
        Connection conn = openConnection();
        PreparedStatement ps = null;
        if (sql == null) {
            return null;
        }
        try {
            ps=conn.prepareStatement(sql);   
//            pstmt = mypojo.getPstmt();
//            rs=mypojo.getRs();
            rs = ps.executeQuery(sql);
        } catch (SQLException e) {
            //System.out.println("SQL Exception: " + e.toString());
            e.printStackTrace();
        }
        closeConnection(ps);
        return rs;
    }
}
