package com.school.demo;

import com.school.dao.ManagerDaoImpl;
import com.school.pojo.Manager;
import com.school.pojo.Result;
import com.school.pojo.Student;
import com.school.pojo.StudentAttendance;
import com.school.pojo.Teacher;
import com.school.pojo.TeacherAttendence;

public class ManagerDemo {

    public static void main(String[] args) {
        printAllDataManagerDetails();//getAll Data of Managery
        printManagerDetails(1);//select data in table Manager
        ManagerDaoImpl managerDaoImpl = new ManagerDaoImpl();
        managerDaoImpl.insertDataMan(16, "2015/12/1", "high", "Manager", "Mahmoud", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "High Manager");//insert data(man_id) in table Manager
        managerDaoImpl.removeDataMan(13);//delete data(man_id) in table Manager
        managerDaoImpl.editDataMan(5, "Mahmouddddddd", "2015/12/1", "high", "Manager", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "Manager");//update data(first_name) according to (man_id)in table Manager
//        operation on Teacher
        managerDaoImpl.insertDataTeacher(53, "2015/12/1", "high", "Teacher", "sepci", "Mahmoud", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "Teacher");
        managerDaoImpl.removeDataTeacher(53); 
        managerDaoImpl.editDataTeacher(53, "2015/12/1", "high", "Teacher", "sepcihhhhh", "Mahmoud", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "Teacher");
        printTeacherDetails(53);//print data of Teacher
//Students
        managerDaoImpl.insertDataStudent(113, 1, "Mahmoud", "Mohamed", "Mostafa", "Giza", "Male", "1999/01/01", "0127000000", 1);
        managerDaoImpl.removeDataStudent(112);
        managerDaoImpl.editDataStudent(113, 1, "rrrrrrrr", "Mohamed", "Mostafa", "Giza", "Male", "1999/01/01", "0127", 1);
        printStudentDetails(113);
        printResultsDetails(1, 1);//view Result
        printStudentAttendanceDetails(1, 1);//view Attendance of Students
        printTeacherAttendanceDetails(1, 1);//view Attendance of Teacher
    }

//select data in table Manager
    private static void printManagerDetails(int manId) {
        ManagerDaoImpl managerDaoImpl = new ManagerDaoImpl();
        Manager manager = managerDaoImpl.viewManagerScreen(manId);
        System.out.println("m.getFirstName() :" + manager.getFirstName());//select data(FirstName) in table Manager
        System.out.println("m.getAddress() :" + manager.getAddress());//select data(FirstName) in table Manager
        System.out.println("m.getGender() :" + manager.getGender());//select data(FirstName) in table Manager
        System.out.println("m.getLastName() :" + manager.getLastName());//select data(FirstName) in table Manager
        System.out.println("m.getMidName() :" + manager.getMidName());//select data(FirstName) in table Manager
        System.out.println("m.getLastName() :" + manager.getLastName());//select data(FirstName) in table Manager
        System.out.println("m.getPhone() :" + manager.getPhone());//select data(FirstName) in table Manager
        System.out.println("m.getPosition() :" + manager.getPosition());//select data(FirstName) in table Manager
        System.out.println("m.getQualification() :" + manager.getQualification());//select data(FirstName) in table Manager
        System.out.println("m.getType() :" + manager.getType());//select data(FirstName) in table Manager
        System.out.println("m.getDateOfBirth() :" + manager.getDateOfBirth());//select data(FirstName) in table Manager
        System.out.println("mm.getDateOfHire() :" + manager.getDateOfHire());//select data(FirstName) in table Manager
        System.out.println("mm.getManId() :" + manager.getManId());//select data(FirstName) in table Manager   
    }

    private static void printAllDataManagerDetails() {
        ManagerDaoImpl managerDaoImpl = new ManagerDaoImpl();
        Manager manager = managerDaoImpl.getAllManager();
        System.out.println("m.getFirstName() :" + manager.getFirstName());//select data(FirstName) in table Manager
        System.out.println("m.getAddress() :" + manager.getAddress());//select data(FirstName) in table Manager
        System.out.println("m.getGender() :" + manager.getGender());//select data(FirstName) in table Manager
        System.out.println("m.getLastName() :" + manager.getLastName());//select data(FirstName) in table Manager
        System.out.println("m.getMidName() :" + manager.getMidName());//select data(FirstName) in table Manager
        System.out.println("m.getLastName() :" + manager.getLastName());//select data(FirstName) in table Manager
        System.out.println("m.getPhone() :" + manager.getPhone());//select data(FirstName) in table Manager
        System.out.println("m.getPosition() :" + manager.getPosition());//select data(FirstName) in table Manager
        System.out.println("m.getQualification() :" + manager.getQualification());//select data(FirstName) in table Manager
        System.out.println("m.getType() :" + manager.getType());//select data(FirstName) in table Manager
        System.out.println("m.getDateOfBirth() :" + manager.getDateOfBirth());//select data(FirstName) in table Manager
        System.out.println("mm.getDateOfHire() :" + manager.getDateOfHire());//select data(FirstName) in table Manager
        System.out.println("mm.getManId() :" + manager.getManId());//select data(FirstName) in table Manager   
    }

    private static void printTeacherDetails(int teachId) {
        ManagerDaoImpl managerDaoImpl = new ManagerDaoImpl();
        Teacher teacher = managerDaoImpl.viewTeacherData(teachId);
        System.out.println("getFirstName() :" + teacher.getFirstName());//select data(FirstName) in table teacher
        System.out.println("getAddress() :" + teacher.getAddress());//select data(FirstName) in table teacher
        System.out.println("getGender() :" + teacher.getGender());//select data(FirstName) in table teacher
        System.out.println("getLastName() :" + teacher.getLastName());//select data(FirstName) in table teacher
        System.out.println("getMidName() :" + teacher.getMidName());//select data(FirstName) in table teacher
        System.out.println("getLastName() :" + teacher.getLastName());//select data(FirstName) in table teacher
        System.out.println("getPhone() :" + teacher.getPhone());//select data(FirstName) in table teacher
        System.out.println("getPosition() :" + teacher.getLastPosition());//select data(FirstName) in table teacher
        System.out.println("getQualification() :" + teacher.getQualification());//select data(FirstName) in table teacher
        System.out.println("getType() :" + teacher.getType());//select data(FirstName) in table teacher
        System.out.println("getDateOfBirth() :" + teacher.getDateOfBirth());//select data(FirstName) in table teacher
        System.out.println("getDateOfHire() :" + teacher.getDateOfHire());//select data(FirstName) in table teacher
        System.out.println("getTeacherID() :" + teacher.getTeacherID());//select data(FirstName) in table teacher   
        System.out.println("getSpecialization() :" + teacher.getSpecialization());//select data(FirstName) in table teacher 
    }

    private static void printStudentDetails(int studId) {
        ManagerDaoImpl managerDaoImpl = new ManagerDaoImpl();
        Student student = managerDaoImpl.viewStudentData(studId);
        System.out.println("getFirstName() :" + student.getFirstName());//select data(FirstName) in table teacher
        System.out.println("getAddress() :" + student.getAddress());//select data(FirstName) in table teacher
        System.out.println("getGender() :" + student.getGender());//select data(FirstName) in table teacher
        System.out.println("getLastName() :" + student.getLastName());//select data(FirstName) in table teacher
        System.out.println("getMidName() :" + student.getMidName());//select data(FirstName) in table teacher
        System.out.println("getLastName() :" + student.getLastName());//select data(FirstName) in table teacher
        System.out.println("getPhone() :" + student.getPhone());//select data(FirstName) in table teacher
        if (student.getParent() != null) {
            System.out.println("getParent() :" + student.getParent().getParentId());//select data(FirstName) in table teacher
        }
        System.out.println("getDateOfBirth() :" + student.getDateOfBirth());//select data(FirstName) in table teacher
        System.out.println("getStudentId() :" + student.getStudentId());//select data(FirstName) in table teacher   
        System.out.println("getStudentLevel() :" + student.getStudentLevel());//select data(FirstName) in table teacher 
    }

    private static void printResultsDetails(int quesId, int studentId) {
        ManagerDaoImpl managerDaoImpl = new ManagerDaoImpl();
        Result result = managerDaoImpl.viewResultData(quesId, studentId);
        System.out.println("getGrade() :" + result.getGrade());//select data(FirstName) in table teacher
        if (result.getStudent() != null && result.getQuestion() != null) {
            System.out.println("getStudentId() :" + result.getStudent().getStudentId());//select data(FirstName) in table teacher
            System.out.println("getQuesId() :" + result.getQuestion().getQuesId());//select data(FirstName) in table teacher
        }
    }

    private static void printStudentAttendanceDetails(int attendId, int studentId) {
        ManagerDaoImpl managerDaoImpl = new ManagerDaoImpl();
        StudentAttendance studentAttendance = managerDaoImpl.viewAttendanceOfStudentData(attendId, studentId);
        System.out.println("getAttendanceId() :" + studentAttendance.getAttendanceId());//select data(FirstName) in table teacher
        System.out.println("getAttendanceDate() :" + studentAttendance.getAttendanceDate());//select data(FirstName) in table teacher
        System.out.println("getStatus() :" + studentAttendance.getStatus());//select data(FirstName) in table teacher
        if (studentAttendance.getStudent() != null) {
            System.out.println("getStudentId() :" + studentAttendance.getStudent().getStudentId());//select data(FirstName) in table teacher 
        }
    }

    private static void printTeacherAttendanceDetails(int attendId, int teachId) {
        ManagerDaoImpl managerDaoImpl = new ManagerDaoImpl();
        TeacherAttendence teacherAttendence = managerDaoImpl.viewAttendanceOfTeacherData(attendId, teachId);
        System.out.println("getAttendanceId() :" + teacherAttendence.getAttenendceID());//select data(FirstName) in table teacher
        System.out.println("getAttendanceDate() :" + teacherAttendence.getAttendenceDate());//select data(FirstName) in table teacher
        System.out.println("getStatus() :" + teacherAttendence.getStatus());//select data(FirstName) in table teacher
        if (teacherAttendence.getTeacher() != null) {
            System.out.println("getTeacherID() :" + teacherAttendence.getTeacher().getTeacherID());//select data(FirstName) in table teacher 
        }
    }
}
