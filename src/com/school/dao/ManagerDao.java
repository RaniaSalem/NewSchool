package com.school.dao;

import com.school.pojo.Manager;
import com.school.pojo.Teacher;

public interface ManagerDao {

    public void insertDataMan(Object manId, Object dateOfHire, Object qualification, Object postion, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type);

    public void removeDataMan(Object manId);

    public void editDataMan(Object manId, Object firstName, Object dateOfHire, Object qualification, Object postion, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type);

    public Manager viewManagerScreen(int manId);
    public Manager getAllManager();
    public void insertDataTeacher(Object teachId, Object dateOfHire, Object postion, Object qualification,Object specialization, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type);
    public void removeDataTeacher(Object teachId);
    public void editDataTeacher(Object teachId, Object dateOfHire, Object postion, Object qualification,Object specialization, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type);
    public Teacher viewTeacherData(int manId);




}