package assigments2;

import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m = input.nextInt();
        if (m >= 50)
            System.out.println("Passed");
        else
            System.out.println("Failed");
    }
}
