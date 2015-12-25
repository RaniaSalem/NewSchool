package com.school.pojo;

public class TableOfSubject {

    private int tableId;
    private int tableTime; 
    private int tableDay;
    private Subject subjId;
    private LevelYear levelYear; 

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
     * @return the levelYear
     */
    public LevelYear getLevelYear() {
        return levelYear;
    }

    /**
     * @param levelYear the levelYear to set
     */
    public void setLevelYear(LevelYear levelYear) {
        this.levelYear = levelYear;
    }


}
