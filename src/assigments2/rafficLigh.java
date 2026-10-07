package assigments2;

import java.util.Scanner;
public class rafficLigh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gali nambarka iftiinka (1: Red, 2: Yellow, 3: Green): ");
        int light = input.nextInt();
        switch (light) {
            case 1: System.out.println("Stop"); break;
            case 2: System.out.println("Ready"); break;
            case 3: System.out.println("Go"); break;
            default: System.out.println("Invalid input");
        }
    }
}
