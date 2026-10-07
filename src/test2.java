//class student {//super class
//    String name;
//    String id;
//
//    void display() {
//        System.out.println("student name:" + name);
//        System.out.println("student id :" + id);
//
//    }
//}
//
//
//class DEPARTMENT extends student {//super class
//    String faculty;
//    String sem;
//    void Sdisplay() {
//        display();
//        System.out.println("student faculty:" + faculty);
//        System.out.println("student sem:" + sem);
//
//    }
//}
//class Engenaring extends student{//super class
//    String faculty ;
//    String Sclass;
//
//    void show() {
//        display();
//        System.out.println("student faculty :" + faculty );
//        System.out.println("student class :" + Sclass);
//
//    }
//}
//
//public class test1 {
//    public static void main(String[] args) {
//        DEPARTMENT s1=new DEPARTMENT();
//        s1.name="nasro";
//        s1.id="c33333";
//        s1.faculty="IT";
//        s1.sem="6";
//        s1.Sdisplay();
//        System.out.println("student 2");
//        Engenaring s2=new Engenaring();
//        s2.name="aisha";
//        s2.id="E11111";
//        s2.faculty="ENG";
//        s2.Sclass="CE212";
//        s2.show();
//
//
//
//    }
//}
//
//package Hospital;
//
//class Patient {
//
//    String name;
//    double consultationFee;
//
//    // Constructor
//    public Patient(String name, double consultationFee) {
//        this.name = name;
//        this.consultationFee = consultationFee;
//    }
//
//    // Display Method
//    public void display() {
//        System.out.println("Patient Name: " + name);
//        System.out.println("Consultation Fee: " + consultationFee);
//    }
//}
//
//class InPatient extends Patient {
//
//    int admissionDay;
//    double roomCharge;
//
//    // Constructor
//    public InPatient(String name, double consultationFee) {
//        super(name, consultationFee);
//    }
//
//    // Method 1
//    public void addAdmission(int days, double chargePerDay) {
//        admissionDay = days;
//        roomCharge = days * chargePerDay;
//    }
//
//    // Display
//    public void display() {
//        super.display();
//        System.out.println("Admission Days: " + admissionDay);
//        System.out.println("Room Charge: " + roomCharge);
//    }
//}
//
//class OutPatient extends Patient {
//
//    double labFee;
//
//    // Constructor
//    public OutPatient(String name, double consultationFee) {
//        super(name, consultationFee);
//    }
//
//    // Method 2
//    public void addLabFee(double fee) {
//        labFee = fee;
//    }
//
//    // Display
//    public void display() {
//        super.display();
//        System.out.println("Lab Fee: " + labFee);
//    }
//}
//
//public class MainHospital {
//
//    public static void main(String[] args) {
//
//        InPatient p1 = new InPatient("ahmed", 50);
//        p1.addAdmission(3, 100);
//
//        OutPatient p2 = new OutPatient("Ali", 40);
//        p2.addLabFee(30);
//
//        p1.display();
//        System.out.println("-----------");
//        p2.display();
//    }
//}