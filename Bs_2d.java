import java.util.*;

public class Bs_2d {
    public static void main(String[] args) {
        int[][] arr = input();
        System.out.println("Element to be Searched ? ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println("Your value is at" + Arrays.toString(Bs(arr, t)));
    }

    static int[][] input() {
        System.out.println("Enter the num_Of_rows");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter the num_Of_cols");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter matrix elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    static int[] Bs(int[][] arr, int a) {
        int r = 0;
        int c = arr.length - 1;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == a) {
                return new int[] { r, c };
            } else if (arr[r][c] < a) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }

}
