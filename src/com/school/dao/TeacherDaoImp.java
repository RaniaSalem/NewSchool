package com.school.dao;

import com.school.dao.TeacherDao;
import com.school.pojo.Teacher;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toshiba
 */
public class TeacherDaoImp {

    public static void main(String[] args) {
        displayTeacher();

    }

    private static void displayTeacher() {

        TeacherDao teacherDao = new TeacherDao();
         TeacherDao teacherDao2 = new TeacherDao();
         teacherDao2.deleteTeacher(2);
        try {
            Teacher teacher = teacherDao.getTeacher(1);
            if (teacher != null) {
                print(teacher);
            } else {
                System.out.println("No Teacher With this ID");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
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
}
