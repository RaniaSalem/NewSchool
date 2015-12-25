package com.school.dao;

import com.school.pojo.Manager;

public interface ManagerDao {

    public void InsertDataMan(Object manId, Object dateOfHire, Object qualification, Object postion, Object firstName, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type);

    public void removeDataMan(Object manId);

    public void editDataMan(Object manId, Object firstName, Object dateOfHire, Object qualification, Object postion, Object midName, Object lastName, Object address, Object gender, Object dateBirth, Object phone, Object type);

    public Manager viewManagerScreen(int manId);

}
