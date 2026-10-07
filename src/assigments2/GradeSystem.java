package assigments2;

import java.util.Scanner;
public class GradeSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = input.nextInt();
        int category = marks / 10;
        switch (category) {
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Fail");
        }
    }
}

