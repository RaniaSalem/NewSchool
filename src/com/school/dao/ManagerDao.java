package com.school.dao;

import com.school.pojo.Manager;
import com.school.pojo.Result;
import com.school.pojo.Student;
import com.school.pojo.StudentAttendance;
import com.school.pojo.Teacher;
import com.school.pojo.TeacherAttendence;

public interface ManagerDao {

    public void insertDataMan(Object manId, Object dateOfHire, Object qualification, Object postion, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type);

    public void removeDataMan(Object manId);

    public void editDataMan(Object manId, Object firstName, Object dateOfHire, Object qualification, Object postion, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type);

    public Manager viewManagerScreen(int manId);

    public Manager getAllManager();

    //Teacher
    public void insertDataTeacher(Object teachId, Object dateOfHire, Object postion, Object qualification, Object specialization, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type);

    public void removeDataTeacher(Object teachId);

    public void editDataTeacher(Object teachId, Object dateOfHire, Object postion, Object qualification, Object specialization, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type);

    public Teacher viewTeacherData(int teachId);
    //student

    public void insertDataStudent(Object studId, Object levelId, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object parentId);

    public void removeDataStudent(Object studId);

    public void editDataStudent(Object studId, Object levelId, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object parentId);

    public Student viewStudentData(int studId);

    public Result viewResultData(int quesId, int studentId);

    public StudentAttendance viewAttendanceOfStudentData(int attendId, int studentId);

    public TeacherAttendence viewAttendanceOfTeacherData(int attendId, int teachId);
}
