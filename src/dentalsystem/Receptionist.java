package dentalsystem;

import java.util.Date;

public class Receptionist extends Staff {
    private Date courseAttendedDate;
    private String courseProvider;

    //construtors 
    public Receptionist() {
        super();
    }

    public Receptionist(int empNumber, String name, Address address, String gender, String telephone, String nextOfKin,Date courseAttendedDate, String courseProvider) {
        super(empNumber, name, address, gender, telephone, nextOfKin);
        this.setCourseAttendedDate(courseAttendedDate);
        this.setCourseProvider(courseProvider);
    }
    
    //getters
    public Date getCourseAttendedDate() {
        return this.courseAttendedDate;
    }

    public String getCourseProvider() {
        return this.courseProvider;
    }

    //setters
    public void setCourseAttendedDate(Date courseAttendedDate) {
        this.courseAttendedDate = courseAttendedDate;
    }

    public void setCourseProvider(String courseProvider) {
        this.courseProvider = courseProvider;
    }

    @Override
    public String toString() {
        return "Receptionist{" + "courseAttendedDate=" + courseAttendedDate + ", courseProvider=" + courseProvider + '}';
    }

   
    
    
    
}
