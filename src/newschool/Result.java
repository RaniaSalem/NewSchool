package newschool;

public class Result {

    private Questions question;
    private Student student;
    private int grade; 

    public static void main(String[] args) {
        System.out.println("Result");
    }

  
    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * @return the question
     */
    public Questions getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(Questions question) {
        this.question = question;
    }


}
