package assigments2;

import java.util.Scanner;
public class BankingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctPin = 1234;
        double balance = 500.0;
        System.out.print("Enter PIN: ");
        int pin = input.nextInt();
        if (pin == correctPin) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.print("Choose option: ");}
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Balance: " + balance);break;
            case 2:
                System.out.print("Enter deposit amount: ");
                int deposit = input.nextInt();
                balance = balance + deposit;
                System.out.println("New balance: " + balance);break;
            case 3:
                System.out.print("Enter withdraw amount: ");
                int withdraw = input.nextInt();
                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Remaining balance: " + balance);
                } else {
                    System.out.println("haragu kugu ma filna");
                }break;
            default:
                System.out.println("Invalid option");
        }
    }
}