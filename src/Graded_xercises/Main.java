package Graded_xercises;
public class Main { public static void main(String[] args) {
    // Loan test
    Loan loan = new Loan(5.0, 10, 5000);

    System.out.println("Loan");
    System.out.println("Annual Interest Rate: " + loan.getAnnualInterestRate());
    System.out.println("Loan Amount: " + loan.getLoanAmount());
    System.out.println("Number of Years: " + loan.getNumberOfYears());
    System.out.println("Monthly Payment: " + loan.getMonthlyPayment());
    System.out.println("Total Payment: " + loan.getTotalPayment());

    // BMI test
    BMI bmi = new BMI("Ahmed", 25, 150, 65);

    System.out.println("\nBMI");
    System.out.println("Name: " + bmi.getName());
    System.out.println("Age: " + bmi.getAge());
    System.out.println("Weight: " + bmi.getWeight());
    System.out.println("Height: " + bmi.getHeight());
    System.out.println("BMI: " + bmi.getBMI());
    System.out.println("Status: " + bmi.getStatus());

    // Course test
    Course course = new Course("Java Programming");

    course.addStudent("Ahmed");
    course.addStudent("Mohamed");
    course.addStudent("Ali");

    System.out.println("\nCourse");
    System.out.println("Course Name: " + course.getCourseName());
    System.out.println("Number of Students: " + course.getNumberOfStudents());

    System.out.println("Students:");
    for (int i = 0; i < course.getNumberOfStudents(); i++) {
        System.out.println(course.getStudents()[i]);
    }

    course.dropStudent("Mohamed");

    System.out.println("\nAfter dropping Mohamed:");
    System.out.println("Number of Students: " + course.getNumberOfStudents());

    for (int i = 0; i < course.getNumberOfStudents(); i++) {
        System.out.println(course.getStudents()[i]);
    }
}
}