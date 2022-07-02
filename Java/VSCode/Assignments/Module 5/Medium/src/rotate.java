import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        System.out.println(Arrays.toString(nums(nums,k)));
    }
    static int[] nums(int[] nums,int k) {
        int[] arr = new int[nums.length];
        int j=0;
        for(int i=k;i<nums.length+k;i++) {
            arr[(i)%nums.length]  = nums[j];
            j++;
        }
        return arr;
    }
}
