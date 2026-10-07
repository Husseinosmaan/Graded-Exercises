package loops1;

public class printing {
    public static void main(String[] args) {
        int counter = 10;
        String result = "";

        while (counter >= 1) {
            result += counter + " ";
            System.out.println(result);
            counter--;
        }
    }
}
