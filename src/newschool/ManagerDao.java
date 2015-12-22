
package newschool;

public interface ManagerDao {
 public void viewAttendanceStudent(Manager manager);    
 public void viewAttendanceTeacher(Manager manager);
 public void viewResultOfExamOfStudents(Manager manager); 
 public void addDataStudent(Manager manager); 
 public void removeDataStudent(Manager manager); 
 public void removeDataTeacher(Manager manager); 
 public void editDataTeacher(Manager manager); 
 public void editDataStudent(Manager manager); 
}
