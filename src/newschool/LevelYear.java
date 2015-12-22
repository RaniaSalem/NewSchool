package newschool;

public class LevelYear {

    private int levelId;
    private String levelName;
    private String levelContent; 

    public static void main(String[] args) {
        System.out.println("LevelYear");
    }

    /**
     * @return the levelId
     */
    public int getLevelId() {
        return levelId;
    }

    /**
     * @param levelId the levelId to set
     */
    public void setLevelId(int levelId) {
        this.levelId = levelId;
    }

    /**
     * @return the levelName
     */
    public String getLevelName() {
        return levelName;
    }

    /**
     * @param levelName the levelName to set
     */
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    /**
     * @return the levelContent
     */
    public String getLevelContent() {
        return levelContent;
    }

    /**
     * @param levelContent the levelContent to set
     */
    public void setLevelContent(String levelContent) {
        this.levelContent = levelContent;
    }

}
