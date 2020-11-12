package dentalsystem;

import java.util.Date;

public class Dentist extends Staff{
    private String qualification;
    private int councilRegNumber;
    private Date dateAwarded;

    public Dentist() {
        super();
    }

    public Dentist(String qualification, int councilRegNumber, Date dateAwarded, int empNumber, String name, Address address, String gender, String telephone, String nextOfKin) {
        super(empNumber, name, address, gender, telephone, nextOfKin);
        this.setQualification(qualification);
        this.setCouncilRegNumber(councilRegNumber);
        this.setDateAwarded(dateAwarded);
    }

    public String getQualification() {
        return this.qualification;
    }

    public int getCouncilRegNumber() {
        return this.councilRegNumber;
    }

    public Date getDateAwarded() {
        return this.dateAwarded;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setCouncilRegNumber(int councilRegNumber) {
        this.councilRegNumber = councilRegNumber;
    }

    public void setDateAwarded(Date dateAwarded) {
        this.dateAwarded = dateAwarded;
    }

    @Override
    public String toString() {
        String msg =super.toString();
        return  msg + ", qualification=" + qualification + ", councilRegNumber=" + councilRegNumber + ", dateAwarded=" + dateAwarded;
    }
    
    
    
}
