package dentalsystem;

import java.util.Date;

public class Appointment {
    private Date date;
    private double cost;
    private Boolean attendance;
    private Dentist dentist;
    private Patient patient;

    public Appointment() {
    }

    public Appointment(Date date, double cost, Boolean attendance, Dentist dentist, Patient patient) {
        this.setDate(date);
        this.setCost(cost);
        this.setAttendance(attendance);
        this.setDentist(dentist);
        this.setPatient(patient);
    }

    public Date getDate() {
        return this.date;
    }

    public double getCost() {
        return this.cost;
    }

    public Boolean getAttendance() {
        return this.attendance;
    }

    public Dentist getDentist() {
        return this.dentist;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setAttendance(Boolean attendance) {
        this.attendance = attendance;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Appointment{" + "date=" + date + ", cost=" + cost + ", attendance=" + attendance + ", dentist=" + dentist + ", patient=" + patient + '}';
    }
    
}