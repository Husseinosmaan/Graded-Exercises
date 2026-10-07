import java.util.Scanner;
public class pr12 {
    static void main(){
        Scanner sogali = new Scanner(System.in);
        System.out.println("Enter 4 digits");
        int digits= sogali.nextInt();
        int digits1= digits/1000;
        int digits2=(digits/100)%100;
        int digits3=digits%100/10;
        int digits4=digits%10;
        System.out.println(digits1);
        System.out.println(digits2);
        System.out.println(digits3);
        System.out.println(digits4);
        int sub= digits + digits1 + digits2 + digits3 + digits4;
        System.out.println("ii soo dabac numbrska aad isku dartay" + sub);
    }
}