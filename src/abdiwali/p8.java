package abdiwali;

import java.util.Scanner;
class BankDeposit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter current balance: ");
        double balance = input.nextDouble();
        System.out.print("Enter deposit amount: ");
        double deposit = input.nextDouble();
        double newBalance = balance + deposit;
        System.out.println("New Balance: $" + newBalance);
    }
}