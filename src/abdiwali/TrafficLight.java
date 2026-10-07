package abdiwali;

import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Emergency vehicle present? (yes/no): ");
        String em = input.next();
        if (em.equalsIgnoreCase("yes")) {
            System.out.println("Go (Emergency Override)");
            return;
        }
        System.out.println("1.Red  2.Yellow  3.Green");
        System.out.print("Enter light: ");
        int light = input.nextInt();
        switch(light) {
            case 1:
                System.out.println("Stop");
                break;
            case 2:
                System.out.println("Ready");
                break;
            case 3:
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Light");
        }
    }
}