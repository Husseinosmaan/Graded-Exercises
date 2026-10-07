package abdiwali;

import java.util.Scanner;
class TuitionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of courses: ");
        int courses = input.nextInt();
        System.out.print("Enter cost per course: ");
        double cost = input.nextDouble();
        double totalFee = courses * cost;
        System.out.println("Total Tuition Fee: $" + totalFee);
    }
}
