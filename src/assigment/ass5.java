package assigment;

import java.util.Scanner;
class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("Maximum: " + num1);
        } else {
            System.out.println("Maximum: " + num2);
        }
    }
}