package newschool;

public class Result {

    private Questions quesId;
    private Student student;
    private int grade; 

    public static void main(String[] args) {
        System.out.println("Result");
    }

    /**
     * @return the quesId
     */
    public Questions getQuesId() {
        return quesId;
    }

    /**
     * @param quesId the quesId to set
     */
    public void setQuesId(Questions quesId) {
        this.quesId = quesId;
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
     * @return the studID
     */
    public Student getStudID() {
        return studID;
    }

    /**
     * @param studID the studID to set
     */
    public void setStudID(Student studID) {
        this.studID = studID;
    }
}
