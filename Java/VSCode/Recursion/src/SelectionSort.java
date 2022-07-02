import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {85,4,546,464,6546,40};
        sort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int row,int col,int max) {
        if(row==0) {
            return;
        }
        if(row>col) {
            if(arr[col]>arr[max]) {
                sort(arr, row, col+1, col);
            }
            else {
                sort(arr, row, col+1, max);
            }
        }
        else {
            swap(arr, row-1, max);
            sort(arr, row-1, 0, 0);
        }
    }
    static void swap(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
