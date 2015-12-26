package com.school.dao;

import com.school.pojo.Manager;
import com.school.pojo.Parent;
import com.school.pojo.Result;
import com.school.pojo.Student;
import com.school.pojo.StudentAttendance;
import com.school.pojo.Teacher;
import com.school.pojo.TeacherAttendence;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class ManagerDaoImpl extends DataBaseDaoImp implements ManagerDao {

    @Override
    public void insertDataMan(Object manId, Object dateOfHire, Object qualification, Object postion, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type) {
        Connection conn = openConnection();
        String sql = "insert into Manager (MAN_ID,`DATE_OF_HIRE`,`QUALIFICATION`,`POSITION`,`FIRST_NAME`,`MID_NAME`,`LAST_NAME`,`ADDRESS`,`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`TYPE`) "
                + " values (" + manId + ",'" + dateOfHire + "','" + qualification + "','" + postion + "','" + firstName + "','" + midName + "','" + lastName + "','" + address + "','" + gender + "','" + dateBirth + "','" + phone + "','" + type + "')";
        updateQuery(sql, conn);
        closeConnection(conn);
    }

    @Override
    public void removeDataMan(Object manId) {
        Connection conn = openConnection();
        String sql = "delete from Manager where MAN_ID = " + manId;
        updateQuery(sql, conn);
        closeConnection(conn);
    }

    @Override
    public void editDataMan(Object manId, Object firstName, Object dateOfHire, Object qualification, Object postion, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type) {
        Connection conn = openConnection();
        String sql = "update Manager set FIRST_NAME = '" + firstName + "' , `DATE_OF_HIRE`='" + dateOfHire + "' , `QUALIFICATION` = '" + qualification + "' , `POSITION`='" + postion + "' , `MID_NAME`='" + midName + "' , `LAST_NAME`='" + lastName + "' , `ADDRESS`='" + address + "' , `GENDER`='" + gender + "' , `DATE_OF_BIRTH`='" + dateBirth + "' , `PHONE`='" + phone + "' , `TYPE`='" + type + "'  where MAN_ID = " + manId;
        System.out.println("newschool.ManagerDaoImpl.editDataMan():" + sql);
        updateQuery(sql, conn);
        closeConnection(conn);
    }

    @Override
    public Manager viewManagerScreen(int manId) {
        Connection conn = openConnection();
//        String sql1 = "select FIRST_NAME from Manager where MAN_ID = " + manId;
        String sql = "select `DATE_OF_HIRE`,`QUALIFICATION`,`POSITION`,`FIRST_NAME`,`MID_NAME`,`LAST_NAME`,`ADDRESS` "
                + ",`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`TYPE` ,`MAN_ID` "
                + " from manager where MAN_ID = " + manId;
        ResultSet rs = excuteQuery(sql, conn);
        Manager m = new Manager();
        try {
            while (rs.next()) {
//                String firstName = rs.getString(1);
//                System.out.println("firstName:::" + firstName);
//                m.setFirstName(firstName);
                m.setDateOfHire(rs.getDate(1));//DATE_OF_HIRE
                m.setQualification(rs.getString(2));//QUALIFICATION
                m.setPosition(rs.getString(3));//POSITION
                m.setFirstName(rs.getString(4));//FIRST_NAME
                m.setMidName(rs.getString(5));//MID_NAME
                m.setLastName(rs.getString(6));//LAST_NAME
                m.setAddress(rs.getString(7));//ADDRESS
                m.setGender(rs.getString(8));//GENDER
                m.setDateOfBirth(rs.getDate(9));//DATE_OF_BIRTH
                m.setPhone(rs.getString(10));//PHONE
                m.setType(rs.getString(11));//TYPE
                m.setManId(rs.getInt(12));
            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m;
//    }
    }

    @Override
    public Manager getAllManager() {
        Connection conn = openConnection();
//        String sql1 = "select FIRST_NAME from Manager where MAN_ID = " + manId;
        String sql = "select `DATE_OF_HIRE`,`QUALIFICATION`,`POSITION`,`FIRST_NAME`,`MID_NAME`,`LAST_NAME`,`ADDRESS` "
                + ",`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`TYPE` ,`MAN_ID` "
                + " from manager ";
        ResultSet rs = excuteQuery(sql, conn); 
//        List list= (List)rs;
//        for (int i = 0; i < list.size(); i++) {
//            list.
//        }
        Manager m = new Manager();
        try {
            while (rs.next()) {
//                String firstName = rs.getString(1);
//                System.out.println("firstName:::" + firstName);
//                m.setFirstName(firstName);
                m.setDateOfHire(rs.getDate(1));//DATE_OF_HIRE
                m.setQualification(rs.getString(2));//QUALIFICATION
                m.setPosition(rs.getString(3));//POSITION
                m.setFirstName(rs.getString(4));//FIRST_NAME
                m.setMidName(rs.getString(5));//MID_NAME
                m.setLastName(rs.getString(6));//LAST_NAME
                m.setAddress(rs.getString(7));//ADDRESS
                m.setGender(rs.getString(8));//GENDER
                m.setDateOfBirth(rs.getDate(9));//DATE_OF_BIRTH
                m.setPhone(rs.getString(10));//PHONE
                m.setType(rs.getString(11));//TYPE
                m.setManId(rs.getInt(12));
            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m;
    }

    @Override
    public void insertDataTeacher(Object teachId, Object dateOfHire, Object postion, Object qualification, Object specialization, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type) {
        Connection conn = openConnection();
        String sql = "insert into teacher (`TEACH_ID`,`DATE_OF_HIRE`,`LAST_POSITION`,`QUALIFICATION`,`SPECIALIZATION`,`FIRST_NAME`,`MID_NAME`,`LAST_NAME`,`ADDRESS`,`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`TYPE`,`TEACH_ID1`) "
                + " values (" + teachId + ",'" + dateOfHire + "','" + postion + "','" + qualification + "','" + specialization + "','" + firstName + "','" + midName + "','" + lastName + "','" + address + "','" + gender + "','" + dateBirth + "','" + phone + "','" + type + "'," + teachId + ")";
        updateQuery(sql, conn);
        closeConnection(conn);
    }

    @Override
    public void removeDataTeacher(Object teachId) {
        Connection conn = openConnection();
        String sql = "delete from teacher where TEACH_ID = " + teachId;
        updateQuery(sql, conn);
        closeConnection(conn);
    }

    @Override
    public void editDataTeacher(Object teachId, Object dateOfHire, Object postion, Object qualification, Object specialization, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type) {
        Connection conn = openConnection();
        String sql = "update teacher set FIRST_NAME = '" + firstName + "' , `DATE_OF_HIRE`='" + dateOfHire + "' , `QUALIFICATION` = '" + qualification + "' , `SPECIALIZATION` = '" + specialization + "'  , `LAST_POSITION`='" + postion + "' , `MID_NAME`='" + midName + "' , `LAST_NAME`='" + lastName + "' , `ADDRESS`='" + address + "' , `GENDER`='" + gender + "' , `DATE_OF_BIRTH`='" + dateBirth + "' , `PHONE`='" + phone + "' , `TYPE`='" + type + "' , `TEACH_ID1`='" + teachId + "' where TEACH_ID = " + teachId;
        System.out.println("newschool.ManagerDaoImpl.editDataMan():" + sql);
        updateQuery(sql, conn);
        closeConnection(conn);
    }

    @Override
    public Teacher viewTeacherData(int teachId) {
        Connection conn = openConnection();
//        String sql1 = "select FIRST_NAME from Manager where MAN_ID = " + manId;
        String sql = "select `TEACH_ID`,`DATE_OF_HIRE`,`LAST_POSITION`,`QUALIFICATION`,`SPECIALIZATION`, "
                + " `FIRST_NAME`,`MID_NAME`,`LAST_NAME`,`ADDRESS` ,`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`TYPE`,`TEACH_ID1` "
                + " from teacher where TEACH_ID = " + teachId;
        ResultSet rs = excuteQuery(sql, conn);
        Teacher m = new Teacher();
        try {
            while (rs.next()) {
//                String firstName = rs.getString(1);
//                System.out.println("firstName:::" + firstName);
//                m.setFirstName(firstName);
                m.setTeacherID(rs.getInt(1));//TEACH_ID                
                m.setDateOfHire(rs.getDate(2));//DATE_OF_HIRE
                m.setLastPosition(rs.getString(3));//LAST_POSITION
                m.setQualification(rs.getString(4));//QUALIFICATION
                m.setSpecialization(rs.getString(5));//SPECIALIZATION
                m.setFirstName(rs.getString(6));//FIRST_NAME
                m.setMidName(rs.getString(7));//MID_NAME
                m.setLastName(rs.getString(8));//LAST_NAME
                m.setAddress(rs.getString(9));//ADDRESS
                m.setGender(rs.getString(10));//GENDER
                m.setDateOfBirth(rs.getDate(11));//DATE_OF_BIRTH
                m.setPhone(rs.getString(12));//PHONE
                m.setType(rs.getString(13));//TYPE
//                m.setTeacherID(rs.getInt(14));//TEACH_ID1
            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m;
    }

    @Override
    public void insertDataStudent(Object studId, Object levelId, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object parentId) {
        Connection conn = openConnection();
        String sql = "insert into students (`STUD_ID`,`LEVEL_ID`,`STUD_FIRST_NAME`,`STUD_MID_NAME`,`LAST_NAME`,`ADDRESS`,`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`PARENT_ID`) "
                + " values (" + studId + "," + levelId + ",'" + firstName + "','" + midName + "','" + lastName + "','" + address + "','" + gender + "','" + dateBirth + "','" + phone + "'," + parentId + ")";
        updateQuery(sql, conn);
        closeConnection(conn);
    }

    @Override
    public void removeDataStudent(Object studId) {
        Connection conn = openConnection();
        String sql = "delete from students where STUD_ID = " + studId;
        updateQuery(sql, conn);
        closeConnection(conn);
    }

    @Override
    public void editDataStudent(Object studId, Object levelId, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object parentId) {
        Connection conn = openConnection();
        String sql = "update students set STUD_FIRST_NAME = '" + firstName + "' ,  `LEVEL_ID` = " + levelId + " , `STUD_MID_NAME`='" + midName + "' , `LAST_NAME`='" + lastName + "' , `ADDRESS`='" + address + "' , `GENDER`='" + gender + "' , `DATE_OF_BIRTH`='" + dateBirth + "' , `PHONE`='" + phone + "' , `PARENT_ID`=" + parentId + " where STUD_ID = " + studId;
        System.out.println("newschool.ManagerDaoImpl.editDataMan():" + sql);
        updateQuery(sql, conn);
        closeConnection(conn);
    }

    @Override
    public Student viewStudentData(int studId) {
        Connection conn = openConnection();
//        String sql1 = "select FIRST_NAME from Manager where MAN_ID = " + manId;
        String sql = "select `STUD_ID`,`LEVEL_ID`,`STUD_FIRST_NAME`,`STUD_MID_NAME`,`LAST_NAME`,`ADDRESS` "
                + " ,`GENDER`,`DATE_OF_BIRTH`,`PHONE`,`PARENT_ID` "
                + " from students where STUD_ID = " + studId;
        ResultSet rs = excuteQuery(sql, conn);
        Student m = new Student();
        try {
            while (rs.next()) {
                m.setStudentId(rs.getInt(1));//STUD_ID                
                m.setStudentLevel(rs.getInt(2));//LEVEL_ID
                m.setFirstName(rs.getString(3));//STUD_FIRST_NAME
                m.setMidName(rs.getString(4));//STUD_MID_NAME
                m.setLastName(rs.getString(5));//LAST_NAME
                m.setAddress(rs.getString(6));//ADDRESS
                m.setGender(rs.getString(7));//GENDER
                m.setDateOfBirth(rs.getDate(8));//DATE_OF_BIRTH
                m.setPhone(rs.getString(9));//PHONE
                if (m.getParent() != null) {
                    m.getParent().setParentId(rs.getInt(10));//PARENT_ID    
                }

            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m;
    }

    @Override
    public Result viewResultData(int quesId, int studentId) {
        Connection conn = openConnection();
//        String sql1 = "select FIRST_NAME from Manager where MAN_ID = " + manId;
        String sql = "SELECT `QUES_ID`,`STUD_ID`,`GRADE` FROM `result` where QUES_ID=" + quesId + " and STUD_ID = " + studentId;
        ResultSet rs = excuteQuery(sql, conn);
        Result m = new Result();
        try {
            while (rs.next()) {
                m.setGrade(rs.getInt(3));//GRADE
                if (m.getQuestion() != null && m.getStudent() != null) {
                    m.getQuestion().setQuesId(rs.getInt(1));//QUES_ID                
                    m.getStudent().setStudentId(rs.getInt(2));//STUD_ID  
                }
            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m;
    }

    @Override
    public StudentAttendance viewAttendanceOfStudentData(int attendId, int studentId) {
        Connection conn = openConnection();
//        String sql1 = "select FIRST_NAME from Manager where MAN_ID = " + manId;
        String sql = "SELECT `ATTEND_ID`,`ATTEND_DATE`,`STATUS`,`STUD_ID` FROM attendance_student where ATTEND_ID=" + attendId +" and STUD_ID = " + studentId;
        ResultSet rs = excuteQuery(sql, conn);
        StudentAttendance m = new StudentAttendance();
        try {
            while (rs.next()) {
                m.setAttendanceId(rs.getInt(1));//ATTEND_ID                
                m.setAttendanceDate(rs.getDate(2));//ATTEND_DATE
                m.setStatus(rs.getInt(3));//STATUS
                if (m.getStudent() != null) {
                    m.getStudent().setStudentId(rs.getInt(4));//STUD_ID
                }
            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m;
    }

    @Override
    public TeacherAttendence viewAttendanceOfTeacherData(int attendId, int teachId) {
         Connection conn = openConnection();
//        String sql1 = "select FIRST_NAME from Manager where MAN_ID = " + manId;
        String sql = "SELECT `ATTEND_ID`,`ATTEND_DATE`,`STATUS`,`TEACH_ID` FROM attendance_teacher where ATTEND_ID=" + attendId +" and TEACH_ID = " + teachId;
        ResultSet rs = excuteQuery(sql, conn);
        TeacherAttendence m = new TeacherAttendence();
        try {
            while (rs.next()) {
                m.setAttenendceID(rs.getInt(1));//ATTEND_ID                
                m.setAttendenceDate(rs.getDate(2));//ATTEND_DATE
                m.setStatus(rs.getInt(3));//STATUS
                if (m.getTeacher() != null) {
                    m.getTeacher().setTeacherID(rs.getInt(4));//TEACH_ID
                }
            }
            closeConnection(conn);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return m;
    }
}
