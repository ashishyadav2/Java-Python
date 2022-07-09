import java.util.Arrays;

public class searchRange {
    public static void main(String[] args) {
        int[] arr = {2,5,7,7,7,8,8,9};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    static int[] searchRange(int[] arr,int target) {
        int[] ans = {-1,-1};
        ans[0] = binSrch(arr, target,true);
        ans[1] = binSrch(arr, target,false);
        return ans;
    }
    static int binSrch(int[] arr, int target,boolean isStart) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(target==arr[mid]) {
                ans = mid;
                if(isStart) {
                    end = mid-1;
                }
                else {
                    start = mid +1;
                }
            }
            else if(target>arr[mid]) {
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return ans;
    }
}