package assigment;

import java.util.Scanner;
class PassFailSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = input.nextInt();

        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
