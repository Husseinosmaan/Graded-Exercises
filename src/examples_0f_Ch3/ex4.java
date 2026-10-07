package examples_0f_Ch3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter A year: ");
            int year = input.nextInt();
            if (year % 4 == 0 && year % 100 !=0  || year%400 == 0)
                System.out.println("this " +year + "is a leap year. ");
            else
                System.out.println("this " + year + " is not a leap year.");

        }
    }

