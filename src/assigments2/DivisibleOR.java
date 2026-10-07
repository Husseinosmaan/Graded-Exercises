package assigments2;

import java.util.Scanner;
public class DivisibleOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        if (n % 2 == 0 || n % 5 == 0)
            System.out.println("Divisible");
        else
            System.out.println("Not divisible");
    }
}
