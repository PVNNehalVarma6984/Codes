import java.util.*;

public class binary_search {
    public static void main(String[] args) {
        int[] arr = input();
        System.out.println("Enter the element to be searched");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(Bs(arr, i));
    }

    static int[] input() {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        /* Array object creation */ int[] arr = new int[len];
        System.out.println("Enter the elements");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int Bs(int[] arr, int a) {
        int l = arr.length, f = 1;

        while (f <= l) {
            int m = (l + f) / 2;
            if (arr[m] < a) {
                l = m;

            }

            if (arr[m] > a) {
                f = m + 1;
            } else {
                return m;
            }
        }

        return -1;
    }
}
