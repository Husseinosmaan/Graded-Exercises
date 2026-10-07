import java.util.Scanner;
public class tijabo {
    static void main() {
        Scanner sogali = new Scanner(System.in);
        System.out.println("Enter 4 digits");
        int digits = sogali.nextInt();
        int digits2 = digits / 1000;
        int digits3 = (digits / 10) % 10;
        int digits4 = digits % 10;
        System.out.println(digits2);
        System.out.println(digits3);
        System.out.println(digits4);
        int sub = digits + digits2 + digits3 + digits4;
        System.out.println("the sum of digits is" + sub);
    }
}