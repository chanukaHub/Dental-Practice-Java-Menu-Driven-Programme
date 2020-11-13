package dentalsystem;

import java.util.List;

public class Patient {
    private String name;
    private Address address;
    private String mobile;
    private int patientNumber;
    private static int countOfPatient =0;
    private List<Appointment> appoinments;

    public Patient() {
        this.countOfPatient++;
    }

    public Patient(String name, Address address, String mobile, int patientNumber, List<Appointment> appoinments) {
        this.setName(name);
        this.setAddress(address);
        this.setMobile(mobile);
        this.setPatientNumber(patientNumber);
        this.setAppoinments(appoinments);
        this.countOfPatient++;
    }

    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return this.address;
    }

    public String getMobile() {
        return this.mobile;
    }

    public int getPatientNumber() {
        return this.patientNumber;
    }

    public int getCountOfPatient() {
        return this.countOfPatient;
    }

    public List<Appointment> getAppoinments() {
        return this.appoinments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }

    public void setCountOfPatient(int countOfPatient) {
        this.countOfPatient = countOfPatient;
    }

    public void setAppoinments(List<Appointment> appoinments) {
        this.appoinments = appoinments;
    }

    @Override
    public String toString() {
        return "patientNumber=" + patientNumber +", name=" + name + ", address=" + address + ", mobile=" + mobile +  ", appoinments=" + appoinments;
    }
    
}
