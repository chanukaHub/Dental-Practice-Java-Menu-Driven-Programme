package dentalsystem;

public class Address {
    private String no;
    private String lane;
    private String town;
    
    public Address(){}
    
     public Address(String no,String lane,String town){
         this.setNo(no);
         this.setLane(lane);
         this.setTown(town);
     }


    public String getNo() {
        return this.no;
    }


    public String getLane() {
        return this.lane;
    }


    public String getTown() {
        return this.town;
    }


    public void setNo(String no) {
        this.no = no;
    }


    public void setLane(String lane) {
        this.lane = lane;
    }


    public void setTown(String town) {
        this.town = town;
    }
     
     @Override
    public String toString() {
        return "(" + "no=" + no + ", lane=" + lane + ", town=" + town + ')';
    }
     
}
