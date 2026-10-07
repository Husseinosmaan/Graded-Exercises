package assigments2;

import java.util.Scanner;
public class VoteCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age >= 18)
            System.out.println("waad codeen karta");
        else
            System.out.println("da'da lagu codenaye madan garin");
    }
}