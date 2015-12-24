package newschool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManagerDaoImpl {

    public static void main(String[] args) {
        ManagerDaoImpl m = new ManagerDaoImpl();
        Manager mm = m.testViewMan(1);
//        System.out.println("m.getFirstName() :" + mm.getFirstName());
    }

    public Manager testViewMan(Object manId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Manager m = new Manager();
        m.setManId((int) manId);
        String sql = "select FIRST_NAME from Manager where MAN_ID = " + manId;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost/schoolmanagmentsystem";
            conn = DriverManager.getConnection(connectionUrl, "root", "");
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("rs.next():" + rs.next());
            System.out.println("newschool:" + rs.getString(1));
            while (!rs.next()) {
                System.out.println("Test");
                System.out.println("newschool::" + rs.getString(1));
                m.setFirstName(rs.getString(1));
                
                System.out.println("newschool.ManagerDaoImpl.testViewMan()" + rs.getString(1));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
                conn.close();

            } catch (SQLException ex) {
                Logger.getLogger(ManagerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return m;
    }

}
