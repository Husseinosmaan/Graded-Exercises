package loops1;

public class Adding_even {
    public static void main(String[] args) {
        int counte = 1, sum = 0;
        while (counte <= 10) {
            if (counte % 2 == 0) {
                sum += counte;
                System.out.println(sum);
            }
            counte++;
        }
    }
}
