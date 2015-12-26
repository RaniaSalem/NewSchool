package com.school.demo;

import com.school.dao.ManagerDaoImpl;

public class ManagerDemo {

    public static void main(String[] args) {
        //Manager Operation
        ManagerDaoImpl managerDaoImpl = new ManagerDaoImpl();
        managerDaoImpl.getAllManager();//Print All Data in Manager
        managerDaoImpl.viewManagerScreen(11);//select data in table Manager
        managerDaoImpl.insertDataMan(16, "2015/12/1", "high", "Manager", "Mahmoud", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "High Manager");//insert data(man_id) in table Manager
        managerDaoImpl.removeDataMan(13);//delete data(man_id) in table Manager
        managerDaoImpl.editDataMan(5, "Mahmouddddddd", "2015/12/1", "high", "Manager", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "Manager");//update data(first_name) according to (man_id)in table Manager
        // operation on Teacher 
        managerDaoImpl.insertDataTeacher(53, "2015/12/1", "high", "Teacher", "sepci", "Mahmoud", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "Teacher");
        managerDaoImpl.removeDataTeacher(53);
        managerDaoImpl.editDataTeacher(53, "2015/12/1", "high", "Teacher", "sepcihhhhh", "Mahmoud", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "Teacher");
        managerDaoImpl.viewTeacherData(3);//print data of Teacher
        //Students
        managerDaoImpl.insertDataStudent(113, 1, "Mahmoud", "Mohamed", "Mostafa", "Giza", "Male", "1999/01/01", "0127000000", 1);
        managerDaoImpl.removeDataStudent(112);
        managerDaoImpl.editDataStudent(113, 1, "rrrrrrrr", "Mohamed", "Mostafa", "Giza", "Male", "1999/01/01", "0127", 1);
        managerDaoImpl.viewStudentData(113);
        // Operation on Result
        managerDaoImpl.viewResultData(1, 1);//view Result
        // Operation on Attendance Of Student
        managerDaoImpl.viewAttendanceOfStudentData(1, 1);//view Attendance of Students
        // Operation on Attendance Of Teacher
        managerDaoImpl.viewAttendanceOfTeacherData(1, 1);//view Attendance of Teacher

    }
}
