package abdiwali;

import java.util.Scanner;
class EmployeeSalary{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter basic salary: ");
    double basicSalary = input.nextDouble();
    System.out.print("Enter overtime hours: ");
    double overtimeHours = input.nextDouble();
    System.out.print("Enter overtime rate per hour: ");
    double overtimeRate = input.nextDouble();
// calculation of OvertimePay and TotalSalary
    double overtimePay = overtimeHours * overtimeRate;
    double totalSalary = basicSalary + overtimePay;
    System.out.println("Overtime Pay: $" + overtimePay);
    System.out.println("Total Salary: $" + totalSalary);
    }
}