package assigment7_6;
import java.util.Scanner;

class transportationSys {
    public static void transportationSystem() {
        Scanner input = new Scanner(System.in);
        int passengers;
        do {
            System.out.print("Enter passengers (0 to exit): ");
            passengers = input.nextInt();
            if (passengers == 0) {
                break;
            }
            double total = passengers * 5;
            if (passengers > 5) {
                total = total - (total * 0.10);
            }
            System.out.println("Total Price: " + total);
        } while (passengers != 0);
    }
    public static void main(String[] args) {
        transportationSystem();
    }
}