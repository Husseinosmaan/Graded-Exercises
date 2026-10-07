package examples_0f_Ch3;

import java.util.Scanner;

public class ex2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number1 = 10, number2 = 5;
            System.out.println("Enter a Sign: ");
            char  op = input.next().charAt(0);
            if (op == '+')
                System.out.println("Result: " + (number1 + number2));
            else if (op == '-')
                System.out.println("Result: " + (number1 - number2));
            else if (op == '*')
                System.out.println("Result: " + (number1 * number2));
            else if (op == '/') {
                if (number2 != 0)
                    System.out.println("Result: " + (number1 / number2));
                else
                    System.out.println("Zero division Error");
            }
            else
                System.out.println("invalid operator");
        }
}
