public class Array_2D_Search {
    public static void main(String[] args) {

        int[][] a = { { 1, 1, 2 },
                { 2, 3, 4 },
                { 5, 6, 7 }
        };
        int t = 7;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == t) {
                    System.out.println(t + " Found");
                }
            }

        }
    }

}
