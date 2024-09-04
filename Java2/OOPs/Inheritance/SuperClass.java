package OOPs.Inheritance;

public class SuperClass {
    private int serialId;
    protected int childId;
    public int commonId;

    public void setSerialId(int serialId){
        this.serialId = serialId;
    }
    protected void calcChildId(int serialId) {
        this.childId = serialId%25+49;
    }
    public void setCommonId(int commonId){
        this.commonId = commonId;
    }
    public int getSerialId() {
        return this.serialId;
    }

    @Override
    public String toString() {
        return "SuperClass{" +
                "serialId=" + serialId +
                ", childId=" + childId +
                ", commonId=" + commonId +
                '}';
    }
}
