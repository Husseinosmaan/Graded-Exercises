package loops1;

import java.util.Scanner;

public class Addition_while {
    public static void main(String[] args) {
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
        Scanner input = new Scanner(System.in);
        System.out.println("This is Addition Quiz " +
                "\n Please answer the following Question");
        System.out.println("What is " + number1 + " + " + number2 + "?");
        int answer = input.nextInt();
        while (answer != number1 + number2) {
            System.out.println("Please try again! "
                    +"What is " + number1 + " + " + number2 + "?");
            answer = input.nextInt();
        }
        System.out.println("You are Great " + number1 + " + "
                + number2 + " is " + answer );
    }
}
