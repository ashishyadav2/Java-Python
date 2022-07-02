public class SortedArray {
    public static void main(String[] args) {
        // int[] arr= {1,2,3,4,5,6,7};
        int[] arr= {1,2,3,4,5,56,7};
        System.out.println(sortd(arr, 0));
    }
    static boolean sortd(int[] arr,int index) {
        if(index==arr.length-1) {
            return true;
        }
        return arr[index]<arr[index+1] && sortd(arr, index + 1);
    }
}