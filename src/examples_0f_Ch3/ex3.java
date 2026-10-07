package examples_0f_Ch3;

import java.util.Scanner;

public class ex3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            if (number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("What is " + number1 +" - " + number2 + " ?");
            System.out.print("entar the answer:");
            int answer = input.nextInt();
            if (number1 - number2 == answer)
                System.out.println("Correct answer");
            else{
                System.out.println("Wrong answer");
                System.out.println(number1 + " - " + number2 + " should be " +
                        (number1 - number2));
            }
        }
    }
