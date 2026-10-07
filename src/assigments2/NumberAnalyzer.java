package assigments2;

import java.util.Scanner;
public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("so gali number: ");
        int n = input.nextInt();
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
        if (n > 0 && n % 2 == 0)
            System.out.println("Special Number");
    }
}
