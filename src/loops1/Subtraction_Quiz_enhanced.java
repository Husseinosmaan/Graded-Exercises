package loops1;

import java.util.Scanner;

public class Subtraction_Quiz_enhanced {
    public static void main(String[] args) {

        final int NO_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        String output = "";
        long startTime = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);

        while (count < NO_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.printf("What is %d - %d ? ", number1, number2);
        }
    }
}