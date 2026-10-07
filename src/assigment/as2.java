package assigment;

import java.util.Scanner;
class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.next();

        System.out.print("Enter password: ");
        String password = input.next();

        if (username.equals("admin")) {
            if (password.equals("1234")) {
                System.out.println("Login successful");
            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("Invalid username");
        }
    }
}