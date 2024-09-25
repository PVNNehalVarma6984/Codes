package Dsa;

import java.util.*;

public class SortedornotE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int next = -1, c = 0;
        for (int i = 1; i < n; i++) {
            if (next < n - 1) {

                if (arr[i] > arr[i - 1]) {
                    System.out.println("True");
                } else {
                    c++;
                }
                next++;
            }
            if (c > 0) {
                System.out.println("False");
            }

        }
    }
}
