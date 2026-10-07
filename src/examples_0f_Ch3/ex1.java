package examples_0f_Ch3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lotteryNumber = (int)(Math.random() * 100);
        System.out.print("Enter your guest Number: ");
        int guest  =  input.nextInt();

        int lotteryD1 = lotteryNumber / 10;
        int lotteryD2 = lotteryNumber % 10;

        int guestD1 = guest / 10;
        int guestD2 = guest % 10;
        System.out.println("lottery Number is: " + lotteryNumber);
        if (guest == lotteryNumber)
            System.out.println("Exact match: you win 10,000");
        else if (guestD1 == lotteryD2 && guestD2 == lotteryD1)
            System.out.println("all digits match: you win 3,000");
        else if (guestD1 == lotteryD1 ||
                guestD1 == lotteryD2 ||
                guestD2 == lotteryD1 ||
                guestD2 == lotteryD2)
            System.out.println("One digit match: you win 1,000");
        else
            System.out.println("Sorry not match");
    }
}