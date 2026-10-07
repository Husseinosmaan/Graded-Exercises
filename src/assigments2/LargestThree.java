package assigments2;

import java.util.Scanner;
public class LargestThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = input.nextInt();
        System.out.print("Enter three numbers: ");
        int b = input.nextInt();
        System.out.print("Enter three numbers: ");
        int c = input.nextInt();
        if (a > b && a > c)
            System.out.println("Largest = " + a);
        else if (b > a && b > c)
                System.out.println("Largest = " + b);
        else
            System.out.println("Largest = " + c);
    }
}