import java.util.*;

public class Digit_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
        } else if (n % 9 == 0) {
            System.out.println(9);
        } else {
            System.out.println(n % 9);
        }

    }
}
