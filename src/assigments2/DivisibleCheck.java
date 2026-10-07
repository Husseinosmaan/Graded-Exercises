package assigments2;

import java.util.Scanner;
public class DivisibleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        if (n % 2 == 0 && n % 3 == 0)
            System.out.println("Divisible by 2 and 3");
        else
            System.out.println("Not divisible");
    }
}
