public class RotatedBinSrch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,1,2,3};
        int target = 5;
        System.out.println(binSrch(arr, 0, arr.length-1, target));
    }
    static int binSrch(int[] arr,int start,int end,int target) {
        if(start>end) {
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid]==target) {
            return mid;
        }
        if(arr[start]<=arr[mid]) {
            if(target>=arr[start] && target <= arr[mid]) {
                return binSrch(arr, start, mid-1, target);
            }
            else {
                return binSrch(arr, mid+1, end, target);
            }
        }
        if(target>=arr[mid] && target<=arr[end]) {
            return binSrch(arr, mid+1, end, target);
        }
        return binSrch(arr, start, mid-1, target);
    }
}
