public class mountainArray {
    public static void main(String[] args) {
        int[] arr = {1,5,9,12,6,3,2};
        System.out.println(peakIndex(arr));
    }
    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start<end) {
            int mid  = start + (end-start)/2;
            if(arr[mid]<arr[mid+1]) {
                //ascending order part
                start = mid +1 ;
            }
            else {
                end = mid;
            }
        }
        return arr[start];
    }
}
