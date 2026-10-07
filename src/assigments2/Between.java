package assigments2;

import java.util.Scanner;
public class Between {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        if (n >= 50 && n <= 100)
            System.out.println("In Range");
        else
            System.out.println("Out of Range");
    }
}
