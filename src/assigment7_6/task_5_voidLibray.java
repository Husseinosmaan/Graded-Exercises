package assigment7_6;
import java.util.Scanner;

class voidLibray {
    public static void librarySystem() {
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter book name (or exit): ");
            String book = input.nextLine();
            if (book.equalsIgnoreCase("exit")) {
                break;
            }
            count++;
        }
        System.out.println("Total books borrowed: " + count);
    }
    public static void main(String[] args) {
        librarySystem();
    }
}