import java.util.*;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println(Arrays.toString(ins(arr)));
    }

    static int[] ins(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

        }
        return arr;
    }
}
