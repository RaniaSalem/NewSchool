package newschool;

public class Subject {
    private int subjId;
   private String subjName;
   private Teacher techId;
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
     * @return the techId
     */
    public Teacher getTechId() {
        return techId;
    }

    /**
     * @param techId the techId to set
     */
    public void setTechId(Teacher techId) {
        this.techId = techId;
    }
}
