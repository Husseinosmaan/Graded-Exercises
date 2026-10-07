package assigments2;

import java.util.Scanner;
public class MaxTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        if (a > b)
            System.out.println("Largest = " + a);
        else
            System.out.println("Largest = " + b);
    }
}
