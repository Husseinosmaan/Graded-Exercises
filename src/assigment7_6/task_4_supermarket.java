package assigment7_6;

import java.util.Scanner;

class supermarket {
    public static void supermarketSystem() {
        Scanner input = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter item price (0 to stop): ");
            double price = input.nextDouble();
            if (price == 0) {
                break;
            } total += price;
        }
        if (total > 100) {
            total = total - (total * 0.10);
        }System.out.println("Total Price: " + total);
    }
    public static void main(String[] args) {
        supermarketSystem();
    }
}
