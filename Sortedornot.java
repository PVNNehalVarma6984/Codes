package Dsa;

import java.util.*;

public class Sortedornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] >= arr[j]) {

                } else {
                    k++;
                }
            }
        }
        if (k > 0) {
            System.out.println("sorted");
        } else {
            System.out.println("Sorted");
        }
    }
}
