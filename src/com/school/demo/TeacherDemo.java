
package com.school.demo;
import com.school.dao.TeacherDaoImp;
import com.school.pojo.Teacher;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
/**
 *
 * @author toshiba
 */
public class TeacherDemo {
    public static void main(String[] args) {
      displayAllTeacher();
      // TeacherDaoImp   teacherDaoImp =new TeacherDaoImp();
      //teacherDaoImp.deleteTeacher(2);
    }
    
    private static void displayTeacher() {
        TeacherDaoImp   teacherDaoImp =new TeacherDaoImp();
     Teacher teacher=  teacherDaoImp.getTeacher(1);
     print(teacher);
    }
    private static void print(Teacher teacher) {
        System.out.println("TeacherID:" + teacher.getTeacherID());
        System.out.println("FirstName:" + teacher.getFirstName());
        System.out.println("MidName:" + teacher.getMidName());
        System.out.println("LastName:" + teacher.getLastName());
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String DOB = format.format(teacher.getDateOfBirth());
        String DOH = format.format(teacher.getDateOfHire());
        System.out.println("dateOfBirth:" + DOB);
        System.out.println("DATE_OF_HIRE:" + DOH);
        System.out.println("Address:" + teacher.getAddress());
        System.out.println("Gender:" + teacher.getGender());
        System.out.println("Phone:" + teacher.getPhone());
        System.out.println("Type:" + teacher.getType());
        System.out.println("LastPosition:" + teacher.getLastPosition());
        System.out.println("Qualification:" + teacher.getQualification());
        System.out.println("Specialization:" + teacher.getSpecialization());
    }
    
    private static void displayAllTeacher(){
    TeacherDaoImp   teacherDaoImp =new TeacherDaoImp();
    List < Teacher> teacheres;
    
    teacheres=teacherDaoImp.getAllTeacher();
    
        for (Teacher teachere : teacheres) {
            print(teachere);
      
}
    }
}