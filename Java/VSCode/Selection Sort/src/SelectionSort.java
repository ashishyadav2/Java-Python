import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,40,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // static void sort(int[] arr) {
    //     for(int i=0;i<arr.length;i++) {
    //         int last = arr.length-1-i;
    //         int maxIndex = max(arr,0,last);
    //         swap(arr, maxIndex, last);
    //     }
    // }
    // static int max(int[] arr,int start,int end) {
    //     int max = start;
    //     for(int i=start;i<=end;i++) {
    //         if(arr[max]<arr[i]) {
    //             max = i;
    //         }
    //     }
    //     return max;
    // }
    // static void swap(int[] arr,int a,int b){
    //     int temp = arr[a];
    //     arr[a] = arr[b];
    //     arr[b] = temp;
    // }
    static void sort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            int last = arr.length-1-i;
            int maxIndex = 0;
            for(int j=0;j<=last;j++) {
                if(arr[maxIndex]<arr[j]) {
                    maxIndex = j;
                    System.out.println(maxIndex);
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }
}
