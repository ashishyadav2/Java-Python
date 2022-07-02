public class LinSearch {
    public static void main(String[] args) {
        int[] arr = {6,8,4,45,0,2};
        int target = 2;
        System.out.println(linS(arr,target,0));
    }
    static int linS(int[] arr,int target,int index) {
        if(index==arr.length) {
            return -1;
        }
        if(arr[index]==target) {
            return index;
        }
        return linS(arr, target, index+1);
    }
}
