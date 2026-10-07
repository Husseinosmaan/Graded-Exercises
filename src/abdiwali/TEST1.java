package abdiwali;

import java.util.Scanner;
public class TEST1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter number1:");
        int number1=sc.nextInt();
        System.out.print("enter number2:");
        int number2=sc.nextInt();
        System.out.print("enter number3:");
        int number3=sc.nextInt();
        int sum= number1 + number2 + number3;
        System.out.println("the sum is:"+sum);
    }
}
