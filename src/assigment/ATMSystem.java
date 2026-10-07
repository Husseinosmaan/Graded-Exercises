package assigment;
import java.util.Scanner;
public class ATMSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1000.0;

        System.out.print("Enter withdrawal amount: ");
        double amount = input.nextDouble();

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
