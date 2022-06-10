public class RotBinSrchRep {
    public static void main(String[] args) {
        int[] arr = {3,3,8,8,8,9,12,0,1,2,2,2};
        int target = 8;
        System.out.println(findPivot(arr));
        System.out.println(search(arr, target));
    }
    static int search(int[] arr,int target) {
        int pivot = findPivot(arr);
        if(pivot == -1) {
            return binsrch(arr, target,0,arr.length-1);
        }
        if(arr[pivot]==target) {
            return pivot;
        }
        if(target>=arr[0]) {
            return binsrch(arr, target, 0, pivot-1);
        }
        
        return binsrch(arr, target, pivot+1, arr.length-1);
    }
    static int binsrch(int[] arr,int target,int start, int end) {
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(target<arr[mid]) {
                end = mid - 1;
            }
            else if(target>arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            if(mid >start && arr[mid-1]>arr[mid]) {
                return mid-1;
            }
            if(arr[mid]==arr[end] && arr[mid]==arr[end]) {
                if(arr[start]>arr[start+1]) {
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]) {
                    return end -1 ;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return - 1;
    }
}
