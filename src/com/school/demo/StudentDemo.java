
package com.school.demo;
import com.school.dao.*;
import com.school.pojo.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author toshiba
 */
public class StudentDemo {
    public static void main(String[] args ) throws ParseException{
    
        StudentDaoImp dao= new StudentDaoImp();
            dao.viewStudentData(1);
          Parent parent=new Parent();
        Student stud=new Student();
      stud.setAddress("cairo");
     SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
     Date date = fmt.parse("2013-05-06");
    stud.setDateOfBirth(date);
    stud.setFirstName("Nourhan");
    stud.setMidName("Hosny");
     stud.setLastName("Taha");
     stud.setGender("female");
     parent.setParentId(1);
     stud.setParent(parent);
     stud.setStudentLevel(3);
     stud.setPhone("01228546314");
     stud.setStudentId(1);
     StudentDaoImp dao1= new StudentDaoImp();
     dao.insertStudentData(stud);
    }
   
    
    
    
}
