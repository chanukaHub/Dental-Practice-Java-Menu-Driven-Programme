package dentalsystem;

public class Staff {
    private int empNumber;  // this value can only be set when staff is added, it cannot be changed afterwards
    private String name;
    private Address address;
    private String gender;
    private String telephone;
    private String nextOfKin;
    
    public Staff(){
    
    }
    
    public Staff(int empNumber,String name,Address address,String gender,String telephone,String nextOfKin){
        this.setEmpNumber(empNumber);
        this.setName(name);
        this.setAddress(address);
        this.setGender(gender);
        this.setTelephone(telephone);
        this.setNextOfKin(nextOfKin);
    }

    
    public int getEmpNumber() {
        return this.empNumber;
    }

    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return this.address;
    }


    public String getGender() {
        return this.gender;
    }


    public String getTelephone() {
        return this.telephone;
    }


    public String getNextOfKin() {
        return this.nextOfKin;
    }


    private void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAddress(Address address) {
        this.address = address;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    @Override
    public String toString() {
        return "Staff{" + "empNumber=" + empNumber + ", name=" + name + ", address=" + address + ", gender=" + gender + ", telephone=" + telephone + ", nextOfKin=" + nextOfKin + '}';
    }
    
    
    
}
