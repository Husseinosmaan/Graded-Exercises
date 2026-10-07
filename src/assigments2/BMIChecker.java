package assigments2;

import java.util.Scanner;
public class BMIChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter BMI: ");
        double bmi = input.nextDouble();
        if (bmi < 25)
            System.out.println("Normal or Underweight");
        else
            System.out.println("Overweight or Obese");
    }
}