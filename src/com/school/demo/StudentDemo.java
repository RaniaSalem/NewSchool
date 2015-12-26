
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
        
         Parent parent=new Parent();
        Student stud=new Student();
        Student stud1=new Student();
     stud.setAddress("cairo");
     SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
    String test="02/04/2015";
     Date date = fmt.parse(test);
             stud.setDateOfBirth(date);
    stud.setFirstName("mazen");
    stud.setMidName("ahmed");
     stud.setLastName("Taha");
     stud.setGender("female");
     parent.setParentId(3);
     stud.setParent(parent);
     stud.setStudentLevel(2);
     stud.setDateOfBirth(date);
     stud.setPhone("01228546314");
     stud.setStudentId(3);
     StudentDaoImp dao1= new StudentDaoImp();
   dao.insertStudentData(stud,test);
    stud1.setFirstName("asmaa");
    stud1.setMidName("mohamed");
     stud1.setLastName("hosam");
     stud1.setGender("female");
     stud1.setAddress("giza");
     parent.setParentId(3);
     stud1.setParent(parent);
     stud1.setStudentLevel(2);
     stud1.setDateOfBirth(date);
     stud1.setPhone("01228546314");
     stud1.setStudentId(0);
     //dao.updateStudentDtata(stud1, 0);
        // dao.viewStudentData(1);
   //dao.deleteStudentData(1);
    
    }
   
    
    
    
}
