
package com.school.dao;

import com.school.pojo.Parent;
import com.school.pojo.Student;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author toshiba
 */
public class StudentDaoImp extends DataBaseDaoImp implements StudentDao {
    DataBaseDaoImp dataBaseDaoImpl ;
    @Override
    public void insertStudentData(Student student,Object dateofbirth){
     Connection conn = openConnection();
     
      String sql = "insert into students (STUD_ID,LEVEL_ID,`STUD_FIRST_NAME`,`STUD_MID_NAME`,`LAST_NAME`,`ADDRESS`,`GENDER`,`PHONE`,PARENT_ID)"
                + "values (" +student.getStudentId() + ",'" + student.getStudentLevel() + "','" +student.getFirstName() + "','" +student.getMidName()  + "','" +student.getLastName() + "','" + student.getAddress() + "','" + student.getGender()+ "','"  +student.getPhone() + "','" +student.getParent().getParentId()+  "')";
       updateQuery(sql, conn);
        closeConnection(conn);
    }

@Override
      public void updateStudentDtata(Student student,int studentId){
        String sql="update students set STUD_ID= "+student.getStudentId()+", LEVEL_ID= " + student.getStudentLevel()+ ",STUD_FIRST_NAME='"+student.getFirstName()+"', STUD_MID_NAME='"+student.getMidName()+"',LAST_NAME='"+ student.getLastName()+"',ADDRESS='"+student.getAddress()+"', GENDER='"+student.getGender()+"',PHONE='"+student.getPhone()+"',PARENT_ID="+student.getParent().getParentId()+" where STUD_ID="+studentId;
        Connection conn=openConnection();
          updateQuery(sql, conn);
          closeConnection(conn);
      }
@Override
   public void  deleteStudentData(int studentId){
        Connection conn = openConnection();
         String sql = "delete from students where STUD_ID= " + studentId;
           updateQuery(sql, conn);
           closeConnection(conn);
   }
@Override
   public Student viewStudentData(int student){
          Student studentt =new Student();
          Parent parent=new Parent();
        Connection conn = openConnection();
        String sql="select STUD_ID,LEVEL_ID,`STUD_FIRST_NAME`,`STUD_MID_NAME`,`LAST_NAME`,`ADDRESS`,`GENDER`,`DATE_OF_BIRTH`,`PHONE`,PARENT_ID " +
                " from students where STUD_ID="+student;
       ResultSet rs=excuteQuery(sql, conn);
        try {
            while (rs.next()) {
             studentt.setStudentId(rs.getInt(1));
             studentt.setStudentLevel(rs.getInt(2));
             studentt.setFirstName(rs.getString(3));
             studentt.setMidName(rs.getString(4));
             studentt.setLastName(rs.getString(5));
             studentt.setAddress(rs.getString(6));
             studentt.setGender(rs.getString(7));
             studentt.setDateOfBirth(rs.getDate(8));
             studentt.setPhone(rs.getString(9));
             parent.setParentId(rs.getInt(10));
             studentt.setParent(parent);
            printStudentData(studentt);
          }
            closeConnection(conn);
        } catch (Exception ex) {
        }
        return studentt;
   }
   private void printStudentData(Student studentt)
   {
System.out.println(""+studentt.getStudentId());
           System.out.println("getStudentId:"+studentt.getStudentId()); 
           System.out.println("getFirstName:"+studentt.getFirstName()); 
           System.out.println("getMidName:"+studentt.getMidName());  
           System.out.println("getLastName:"+studentt.getLastName()); 
           System.out.println("getAddress:"+studentt.getAddress()); 
            System.out.println("getGender:"+studentt.getGender()); 
           System.out.println("getDateOfBirth:"+studentt.getDateOfBirth());  
           System.out.println("getPhone:"+studentt.getPhone()); 
           if (studentt.getParent() !=null) {
           System.out.println("getParentId:"+studentt.getParent().getParentId());   
       }
          
   }
}
