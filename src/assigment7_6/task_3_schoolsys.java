package assigment7_6;

import java.util.Scanner;

class schoolSys {
    public static void schoolSystem() {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter mark (-1 to stop): ");
            int mark = input.nextInt();

            if (mark == -1) {
                break;
            }
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid mark");
            } else {
                total += mark;
                count++;
            }
        }
        double average = total / count;
        System.out.println("Average: " + average);

        if (average >= 90)
            System.out.println("Grade A");
        else if (average >= 80)
            System.out.println("Grade B");
        else if (average >= 60)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
    public static void main(String[] args) {
        schoolSystem();
    }
}