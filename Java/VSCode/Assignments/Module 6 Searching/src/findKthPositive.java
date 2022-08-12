import java.util.ArrayList;

public class findKthPositive {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(missing(arr, k));
    }
    static int missing(int[] arr,int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        int i=0;
        int j=1;
        while(nums.size()<=k) {
            if(i<arr.length && arr[i]==j) {
                i++;
                j++;
                continue;
            }
            nums.add(j);
            j++;
        }
        return nums.get(k-1);
    }
}
