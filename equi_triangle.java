package Patterns;

import java.util.*;

public class equi_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = 2 * n;
        int mid = (n + 1) / 2;
        for (int i = 0; i <= n; i++) {
            if (i <= mid - 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int k = n - i; k != 0; k--) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

    }
}
