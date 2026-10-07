package examples_0f_Ch3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000;
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.print("Choose option: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Balance: " + balance);
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                int deposit = input.nextInt();
                balance = balance + deposit;
                System.out.println("New balance: " + balance);
                break;

            case 3:
                System.out.print("Enter withdraw amount: ");
                int withdraw = input.nextInt();
                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Remaining balance: " + balance);
                } else {
                    System.out.println("Insufficient balance");
                }
                break;

            default:
                System.out.println("Invalid option");
        }
    }
}

