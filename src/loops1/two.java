package loops1;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1 =(int)(Math.random() *10);
        int num2=(int) (Math.random()*10);
        System.out.println("wath is "+num1+"+"+num2+"?");
        int ans= input.nextInt();
        while (num1+num2 !=ans){
            System.out.println("wrong ans try again");
            System.out.println("wath is"+num1+"+"+num2+"?");
            ans = input.nextInt();
        }
        System.out.println("you got it");
    }
}
