package abdiwali;

import java.util.Scanner;
class SupermarketBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price of item 1: ");
        double pricel = input.nextDouble();
        System.out.print("Enter price of item 2: ");
        double price2 = input.nextDouble();
        double total = pricel + price2;
        System.out.println("Total Bill: $" + total);
    }
}