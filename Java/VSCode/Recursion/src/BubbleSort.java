import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,4,2,1};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int i,int j) {
        if(i==0) {
            return;
        }
        if(j<i) {
            if(arr[j]>arr[j+1]) {
                swap(arr,j,j+1);
            }
            sort(arr, i, j+1);
        }
        else {
            sort(arr, i-1, 0);
        }
    }
    static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
