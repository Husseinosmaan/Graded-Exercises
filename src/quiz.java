import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double age=input.nextDouble();
        double wieght =input.nextDouble();
        if(age>18) {
            if (wieght > 50) {
                System.out.println("waad shubi kartaa dhiig");
            }
        }else {
            System.out.println("lagama shubi karo dhiig sababo jiro oged");
        }
    }
}
