public class selection_sort {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        arr = sel_sor(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] sel_sor(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int Mini_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[Mini_index]) {
                    Mini_index = j;
                }
            }
            temp = arr[Mini_index];
            arr[Mini_index] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
