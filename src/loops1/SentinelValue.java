package loops1;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers to add;");
        System.out.println("press 0 to exit");
        System.out.println("Enter an integer?");
        int number = input.nextInt();
        while (number != 0) {
            sum += number;
            System.out.println("Enter an integer?");
            number = input.nextInt();
        }
        System.out.println("Sum is " + sum);
    }
}
