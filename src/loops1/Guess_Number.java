package loops1;

import java.util.Scanner;

public class Guess_Number {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        int guess = -1;
        while (guess != number) {
            System.out.print("\nEnter your Guess: ");
            guess = input.nextInt();
            if (guess == number)
                System.out.println("You guessed the number "
                        + number + ".");
            else if (guess > number)
                System.out.println("You guess is higher than number ");
            else
                System.out.println("You guess is lower than the number ");
        }

    }
}
