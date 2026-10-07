package assigment7_6;
import java.util.Scanner;

class restaurantSys {
    public static void restaurantSystem() {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int choice;
        do {
            System.out.println("1. Burger ($5)");
            System.out.println("2. Pizza ($8)");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();
            if (choice == 1) {
                total += 5;
            } else if (choice == 2) {
                total += 8;
            }
        } while (choice != 3);
        System.out.println("Final Bill: $" + total);
    }
    public static void main(String[] args) {
        restaurantSystem();
    }
}