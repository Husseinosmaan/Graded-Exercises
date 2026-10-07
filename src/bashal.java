import java.util.Scanner;

public class bashal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000;
        System.out.println("1 check balance");
        System.out.println("2 check deposit");
        System.out.println("3 withdraw");
        System.out.print("choose option:");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.print("balance:"+ balance);
                break;
            case 2:
                System.out.print("Enter deposit amount:");
                int deposit = input.nextInt();
                balance = balance + deposit;
                System.out.println("new balance:"+ balance);
                break;
            case 3:
                System.out.print("Enter withdrow amount:");
                int withdraw = input.nextInt();
                if (withdraw <= balance) {
                    balance = balance - withdraw;
                }else  {
                    System.out.println("haragagu kuguma filna");
                }break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

//System.out.println("choose day");
//int day = input.nextInt();
//        switch (day) {
//        case 1:
//        System.out.println("saturday");
//                break;
//                        case 2:
//                        System.out.println("sunday");
//                break;
//                        case 3:
//                        System.out.println("monday");
//                break;
//                        case 4:
//                        System.out.println("tuesday");
//                break;
//                        case 5:
//                        System.out.println("wednesday");
//                break;
//                        case 6:
//                        System.out.println("thursday");
//                break;
//                        case 7:
//                        System.out.println("friday");
//                break;
//default:
//        System.out.println("invalid day");


//  System.out.println("enter area");
//double area = input.nextDouble();
//double radious = 3.9567;
//double area2 = area +area * radious;
//        System.out.println("Area is "+area2);

      // positive & negative num
//        System.out.print("soo gali number:");
//        int num= input.nextInt();
//        if (num >0)
//            System.out.println("number is positive");
//        else if (num<0) {
//            System.out.println("number is negative");
//        }else
//            System.out.println("number is zero");
//
//
//

    // age
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your age :");
//        int age = input.nextInt();
//        System.out.print("Please enter your wihgt :");
//        int wieght = input.nextInt();
//        if (age >= 18 && wieght >=50)
//                System.out.println("eligble");
//        else
//                System.out.println("young");
//    }
//}
