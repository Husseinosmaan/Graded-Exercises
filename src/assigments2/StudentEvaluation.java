package assigments2;

import java.util.Scanner;
public class StudentEvaluation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        int s1 = input.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int s2 = input.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int s3 = input.nextInt();
        double avg = (s1 + s2 + s3) / 3.0;
        if (s1 < 50 || s2 < 50 || s3 < 50) {
            System.out.println("Result: FAIL");
        } else {
            System.out.println("Average: " + avg);
            if (avg >= 75)
                System.out.println("Result: DISTINCTION");
            else
                System.out.println("Result: PASS");
        }
    }
}
