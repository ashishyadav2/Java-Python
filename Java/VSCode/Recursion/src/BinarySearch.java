public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,23,30,35,39,40,45};
        int target = 30;
        int ans = binSrch(arr, target,0,arr.length-1);
        System.out.println(ans);
    }
    static int binSrch(int[] arr,int target,int start,int end) {
        if(start>end) {
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]>target) {
            return binSrch(arr, target, start, mid-1);
        }
        if(arr[mid]<target) {
            return binSrch(arr, target, mid +1, end);
        }
        return mid;
    }
}
