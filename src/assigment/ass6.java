package assigment;

import java.util.Scanner;
class TempChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = input.nextDouble();

        if (temp > 30) {
            System.out.println("Hot weather");
        } else {
            System.out.println("Normal weather");
        }
    }
}