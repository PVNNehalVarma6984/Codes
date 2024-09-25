package Dsa;

import java.util.*;

public class Maxsubarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int maxi = -99999;
        int sum;
        sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            maxi = Math.max(maxi, sum);
            if (sum < 0) {
                sum = 0;
            }

        }
        System.out.println(maxi);
    }
}
