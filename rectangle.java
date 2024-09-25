package Patterns;

import java.util.*;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size:?");
        int in = sc.nextInt();
        for (int i = 0; i < in; i++) {
            for (int j = 0; j < in; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
