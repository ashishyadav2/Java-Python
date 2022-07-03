import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        QuickSortt(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSortt(int[] arr,int low, int high) {
        if(low>=high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];
        while(start<=end) {
            while(arr[start]<pivot) {
                start++;
            }
            while(arr[end]>pivot) {
                end--;
            }
            if(start<=end) {
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        QuickSortt(arr, low, end);
        QuickSortt(arr, start, high);
    }
    static void swap(int[] arr,int start,int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}