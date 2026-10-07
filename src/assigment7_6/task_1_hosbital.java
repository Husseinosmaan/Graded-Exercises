package assigment7_6;
import java.util.Scanner;

class hosbital {
    public static void hospitalSystem() {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.print("Enter patient name (or exit): ");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter age: ");
            int age = input.nextInt();
            input.nextLine();
            if (age < 0) {
                System.out.println("Invalid age");
            } else { count++;
            }
        } System.out.println("Total patients: " + count);
    }
    public static void main(String[] args) {
        hospitalSystem();
    }
}
