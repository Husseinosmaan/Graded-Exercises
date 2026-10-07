package loops1;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of student");
        int numOFstudents = input.nextInt();
        System.out.println("enter the number of subject");
        int numOFsubject = input.nextInt();
        for (int J=1; J <=numOFstudents; J++);{
            System.out.println("student number");
            System.out.println("===========");
            int total = 0;
            for (int i=1; i <=numOFsubject; i++){
                System.out.println("enter subject" + i +":");
                int marks = input.nextInt();
                if (marks <0 || marks >100){
                    continue;
                }else
                    total +=marks;
            }
            int avarege = total / numOFsubject;

            System.out.println("the total marks:" +total);
            System.out.println("the total avarege :" +avarege);
            System.out.println();
            if (avarege <25){
                System.out.println("faild");
            }else
                System.out.println("pass");
        }

    }
}
