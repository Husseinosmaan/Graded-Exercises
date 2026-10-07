import java.util.Scanner;

public class ttt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the marks for subject 1:");
        int n1 = input.nextInt();
        System.out.print("enter the marks for subject 2:");
        int n2 = input.nextInt();
        System.out.print("enter the marks for subject 3:");
        int n3 = input.nextInt();
        double avg = n1 + n2 + n3 /3.0;
        if (n1<50 || n2<50 || n3<50)
            System.out.println("result: fail");
        else
            System.out.println("pass"+avg);
        if (avg>=75)
            System.out.println("DISTINCTION");
        else
            System.out.println("Result: pass");
    }
}