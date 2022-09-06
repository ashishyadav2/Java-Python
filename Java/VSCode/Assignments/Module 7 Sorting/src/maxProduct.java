import java.util.Arrays;
public class maxProduct {
    public static void main(String[] args) {
        int[] nums = {1,5,4,5};
        System.out.println(maxproduct(nums));
    }
    static int maxproduct(int[] nums) {
        quicksort(nums,0,nums.length-1);        
        System.out.println(Arrays.toString(nums));
        return ((nums[nums.length-2]-1)*(nums[nums.length-1]-1));
    }
    static void quicksort(int[] arr,int low,int high) {
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
        quicksort(arr,low,end);
        quicksort(arr,start,high);
    }
    static void swap(int[] arr,int a,int b) {
        int temp= arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}