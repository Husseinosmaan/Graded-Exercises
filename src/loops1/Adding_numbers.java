package loops1;

public class Adding_numbers {
    public static void main(String[] args) {
        int counter = 1, sum = 0;
        while (counter <= 10) {
            sum += counter;
            System.out.println(sum);
            counter++;
        }
    }
}
