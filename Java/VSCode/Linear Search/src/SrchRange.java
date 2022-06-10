public class SrchRange {
    public static void main(String[] args) {
        int[] arr = {56,23,95,20,69,33};
        System.out.println(srch(arr,69,1,3));
    }
    static int srch(int[] arr,int target,int start,int end) {
        for(int i=start;i<=end;i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}
