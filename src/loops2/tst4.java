package loops2;
import java.util.Scanner;

class palindromTst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.nextLine();
        int first = 0;
        int last = word.length()-1;
        boolean ispalindrome = true;
        while (first < last){
            if (word.charAt(first) != word.charAt(last)){
                ispalindrome=false;
                break;
            }
            first++;
            last--;
        }
        if (ispalindrome)
            System.out.println(word + " is palindrome");
        else
            System.out.println(word + " is Not palindrome");
    }
}
