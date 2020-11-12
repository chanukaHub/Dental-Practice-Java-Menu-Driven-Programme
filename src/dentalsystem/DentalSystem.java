package dentalsystem;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DentalSystem {

    private static int staffCount=0;
    private static ArrayList<Address> addressList = new ArrayList<Address>();
    private static ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
    private static ArrayList<Dentist> dentistList = new ArrayList<Dentist>();
    private static ArrayList<Receptionist> receptionistList = new ArrayList<Receptionist>();
    private static ArrayList<Patient> patientList = new ArrayList<Patient>();
    
    public static void main(String[] args) {
        int option;
        Scanner myScanner = new Scanner(System.in);
        
        while (true) {
            System.out.println(" ");
            System.out.println("-------------------------------------");
            System.out.println("\tDental System");
            System.out.println("-------------------------------------");
            System.out.println("Select a number from Below : ");
            System.out.println("[1] Add Staff members");
            System.out.println("[2] Add Patient");
            System.out.println("[3] Make an new Appoinment");
            System.out.println("[4] View Patents Details");
            System.out.println("[5] View Dentists List");
            System.out.println("[6] View Receptionists List");
            System.out.println("[7] Appoinments Details");
            System.out.println("[0] Exit");
            System.out.println("-------------------------------------");
            System.out.println("Your Choice (0-7) : ");
        
        
            try {
                String userInput = myScanner.nextLine();
                option= Integer.parseInt(userInput);
                if(option<=7 && option>=0 ){
                    cleanScreean();
                    selectedOption(option);
                }
                else{
                    System.out.println("Invalid number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }

    private static void selectedOption(int option) {
        switch(option){
            case 1:
                addStaff();
                break;
            case 5:
                displayDentistList();
                break;
            case 6:
                displayReceptionistList();
                break;
        }
    }

    private static void addStaff() {
        int option;
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("-------------------------------------");
        System.out.println("\tDental System");
        System.out.println("-------------------------------------");
        System.out.println("[1] Add Dentist");
        System.out.println("[2] Add Receptionist");
        System.out.println("[0] Exit");
        System.out.println("-------------------------------------");
        System.out.println("Your Choice (0-2) : ");
        
        try {
            String userInput = myScanner.nextLine();
            option= Integer.parseInt(userInput);
            if(option<=2 && option>=0 ){
                switch(option){
                    case 1:
                        addDentist();
                        break;
                    case 2:
                        addReceptionist();
                        break;
                    case 0:
                        stopSystem();
                }
            }
            else{
                System.out.println("Invalid number");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }

    private static void addDentist() {
        String name, gender, telephone, nextOfKin, qulification,date,addressNo,addressLane,addressTown;
        int councilNumber;
        Date date2=null;
        Address address;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Name:");
        name = myScanner.nextLine();
        
        System.out.println("Enter Address\nNo:");
        addressNo = myScanner.nextLine();
        System.out.println("Lane:");
        addressLane= myScanner.nextLine();
        System.out.println("Town:");
        addressTown= myScanner.nextLine();
        address = new Address(addressNo,addressLane,addressTown);
        
        System.out.println("Enter Gender:");
        gender = myScanner.nextLine();
        
        while(true) {
        System.out.println("Phone Number:");
        telephone= myScanner.nextLine();
        String patterns = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
        //matches 1234567890 , 123-456-7890 , (123)456-7890 or (123)4567890
        Pattern pattern = Pattern.compile(patterns);
        
        Matcher matcher = pattern.matcher(telephone);
        if (matcher.matches()) {
            break;
        }else{
            System.out.println("Phone Number Format invalid ");
        }}
        
        System.out.println("enter next of kin:");
        nextOfKin = myScanner.nextLine();
        
        System.out.println("Qulification :");
        qulification = myScanner.nextLine();
        
        while(true){
            System.out.println("Council Regisration Number:");
            try {
                String num = myScanner.nextLine();
                councilNumber = Integer.parseInt(num);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }
        
        while(true){
            System.out.println("Awarded Date: ");
            date = myScanner.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                //Parsing the String
                date2 = dateFormat.parse(date);
                break;
            } catch (ParseException e) {
                System.out.println("Invalid date format use yyyy-MM-dd");
            }
        }
        
        staffCount++;
        dentistList.add(new Dentist(qulification, councilNumber, date2, (1000+staffCount), name, address, gender, telephone, nextOfKin));
    }

    private static void addReceptionist() {
        String name, gender, telephone, nextOfKin, courseProvider,date,addressNo,addressLane,addressTown;
        Date courseAttendedDate=null;
        Address address;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Name:");
        name = myScanner.nextLine();
        
        System.out.println("Enter Address\nNo:");
        addressNo = myScanner.nextLine();
        System.out.println("Lane:");
        addressLane= myScanner.nextLine();
        System.out.println("Town:");
        addressTown= myScanner.nextLine();
        address = new Address(addressNo,addressLane,addressTown);
        
        System.out.println("Enter Gender:");
        gender = myScanner.nextLine();
        
        while(true) {
        System.out.println("Phone Number:");
        telephone= myScanner.nextLine();
        String patterns = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
        //matches 1234567890 , 123-456-7890 , (123)456-7890 or (123)4567890
        Pattern pattern = Pattern.compile(patterns);
        
        Matcher matcher = pattern.matcher(telephone);
        if (matcher.matches()) {
            break;
        }else{
            System.out.println("Phone Number Format invalid ");
        }}
        
        System.out.println("enter next of kin:");
        nextOfKin = myScanner.nextLine();
        
        while(true){
            System.out.println("Course Attended Date: ");
            date = myScanner.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                //Parsing the String
                courseAttendedDate = dateFormat.parse(date);
                break;
            } catch (ParseException e) {
                System.out.println("Invalid date format use yyyy-MM-dd");
            }
        }
        
        System.out.println("Enter Course Provider:");
        courseProvider = myScanner.nextLine();
        
        staffCount++;
        receptionistList.add(new Receptionist((1000+staffCount), name, address, gender, telephone, nextOfKin, courseAttendedDate, courseProvider));
    }

    private static int stopSystem() {
        return 0;
    }

    private static void displayDentistList() {
        System.out.println("Dentist List\n________________________________\n");
        for(int i =0; i< dentistList.size(); i++){
            System.out.println(i+1 +". "+ dentistList.get(i).toString());
        }
        waitForEnter(); 
    }
    
    private static void displayReceptionistList() {
        System.out.println("Receptionist List\n________________________________\n");
        for(int i =0; i< receptionistList.size(); i++){
            System.out.println(i+1 +". "+ receptionistList.get(i).toString());
        }
        waitForEnter(); 
    }
    
    public static void waitForEnter() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("\nPress any key to continue . . . ");
        myScanner.nextLine();
        cleanScreean();
    }
    
    public static void cleanScreean() { 
        try {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor() ;
        } catch(IOException | InterruptedException E) {
            System.out.println(E);
        }
    }//end cleanScreen method


}
