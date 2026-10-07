package assigment7_6;
import java.util.Scanner;

class bankingsys {
    public static void bankingSystem() {
        Scanner input = new Scanner(System.in);
        double balance = 1000;

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                double amount = input.nextDouble();
                balance += amount;
                System.out.println("Balance: " + balance);

            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                double amount = input.nextDouble();

                if (amount > balance) {
                    System.out.println("Not enough balance");
                } else {
                    balance -= amount;
                    System.out.println("Balance: " + balance);
                }

            } else if (choice == 3) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        bankingSystem();
    }
}