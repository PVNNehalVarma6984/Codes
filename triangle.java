package Patterns;

import java.util.*;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size:?");
        int in = sc.nextInt();
        for (int i = 0; i < in; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.printf("\n \n");

        System.out.println("Reversed version");
        for (int i = in; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
