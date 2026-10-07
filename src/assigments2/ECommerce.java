package assigments2;

import java.util.Scanner;
public class ECommerce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter item price: ");
        double price = input.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = input.nextInt();
        if (qty <= 0) {
            System.out.println("Invalid quantity!");
            return;
        }
        double total = price * qty;
        System.out.print("Are you a premium customer (yes/no)? ");
        String prem = input.next();
        if (total >= 100 && prem.equalsIgnoreCase("yes")) {
            total = total * 0.80; // 20% discount
        } else if (total >= 100) {
            total = total * 0.90; // 10% discount
        }
        System.out.println("Final Bill: $" + total);
    }
}
