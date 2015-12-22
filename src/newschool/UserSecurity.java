/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newschool;

/**
 *
 * @author manal pc
 */
public class UserSecurity {


    private int userPassword;
    private String userName;
    private Student student;
    private Teacher teacher;
    private Parent parent;
    private HealthVisitor healthvisitor;
    private Manager manager;

    public int getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(int userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public HealthVisitor getHealthvisitor() {
        return healthvisitor;
    }

    public void setHealthvisitor(HealthVisitor healthvisitor) {
        this.healthvisitor = healthvisitor;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    

    
}
