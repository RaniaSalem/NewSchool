package com.school.pojo;

public class Subject {
    private int subjId;
   private String subjName; 
   private Teacher teacher;
   private String subjDetails;

    /**
     * @return the subjId
     */
    public int getSubjId() {
        return subjId;
    }

    /**
     * @param subjId the subjId to set
     */
    public void setSubjId(int subjId) {
        this.subjId = subjId;
    }

    /**
     * @return the subjName
     */
    public String getSubjName() {
        return subjName;
    }

    /**
     * @param subjName the subjName to set
     */
    public void setSubjName(String subjName) {
        this.subjName = subjName;
    }

    /**
     * @return the subjDetails
     */
    public String getSubjDetails() {
        return subjDetails;
    }

    /**
     * @param subjDetails the subjDetails to set
     */
    public void setSubjDetails(String subjDetails) {
        this.subjDetails = subjDetails;
    }

    /**
     * @return the teacher
     */
    public Teacher getTecher() {
        return teacher;
    }

    /**
     * @param techer the teacher to set
     */
    public void setTecher(Teacher techer) {
        this.teacher = techer;
    }

  
}
