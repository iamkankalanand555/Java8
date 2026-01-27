package ak.com;


public class Notes {

    Integer srNO;
    String noteName;
    Integer tagId;


    public Notes(Integer srNO, String noteName, Integer tagId) {
        this.srNO = srNO;
        this.noteName = noteName;
        this.tagId = tagId;
    }

    public Integer getSrNO() {
        return srNO;
    }

    public void setSrNO(Integer srNO) {
        this.srNO = srNO;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Notes(int i, String note1, int i1) {
    }
}
