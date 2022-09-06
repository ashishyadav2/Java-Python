public class findKthLargest {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findLargest(nums,k));
    }
    static int findLargest(int[] nums,int k) {
        quicksort(nums,0,nums.length-1);
        return nums[nums.length-k];
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
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
