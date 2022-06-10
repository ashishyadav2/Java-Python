public class BinSrch {
    public static void main(String[] args) {
        int[] arr ={-9,-2,-1,0,55,66,205,602};
        int target = 55;
        System.out.println("Element found at index "+binsrch(arr,target));
    }
    static int binsrch(int[] arr,int target) {
        int start = 0;
        int end = arr.length -1;
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
}