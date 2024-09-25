package Patterns;

//just check the boundary distances of the rectangle and print the minimun
import java.util.*;

public class rectangle_inside_rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int og = n;
        n = n * 2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int right = n - col;
                int down = n - row;
                int val = og - min(col, row, down, right);
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    static int min(int up, int down, int left, int right) {
        if (up <= down && up <= right && up <= left) {
            return up;
        } else if (right <= up && right <= down && right <= left) {
            return right;
        } else if (left <= up && left <= down & left <= right) {
            return left;
        } else {
            return down;
        }
    }
}
