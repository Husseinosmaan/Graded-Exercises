package assigments2;

import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int num = input.nextInt();
        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;
        int sum = d1 + d2 + d3 + d4;
        if (sum % 2 == 0)
            System.out.println("Sum is Even");
        else
            System.out.println("Sum is Odd");
    }
}
