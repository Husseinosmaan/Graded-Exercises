package loops1;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int number1,number2,answer;
        final int TOTAL_NUMBERS = 5;
        int correct_answer = 0;
        int attempt = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("This is Addition Quiz with " + TOTAL_NUMBERS + " Attempts " +
                "\n Please answer the following Questions" );
        while (attempt < TOTAL_NUMBERS) {
            number1 = (int) (Math.random() * 10);
            number2 = (int) (Math.random() * 10);
            System.out.println("Question " + (attempt + 1) + " : What is " + number1 + " + " + number2 + "?");
            answer = input.nextInt();
            if (answer == number1 + number2) {
                System.out.println("Correct! \n");
                correct_answer++;
            }
            else {
                System.out.println("Wrong! \n");
            }
            attempt++;
        }
        System.out.println("Quiz is ended!!");
        System.out.println("You answered " + correct_answer
                + " out of " + TOTAL_NUMBERS + " Questions Correctly");
        if (correct_answer > 3) {
            System.out.println("You are great!");
        } else {
            System.out.println("You are not prepared well.");
        }
    }
}
