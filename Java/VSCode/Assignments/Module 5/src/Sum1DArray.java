import java.util.Arrays;

public class Sum1DArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(sum(nums)));
    }
    static int[] sum(int[] nums) {
        int[] ans = {0,0,0,0};
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<=i;j++) {
                ans[i] += nums[j];
            }
        }
        return ans;
    }
}
