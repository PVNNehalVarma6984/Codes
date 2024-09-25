import java.util.*;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] a = { 1, 2, 34, 44, 66, 78 };
        System.out.println(Arrays.toString(bubble_sort(a)));
    }

    static int[] bubble_sort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
