import java.util.Arrays;

public class InsertionSort {
    public static void InsertionSort(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j= i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 1, 4, 2 , 6};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
