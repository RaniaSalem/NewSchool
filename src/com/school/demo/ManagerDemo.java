package com.school.demo;

import com.school.dao.ManagerDaoImpl;
import com.school.pojo.Manager;

public class ManagerDemo {

    public static void main(String[] args) {
        printManagerDetails(1);//select data in table Manager
        ManagerDaoImpl managerDaoImpl = new ManagerDaoImpl();
        managerDaoImpl.InsertDataMan(16, "2015/12/1", "high", "Manager", "Mahmoud", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "High Manager");//insert data(man_id) in table Manager
        managerDaoImpl.removeDataMan(13);//delete data(man_id) in table Manager
        managerDaoImpl.editDataMan(5, "Mahmouddddddd", "2015/12/1", "high", "Manager", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "Manager");//update data(first_name) according to (man_id)in table Manager
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
}
