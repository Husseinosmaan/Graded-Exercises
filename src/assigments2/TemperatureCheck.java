package assigments2;

import java.util.Scanner;
public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = input.nextInt();
        if (temp > 30)
            System.out.println("Hot");
        else
            System.out.println("Normal");
    }
}
