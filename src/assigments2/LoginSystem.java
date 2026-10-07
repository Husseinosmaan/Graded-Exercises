package assigments2;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String u = input.next();
        System.out.print("Password: ");
        String p = input.next();
        if (u.equals("admin") && p.equals("1234"))
            System.out.println("Login Successful");
        else
            System.out.println("Error: Wrong credentials");
    }
}

