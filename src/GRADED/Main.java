package GRADED;

public class Main {

    public static void main(String[] args) {

        // ==========================================
        // Exercise 2.0 - Loan
        // ==========================================

        System.out.println("===== LOAN =====");

        LoanClass loan = new LoanClass();

        System.out.println("Annual Interest Rate: "
                + loan.getAnnualInterestRate());

        System.out.println("Number of Years: "
                + loan.getNumberOfYears());

        System.out.println("Loan Amount: "
                + loan.getLoanAmount());

        System.out.println("Loan Date: "
                + loan.getLoanDate());

        System.out.println("Monthly Payment: "
                + loan.getMonthlyPayment());

        System.out.println("Total Payment: "
                + loan.getTotalPayment());


        // ==========================================
        // Exercise 2.1 - BMI
        // ==========================================

        System.out.println("\n===== BMI =====");

        BMI person = new BMI(
                "Ahmed",
                20,
                150,
                65
        );

        System.out.println("Name: "
                + person.getName());

        System.out.println("Age: "
                + person.getAge());

        System.out.println("Weight: "
                + person.getWeight());

        System.out.println("Height: "
                + person.getHeight());

        System.out.println("BMI: "
                + person.getBMI());

        System.out.println("Status: "
                + person.getStatus());


        // ==========================================
        // Exercise 2.2 - Course
        // ==========================================

        System.out.println("\n===== COURSE =====");

        Course course = new Course("Java Programming");

        course.addStudent("Ali");
        course.addStudent("Ahmed");
        course.addStudent("Hassan");

        System.out.println("Course Name: "
                + course.getCourseName());

        System.out.println("Number of Students: "
                + course.getNumberOfStudents());

        System.out.println("Students:");

        for (String student : course.getStudents()) {
            System.out.println(student);
        }

        // Drop a student
        course.dropStudent("Ahmed");

        System.out.println("\nAfter dropping Ahmed:");

        System.out.println("Number of Students: "
                + course.getNumberOfStudents());

        for (String student : course.getStudents()) {
            System.out.println(student);
        }
    }
}
