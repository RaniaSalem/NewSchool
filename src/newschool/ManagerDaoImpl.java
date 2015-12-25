package newschool;

import java.sql.SQLException;

public class ManagerDaoImpl {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        printManagerDetails(1);////select data in table Manager
        ManagerDao managerDao = new ManagerDao();
        managerDao.InsertDataMan(5, "2015/12/1", "high", "Manager", "Mahmoud", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "High Manager");//insert data(man_id) in table Manager
        managerDao.removeDataMan(13);//delete data(man_id) in table Manager
        managerDao.editDataMan(5, "Mahmouddddddd", "2015/12/1", "high", "Manager", "Mohamed", "Mostafa", "Sharqia", "Male", "1666/12/1", "123456789", "Manager");//update data(first_name) according to (man_id)in table Manager

    }
    ////select data in table Manager
    private static void printManagerDetails(int manId)
    {
        ManagerDao managerDao = new ManagerDao();
        Manager mm = managerDao.viewManagerScreen(manId); 
        System.out.println("m.getFirstName() :" + mm.getFirstName());//select data(FirstName) in table Manager
        System.out.println("m.getAddress() :" + mm.getAddress());//select data(FirstName) in table Manager
        System.out.println("m.getGender() :" + mm.getGender());//select data(FirstName) in table Manager
        System.out.println("m.getLastName() :" + mm.getLastName());//select data(FirstName) in table Manager
        System.out.println("m.getMidName() :" + mm.getMidName());//select data(FirstName) in table Manager
        System.out.println("m.getLastName() :" + mm.getLastName());//select data(FirstName) in table Manager
        System.out.println("m.getPhone() :" + mm.getPhone());//select data(FirstName) in table Manager
        System.out.println("m.getPosition() :" + mm.getPosition());//select data(FirstName) in table Manager
        System.out.println("m.getQualification() :" + mm.getQualification());//select data(FirstName) in table Manager
        System.out.println("m.getType() :" + mm.getType());//select data(FirstName) in table Manager
        System.out.println("m.getDateOfBirth() :" + mm.getDateOfBirth());//select data(FirstName) in table Manager
        System.out.println("mm.getDateOfHire() :" + mm.getDateOfHire());//select data(FirstName) in table Manager
        System.out.println("mm.getManId() :" + mm.getManId());//select data(FirstName) in table Manager   
    }
}
