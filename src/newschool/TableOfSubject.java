package newschool;

public class TableOfSubject {

    private int tableId;
    private int tableTime;
    private int tableDay;
    private Subject subjId;
    private LevelYear levelId; 

    /**
     * @return the tableId
     */
    public int getTableId() {
        return tableId;
    }

    /**
     * @param tableId the tableId to set
     */
    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    /**
     * @return the tableTime
     */
    public int getTableTime() {
        return tableTime;
    }

    /**
     * @param tableTime the tableTime to set
     */
    public void setTableTime(int tableTime) {
        this.tableTime = tableTime;
    }

    /**
     * @return the tableDay
     */
    public int getTableDay() {
        return tableDay;
    }

    /**
     * @param tableDay the tableDay to set
     */
    public void setTableDay(int tableDay) {
        this.tableDay = tableDay;
    }

    /**
     * @return the subjId
     */
    public Subject getSubjId() {
        return subjId;
    }

    /**
     * @param subjId the subjId to set
     */
    public void setSubjId(Subject subjId) {
        this.subjId = subjId;
    }

    /**
     * @return the levelId
     */
    public LevelYear getLevelId() {
        return levelId;
    }

    /**
     * @param levelId the levelId to set
     */
    public void setLevelId(LevelYear levelId) {
        this.levelId = levelId;
    }
}
